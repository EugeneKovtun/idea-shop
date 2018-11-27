package ua.kpi.tef.ideashop.service;

import org.springframework.transaction.annotation.Transactional;
import ua.kpi.tef.ideashop.entity.Product;
import ua.kpi.tef.ideashop.exception.ItemNotFoundException;

public interface ProductService {
    Product findById(Long id) throws ItemNotFoundException;

    Iterable<Product> findAll();

    Product save(Product product);

    @Transactional
    boolean deleteById(Long id);
}
