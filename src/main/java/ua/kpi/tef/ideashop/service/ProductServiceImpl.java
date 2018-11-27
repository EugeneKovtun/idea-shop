package ua.kpi.tef.ideashop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.kpi.tef.ideashop.entity.Product;
import ua.kpi.tef.ideashop.exception.ItemNotFoundException;
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
    public Product findById(Long id) throws ItemNotFoundException {
        Optional<Product> optionalProduct = repository.findById(id);
        if (optionalProduct.isPresent()) {
            return optionalProduct.get();
        } else {
            throw new ItemNotFoundException("Item with id " + id + " does not exist");
        }

    }

    @Override
    public Iterable<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public Product save(Product product) {
        return repository.save(product);
    }

    @Override
    public boolean deleteById(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
