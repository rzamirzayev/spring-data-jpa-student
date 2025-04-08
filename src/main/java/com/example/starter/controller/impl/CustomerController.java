package com.example.starter.controller.impl;

import com.example.starter.controller.ICustomerController;
import com.example.starter.dto.Customer.DtoCustomer;
import com.example.starter.dto.Customer.DtoCustomerIU;
import com.example.starter.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("rest/api/customer")
public class CustomerController implements ICustomerController {
    @Autowired
    private ICustomerService customerService;

    @Override
    @GetMapping(path = "/list/{id}")
    public DtoCustomer findCustomerById(@PathVariable(name = "id") Long id) {
        return customerService.findCustomerById(id);
    }

    @PostMapping(path = "/save")
    @Override
    public DtoCustomer saveCustomer(@RequestBody DtoCustomerIU dtoCustomer) {
        return customerService.SaveCustomer(dtoCustomer);
    }
}
