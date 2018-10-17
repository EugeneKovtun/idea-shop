package ua.kpi.tef.ideashop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.kpi.tef.ideashop.entity.Good;
import ua.kpi.tef.ideashop.repository.GoodRepository;

import java.util.List;


@Transactional
@Service
public class GoodServiceImpl implements GoodService {
    private final
    GoodRepository repository;

    // TODO: 17/10/18  add methods for CRUD operations
    // TODO: 17/10/18 refactor services
    @Autowired
    public GoodServiceImpl(GoodRepository repository) {
        this.repository = repository;
    }

    @Override
    public Good findOne(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Iterable<Good> findAll() {
        return repository.findAll();
    }
}
