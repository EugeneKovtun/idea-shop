package ua.kpi.tef.ideashop.service;

import ua.kpi.tef.ideashop.entity.Product;

public interface ProductService {
    Product findOne(Long id);

    Iterable<Product> findAll();
}
