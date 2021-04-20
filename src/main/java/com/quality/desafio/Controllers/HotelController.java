package com.quality.desafio.Controllers;

import com.quality.desafio.DTOs.FlightDTO;
import com.quality.desafio.DTOs.HotelDTO;
import com.quality.desafio.Services.HotelServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class HotelController {

    HotelServiceImpl hotelService;

    public HotelController(HotelServiceImpl hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping("/hotels")
    public List<HotelDTO> getFlights(@RequestParam(required = false) String city,
                                     @RequestParam(required = false) Date dateFrom,
                                     @RequestParam(required = false) Date dateTo){return hotelService.hotelsList(city, dateFrom, dateTo);}
}
