package com.example.starter.services;

import com.example.starter.dto.Address.DtoAddress;

public interface IAddressService {
    public DtoAddress findAddressById(Long id);
}
