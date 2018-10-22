package ua.kpi.tef.ideashop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.kpi.tef.ideashop.entity.Product;
import ua.kpi.tef.ideashop.repository.ProductRepository;


@Transactional
@Service
public class ProductServiceImpl implements ProductService {
    private final
    ProductRepository repository;

    // TODO: 17/10/18  add methods for CRUD operations
    // TODO: 17/10/18 refactor services
    @Autowired
    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public Product findOne(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Iterable<Product> findAll() {
        return repository.findAll();
    }
}
