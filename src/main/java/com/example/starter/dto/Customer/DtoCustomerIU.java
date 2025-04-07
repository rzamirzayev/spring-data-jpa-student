package com.example.starter.dto.Customer;

import com.example.starter.dto.Address.DtoAddressIU;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class DtoCustomerIU {
    @NotEmpty(message = "name bos ola bilmez")

    private String name;

    @NotEmpty(message = "Address bos ola bilmez")
    private DtoAddressIU address;

}
