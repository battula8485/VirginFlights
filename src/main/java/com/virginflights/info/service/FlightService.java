package com.virginflights.info.service;

import com.opencsv.bean.CsvToBeanBuilder;
import com.virginflights.info.model.FlightBean;
import com.virginflights.info.model.FlightData;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class FlightService {
    public static HashMap<String, List<FlightData>> getFlightsInfo(String date) throws FileNotFoundException {

        String fileName = "src/main/resources/FlightInformation.csv";
        List<FlightBean> beans = new CsvToBeanBuilder(new FileReader(fileName))
                .withType(FlightBean.class)
                .build()
                .parse();

        HashMap<String, List<FlightData>> flightsInfo = new HashMap<>();
        ArrayList<FlightData> sundayList = new ArrayList<>();
        ArrayList<FlightData> mondayList = new ArrayList<>();
        ArrayList<FlightData> tuesdayList = new ArrayList<>();
        ArrayList<FlightData> wednesdayList = new ArrayList<>();
        ArrayList<FlightData> thursdayList = new ArrayList<>();
        ArrayList<FlightData> fridayList = new ArrayList<>();
        ArrayList<FlightData> saturdayList = new ArrayList<>();
        for (FlightBean flightBean : beans) {
            if (!flightBean.getSunday().isEmpty() && !flightBean.getSunday().equalsIgnoreCase("Sunday")) {
                FlightData flightData = new FlightData();
                flightData.setDepartureTime(flightBean.getDepartureTime());
                flightData.setDestination(flightBean.getDestination());
                flightData.setDestinationAirportIATA(flightBean.getDestinationAirportIATA());
                flightData.setFlightNo(flightBean.getFlightNo());
                sundayList.add(flightData);
            }
            if(!flightBean.getMonday().isEmpty() && !flightBean.getMonday().equalsIgnoreCase("Monday")){
                FlightData flightData = new FlightData();
                flightData.setDepartureTime(flightBean.getDepartureTime());
                flightData.setDestination(flightBean.getDestination());
                flightData.setDestinationAirportIATA(flightBean.getDestinationAirportIATA());
                flightData.setFlightNo(flightBean.getFlightNo());
                mondayList.add(flightData);
            }
            if(!flightBean.getTuesday().isEmpty() && !flightBean.getTuesday().equalsIgnoreCase("Tuesday")){
                FlightData flightData = new FlightData();
                flightData.setDepartureTime(flightBean.getDepartureTime());
                flightData.setDestination(flightBean.getDestination());
                flightData.setDestinationAirportIATA(flightBean.getDestinationAirportIATA());
                flightData.setFlightNo(flightBean.getFlightNo());
                tuesdayList.add(flightData);
            }
            if(!flightBean.getWednesday().isEmpty() && !flightBean.getWednesday().equalsIgnoreCase("Wednesday")){
                FlightData flightData = new FlightData();
                flightData.setDepartureTime(flightBean.getDepartureTime());
                flightData.setDestination(flightBean.getDestination());
                flightData.setDestinationAirportIATA(flightBean.getDestinationAirportIATA());
                flightData.setFlightNo(flightBean.getFlightNo());
                wednesdayList.add(flightData);
            }
            if(!flightBean.getThursday().isEmpty() && !flightBean.getThursday().equalsIgnoreCase("Thursday")){
                FlightData flightData = new FlightData();
                flightData.setDepartureTime(flightBean.getDepartureTime());
                flightData.setDestination(flightBean.getDestination());
                flightData.setDestinationAirportIATA(flightBean.getDestinationAirportIATA());
                flightData.setFlightNo(flightBean.getFlightNo());
                thursdayList.add(flightData);
            }
            if(!flightBean.getFriday().isEmpty() && !flightBean.getFriday().equalsIgnoreCase("Friday")){
                FlightData flightData = new FlightData();
                flightData.setDepartureTime(flightBean.getDepartureTime());
                flightData.setDestination(flightBean.getDestination());
                flightData.setDestinationAirportIATA(flightBean.getDestinationAirportIATA());
                flightData.setFlightNo(flightBean.getFlightNo());
                fridayList.add(flightData);
            }
            if(!flightBean.getSaturday().isEmpty() && !flightBean.getSaturday().equalsIgnoreCase("Saturday")){
                FlightData flightData = new FlightData();
                flightData.setDepartureTime(flightBean.getDepartureTime());
                flightData.setDestination(flightBean.getDestination());
                flightData.setDestinationAirportIATA(flightBean.getDestinationAirportIATA());
                flightData.setFlightNo(flightBean.getFlightNo());
                saturdayList.add(flightData);
            }
        }

        switch(date.toUpperCase()){
            case "SUNDAY": flightsInfo.put("Sunday", sundayList);
                break;
            case  "MONDAY": flightsInfo.put("Monday", mondayList);
                break;
            case  "TUESDAY": flightsInfo.put("Tuesday", tuesdayList);
                break;
            case  "WEDNESDAY": flightsInfo.put("Wednesday", wednesdayList);
                break;
            case  "THURSDAY": flightsInfo.put("Thursday", thursdayList);
                break;
            case  "FRIDAY": flightsInfo.put("Friday", fridayList);
                break;
            case  "SATURDAY": flightsInfo.put("Saturday", saturdayList);
                break;
        }

        return flightsInfo;
    }
}
