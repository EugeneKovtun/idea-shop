package ua.kpi.tef.ideashop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import ua.kpi.tef.ideashop.entity.Good;
import ua.kpi.tef.ideashop.service.GoodService;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/good")
public class GoodController {
    private final
    GoodService service;

    @Autowired
    public GoodController(GoodService service) {
        this.service = service;
    }

    @GetMapping
    @ResponseBody
    public Iterable<Good> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Good getById(@PathVariable Long id) {
        try {
            return service.findOne(id);
        } catch (NoSuchElementException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}
