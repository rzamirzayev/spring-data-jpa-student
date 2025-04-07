package com.example.starter.dto.Home;

import com.example.starter.dto.Room.DtoRoom;
import com.example.starter.entities.Room;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoHome {
    private Long id;
    private BigDecimal price;

    private List<DtoRoom> rooms=new ArrayList<>();
}

