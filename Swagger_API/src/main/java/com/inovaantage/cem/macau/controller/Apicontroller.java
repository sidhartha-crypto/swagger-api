package com.inovaantage.cem.macau.controller;

import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
public class Apicontroller {

      private int ca_no; 
      private int meter_no;
      

    @GetMapping(value = "/getdata", produces = "application/json")
    public ResponseEntity<String> getData() {
         JSONObject obj = new JSONObject(); 
         obj.put("ca_no", ca_no);
         obj.put("meter_no", meter_no);
         return ResponseEntity.ok(obj.toString()); 
    }

}