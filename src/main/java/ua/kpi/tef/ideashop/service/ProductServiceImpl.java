package ua.kpi.tef.ideashop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;
import ua.kpi.tef.ideashop.entity.Product;
import ua.kpi.tef.ideashop.repository.ProductRepository;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    private final
    ProductRepository repository;

    // TODO: 17/10/18  add methods for CRUD operations
    @Autowired
    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public Product findById(Long id) throws ResponseStatusException {
        Optional<Product> optionalProduct = repository.findById(id);
        if (optionalProduct.isPresent()) {
            return optionalProduct.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Product with id " + id + " not exist");
        }

    }

    @Override
    public Iterable<Product> findAll() {
        return repository.findAll();
    }
}
