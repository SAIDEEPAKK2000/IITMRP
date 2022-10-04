package com.airline.api.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
 
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.airline.api.model.Airline;

import java.util.List;
@FeignClient(value = "gorest", url = "https://api.instantwebtools.net/v1")
public interface ApiClient {
    @RequestMapping(method = RequestMethod.GET, value = "/passenger")
    List<Airline> readAirLines();
    @RequestMapping(method = RequestMethod.GET, value = "/passenger/{passengerId}")
    Airline readAirLineById(@PathVariable("passengerId") String passengerId);
}