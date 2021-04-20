package com.quality.desafio.Services;

import com.quality.desafio.DTOs.HotelDTO;

import java.util.Date;
import java.util.List;

public interface IHotelService {
    public List<HotelDTO> hotelsList(String city, Date dateFrom, Date dateTo);
}
