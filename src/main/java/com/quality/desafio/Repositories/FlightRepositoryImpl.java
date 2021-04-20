package com.quality.desafio.Repositories;

import ch.qos.logback.core.util.DatePatternToRegexUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.quality.desafio.DTOs.FlightDTO;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class FlightRepositoryImpl implements IFlightRepository{

    private List<FlightDTO> flights;

    private List<FlightDTO> loadDataFlights() {
        File file = null;
        try {
            file = ResourceUtils.getFile("classpath:dbFlights.json");

        } catch (Exception e) {
            e.printStackTrace();
        }

        ObjectMapper objectMapper = new ObjectMapper();
        // Tipo de dato que devuelve
        TypeReference<List<FlightDTO>> typeReference = new TypeReference<List<FlightDTO>>() {
        };
        List<FlightDTO> flightsDTOList = null;

        try {
            flightsDTOList = objectMapper.readValue(file, typeReference);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flightsDTOList;
    }

    //@Override
    /*public List<FlightDTO> flightList(String origin, Date dateFrom, Date dateTo) {
        List<FlightDTO> flightDTOList = loadDataFlights();

        if( origin != null) {
            flightDTOList = flightDTOList
                    .stream()
                    .filter((FlightDTO f) -> f.getOrigin().toLowerCase().contains(f.getOrigin()))
                    .collect(Collectors.toList());
        }
        if( dateFrom != null) {
            flightDTOList = flightDTOList
                    .stream()
                    .filter((FlightDTO f) -> f.getDateFrom().contains(f.getDateFrom()))
                    .collect(Collectors.toList());

        }
        if( dateTo != null) {

            flightDTOList = flightDTOList
                    .stream()
                    .filter((FlightDTO f) -> f.getDateTo().contains(f.getDateTo()))
                    .collect(Collectors.toList());

        }

        return flightDTOList;
    }

    private boolean conditions (String origin, Date dateFrom, Date dateTo){

    }*/
}
