package com.example.starter.services.impl;

import com.example.starter.dto.Home.DtoHome;
import com.example.starter.dto.Room.DtoRoom;
import com.example.starter.entities.Home;
import com.example.starter.entities.Room;
import com.example.starter.repository.HomeRepository;
import com.example.starter.services.IHomeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HomeServiceImpl implements IHomeService {
    @Autowired
    private HomeRepository homeRepository;
    @Override
    public DtoHome findById(Long id) {
        DtoHome dtoHome = new DtoHome();

    Optional<Home> optional= homeRepository.findById(id);

     if(optional.isEmpty()) return null;

     Home home = optional.get();
     List<Room> dbRooms=optional.get().getRoom();
     BeanUtils.copyProperties(home,dtoHome);

     if(dbRooms!=null && !dbRooms.isEmpty()){
         for(Room room:dbRooms){
             DtoRoom dtoRoom = new DtoRoom();
             BeanUtils.copyProperties(room,dtoRoom);
             dtoHome.getRooms().add(dtoRoom);
         }
     }
     return dtoHome;

    }
}
