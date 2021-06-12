package com.galvanize.adoption.Integration;

import com.galvanize.adoption.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class MockedRepoTests {
    @Autowired
    private MockMvc mvc;


    @MockBean
    PhoneRepository repo;

}
