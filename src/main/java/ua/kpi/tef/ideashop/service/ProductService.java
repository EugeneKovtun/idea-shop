package ua.kpi.tef.ideashop.service;

import ua.kpi.tef.ideashop.entity.Product;

public interface ProductService {
    Product findById(Long id);

    Iterable<Product> findAll();
}
