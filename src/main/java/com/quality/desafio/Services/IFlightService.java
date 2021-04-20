package com.quality.desafio.Services;

import com.quality.desafio.DTOs.FlightDTO;

import java.util.Date;
import java.util.List;

public interface IFlightService {
    public List<FlightDTO> flightsList(String origin, Date dateFrom, Date dateTo);
}
