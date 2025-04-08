package com.example.starter.services;

import com.example.starter.dto.Customer.DtoCustomer;
import com.example.starter.dto.Customer.DtoCustomerIU;

public interface ICustomerService {
    public DtoCustomer findCustomerById(Long id);
    public DtoCustomer SaveCustomer(DtoCustomerIU dtoCustomer);
}
