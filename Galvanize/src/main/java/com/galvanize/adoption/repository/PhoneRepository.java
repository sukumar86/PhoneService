package com.galvanize.adoption.repository;

import com.galvanize.adoption.model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone, String> {
}


