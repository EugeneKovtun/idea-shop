package ua.kpi.tef.ideashop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.kpi.tef.ideashop.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
