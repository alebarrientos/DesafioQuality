package com.quality.desafio.Services;

import com.quality.desafio.DTOs.FlightDTO;
import com.quality.desafio.Repositories.FlightRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class FlightServiceImpl implements IFlightService{

    FlightRepositoryImpl flightRepository;

    public FlightServiceImpl(FlightRepositoryImpl flightRepository) {
        this.flightRepository = flightRepository;
    }

    @Override
    public List<FlightDTO> flightsList(String origin, Date dateFrom, Date dateTo) {
        return flightRepository.flightList(origin, dateFrom, dateTo);
    }

}
