package com.example.starter.dto.Address;

import com.example.starter.dto.Customer.DtoCustomer;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DtoAddress {
    private Long id;
    private String description;
    private DtoCustomer customer;
}
