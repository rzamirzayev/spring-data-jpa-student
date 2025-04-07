package com.example.starter.dto.Address;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoAddressIU {
    @NotEmpty(message = "Description bos ola bilmez")
    private String description;

}
