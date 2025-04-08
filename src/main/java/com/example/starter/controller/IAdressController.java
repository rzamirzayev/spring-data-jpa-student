package com.example.starter.controller;

import com.example.starter.dto.Address.DtoAddress;

public interface IAdressController {
 public DtoAddress findAddressById(Long id);
}
