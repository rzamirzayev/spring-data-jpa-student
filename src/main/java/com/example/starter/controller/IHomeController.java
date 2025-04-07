package com.example.starter.controller;

import com.example.starter.dto.Home.DtoHome;
import com.example.starter.dto.Room.DtoRoom;

public interface IHomeController {
    public DtoHome findByIdHome(Long id);
}
