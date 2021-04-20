package com.quality.desafio.Repositories;

import com.quality.desafio.DTOs.HotelDTO;

import java.util.Date;
import java.util.List;

public interface IHotelrepository {
    public List<HotelDTO> hotelList(String city, Date dateFrom, Date dateTo);
}
