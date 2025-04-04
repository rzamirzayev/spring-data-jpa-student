package com.example.starter.services;

import com.example.starter.dto.DtoCustomer;

public interface ICustomerService {
    public DtoCustomer findCustomerById(Long id);
}
