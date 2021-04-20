package com.quality.desafio.DTOs;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
public class FlightDTO implements Serializable {
    private String flightNumber;
    private String origin;
    private String destination;
    private String seatType;
    private Double price;
    @JsonFormat(pattern="dd/MM/yyyy")
    private Date dateFrom;
    @JsonFormat(pattern="dd/MM/yyyy")
    private Date dateTo;

    public FlightDTO() {
    }
}
