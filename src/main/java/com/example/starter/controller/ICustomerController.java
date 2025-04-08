package com.example.starter.controller;

import com.example.starter.dto.Customer.DtoCustomer;
import com.example.starter.dto.Customer.DtoCustomerIU;

public interface ICustomerController {
    public DtoCustomer findCustomerById(Long id);
    public DtoCustomer saveCustomer(DtoCustomerIU dtoCustomer);
}
