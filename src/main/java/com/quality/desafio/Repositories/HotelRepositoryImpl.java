package com.quality.desafio.Repositories;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.quality.desafio.DTOs.HotelDTO;
import com.quality.desafio.Exceptions.cityDoesNotExist;
import com.quality.desafio.Utils.dateValidate;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Repository
public class HotelRepositoryImpl implements IHotelrepository{

    private List<HotelDTO> hotels;

    private List<HotelDTO> loadDataHotels() {
        File file = null;
        try {
            file = ResourceUtils.getFile("classpath:dbHotels.json");

        } catch (Exception e) {
            e.printStackTrace();
        }

        ObjectMapper objectMapper = new ObjectMapper();
        // Tipo de dato que devuelve
        TypeReference<List<HotelDTO>> typeReference = new TypeReference<List<HotelDTO>>() {
        };
        List<HotelDTO> hotelsDTOList = null;

        try {
            hotelsDTOList = objectMapper.readValue(file, typeReference);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hotelsDTOList;
    }

    @Override
    public List<HotelDTO> hotelList(String city, Date dateFrom, Date dateTo) {
        List<HotelDTO> hotelDTOList = loadDataHotels();
        return hotelDTOList;
    }

    private boolean conditionsFilters(String city, String dateFrom, String dateTo) {
        if (cityExist(hotels, city)){

        }
    }
    private boolean conditions

    private boolean cityExist(List<HotelDTO> hotels, String city) {
        return (hotels.stream().map(HotelDTO::getCity).filter(hotelCity -> hotelCity.equals(city)).findAny().isEmpty());
    }
}
