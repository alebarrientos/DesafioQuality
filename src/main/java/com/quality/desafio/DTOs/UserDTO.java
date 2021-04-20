package com.quality.desafio.DTOs;

import lombok.Data;

import java.util.Date;

@Data
public class UserDTO {

    private String dni;
    private String name;
    private String lastname;
    private Date birthDate;
    private String mail;
}
