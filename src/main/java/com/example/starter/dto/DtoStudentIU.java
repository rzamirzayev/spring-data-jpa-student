package com.example.starter.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoStudentIU {
    @NotEmpty(message = "Firstname bos ola bilmez")
    @Min(value = 3,message = "Firstname en az 3 herf olmalidir")
    @Max(value = 10,message = "Firstname en cox 10 herf olmalidir")
    private String firstName;

    @NotEmpty(message = "Surname bos ola bilmez")
    @Min(value = 3,message = "Lastname en az 3 herf olmalidir")
    @Min(value = 10,message = "Lastname en cox 10 herf olmalidir")
    private String lastName;

    @NotEmpty(message = "Birthday bos ola bilmez")
    private String dateOfBirth;

}
