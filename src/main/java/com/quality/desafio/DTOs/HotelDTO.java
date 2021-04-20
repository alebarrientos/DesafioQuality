package com.quality.desafio.DTOs;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
public class HotelDTO implements Serializable {
    private String codeHotel;
    private String name;
    private String city;
    private String roomType;
    private Double nightPrice;
    @JsonFormat(pattern="dd/MM/yyyy")
    private Date dateTo;
    @JsonFormat(pattern="dd/MM/yyyy")
    private Date dateFrom;
    private Boolean reserved;

    public HotelDTO() {
    }
}
