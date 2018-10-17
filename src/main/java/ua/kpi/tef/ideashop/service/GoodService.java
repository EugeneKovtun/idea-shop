package ua.kpi.tef.ideashop.service;

import ua.kpi.tef.ideashop.entity.Good;

public interface GoodService {
    Good findOne(Long id);

    Iterable<Good> findAll();
}
