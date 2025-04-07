package com.example.starter.services;

import com.example.starter.dto.Home.DtoHome;

public interface IHomeService {
    public DtoHome findById(Long id);
}
