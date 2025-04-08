package com.example.starter.controller.impl;

import com.example.starter.controller.IHomeController;
import com.example.starter.dto.Home.DtoHome;
import com.example.starter.services.IHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("rest/api/home")
public class HomeController implements IHomeController {

    @Autowired
    private IHomeService homeService;

    @Override
    @GetMapping(path = "/list/{id}")
    public DtoHome findByIdHome(@PathVariable(name = "id") Long id) {
        return homeService.findById(id);
    }

    @Override
    @GetMapping(path = "/list")
    public List<DtoHome> findAllHomes() {
        return homeService.findAll();
    }

}
