package ua.kpi.tef.ideashop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.kpi.tef.ideashop.entity.Good;
import ua.kpi.tef.ideashop.service.GoodService;

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
        // TODO: 17/10/18 add exception handler
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Good getById(@PathVariable Long id) {
        return service.findOne(id);
    }
}
