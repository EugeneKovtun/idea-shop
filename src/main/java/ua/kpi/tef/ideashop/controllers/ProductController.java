package ua.kpi.tef.ideashop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import ua.kpi.tef.ideashop.entity.Product;
import ua.kpi.tef.ideashop.exception.ItemNotFoundException;
import ua.kpi.tef.ideashop.service.ProductService;

import javax.validation.Valid;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final
    ProductService service;

    @Autowired
    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    @ResponseBody
    public Iterable<Product> getAll() {
        return service.findAll();
    }

    /**
     * @param id - id of product which we are looking for
     * @return Product if it's found, else return http status 404 (not found)
     */

    @GetMapping("/{id}")
    @ResponseBody
    public Product getById(@PathVariable Long id) {
        try {
            return service.findById(id);
        } catch (ItemNotFoundException ex) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, ex.getMessage());
        }
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Product createProduct(@ModelAttribute @Valid Product product) {
        return service.save(product);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteProductById(@PathVariable Long id) {
        if (service.deleteById(id)) {
            return new ResponseEntity(HttpStatus.ACCEPTED);
        } else {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
    }

}
