package com.example.starter.controller;

import com.example.starter.dto.Home.DtoHome;
import com.example.starter.dto.Room.DtoRoom;

import java.util.List;

public interface IHomeController {
    public DtoHome findByIdHome(Long id);
    public List<DtoHome> findAllHomes();
}
