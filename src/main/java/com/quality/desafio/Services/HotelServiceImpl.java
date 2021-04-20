package com.quality.desafio.Services;

import com.quality.desafio.DTOs.HotelDTO;
import com.quality.desafio.Repositories.HotelRepositoryImpl;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Service
public class HotelServiceImpl implements IHotelService{

    HotelRepositoryImpl hotelRepository;

    public HotelServiceImpl(HotelRepositoryImpl hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public List<HotelDTO> hotelsList(String city, Date dateFrom, Date dateTo) {
        return hotelRepository.hotelList(city, dateFrom, dateTo);
    }
}
