package com.quality.desafio.Controllers;

import com.quality.desafio.DTOs.FlightDTO;
import com.quality.desafio.Repositories.FlightRepositoryImpl;
import com.quality.desafio.Services.FlightServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class FlightController {

    FlightServiceImpl flightService;

    public FlightController(FlightServiceImpl flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/flights")
    public List<FlightDTO> getFlights(@RequestParam(required = false) String origin,
                                      @RequestParam(required = false) Date dateFrom,
                                      @RequestParam(required = false) Date dateTo)
    {
        return flightService.flightsList(origin, dateFrom, dateTo);
    }


}
