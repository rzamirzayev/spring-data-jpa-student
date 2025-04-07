package com.example.starter.services;

import com.example.starter.dto.Home.DtoHome;

import java.util.List;

public interface IHomeService {
    public DtoHome findById(Long id);
    public List<DtoHome> findAll();
}
