package com.quality.desafio.Utils;

import com.quality.desafio.Exceptions.invalidDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class dateValidate
{
    public dateValidate() {
    }


    public static Date dateOfString(String fechaString){
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/YYYY");
        Date fecha = null;
        try {
            fecha = formater.parse(fechaString);
            LocalDate.parse(fechaString, formater);
        } catch (ParseException e) {
            throw new invalidDate(fechaString + " is invalid");
        }

    }
}
