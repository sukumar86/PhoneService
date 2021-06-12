package com.galvanize.adoption.controller;

import com.galvanize.adoption.model.Phone;
import com.galvanize.adoption.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhoneController {

    @Autowired
    PhoneService service;

    @GetMapping("/contacts")
    public ResponseEntity<Iterable<Phone>> findAllPhoneNos(){
        return new ResponseEntity(service.findAllPhoneNos(), HttpStatus.OK);
    }

//    @PostMapping("/pupper")
//    public void addPupper(@RequestBody Pupper p) {
//        service.addPupper(p);
//    }
}