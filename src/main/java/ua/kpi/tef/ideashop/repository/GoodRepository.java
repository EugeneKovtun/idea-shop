package ua.kpi.tef.ideashop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.kpi.tef.ideashop.entity.Good;

@Repository
public interface GoodRepository extends CrudRepository<Good, Long> {
}
