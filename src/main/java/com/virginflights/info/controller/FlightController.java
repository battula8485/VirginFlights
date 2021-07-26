package com.virginflights.info.controller;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;


import com.virginflights.info.dao.FlightDAO;
import com.virginflights.info.model.FlightData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/flights")
public class FlightController
{
    @Autowired
    FlightDAO flightDao;
    
    @GetMapping(path="/{date}", produces = "application/json")
    public HashMap<String, List<FlightData>> getFlightsInfo(@PathVariable String date) throws FileNotFoundException {
        return flightDao.getFlightsInfo(date);

    }

}
