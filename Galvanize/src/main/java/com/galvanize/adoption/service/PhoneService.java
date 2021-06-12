package com.galvanize.adoption.service;

import com.galvanize.adoption.model.Phone;
import com.galvanize.adoption.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneService {

    @Autowired
    PhoneRepository repo;

    public List<Phone> findAllPhoneNos() {
        return repo.findAll();
    }

    public void addPhone(Phone p) {
        repo.save(p);
    }
}