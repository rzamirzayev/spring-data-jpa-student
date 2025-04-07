package com.example.starter.dto.Address;

import com.example.starter.dto.Customer.DtoCustomer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoAddress {
    private Long id;
    private String description;
    private DtoCustomer customer;
}
