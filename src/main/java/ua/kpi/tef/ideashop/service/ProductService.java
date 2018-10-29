package ua.kpi.tef.ideashop.service;

import ua.kpi.tef.ideashop.entity.Product;
import ua.kpi.tef.ideashop.exception.ItemNotFoundException;

public interface ProductService {
    Product findById(Long id) throws ItemNotFoundException;

    Iterable<Product> findAll();
}
