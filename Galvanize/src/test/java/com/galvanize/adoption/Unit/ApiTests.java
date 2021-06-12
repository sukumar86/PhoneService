package com.galvanize.adoption.Unit;

import com.galvanize.Galvanize.model.Phone;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class ApiTests {

    @Autowired
    private MockMvc mvc;

    @MockBean
    PhoneService service;
//    @Test
//    void getAllPhoneNumbers() throws Exception {
//        List<Phone> phone = new ArrayList<Phone>();
//        phone.add(new Phone("John", "Jason","8881112222"));
//        phone.add(new Phone("Adam", "Ellerbrock","7771112222"));
//
//
////        when(service.find()).thenReturn(puppers);
//
//        mvc.perform(get("/contacts"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("length()").value(2))
//                .andExpect(jsonPath("[0]").value(phone.get(0)))
//                .andExpect(jsonPath("[1]").value(phone.get(1)));
//    }

}
