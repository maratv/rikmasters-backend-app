package com.vakhitov.driversandaccounts.service;

import com.vakhitov.driversandaccounts.model.Category;
import com.vakhitov.driversandaccounts.model.Driver;
import com.vakhitov.driversandaccounts.repository.DriverRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.yaml.snakeyaml.external.biz.base64Coder.Base64Coder;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class DriverServiceImplTest {

    private final String FULL_NAME = "name secondName";
    private final String PASSPORT = "4008123456";

    private final String PASSPORT64 = "NDAwODEyMzQ1Ng==";
    private final Category CATEGORY = Category.B;

    @InjectMocks
    private DriverServiceImpl driverService;

    @Mock
    private DriverRepository driverRepository;

    DriverServiceImplTest() {
    }



    @Test
    void saveNewDriverTest() {
        Driver driver = driverService.saveNewDriver(FULL_NAME, PASSPORT, CATEGORY);

        assertEquals(FULL_NAME, driver.getFullName());

        assertEquals(PASSPORT, Base64Coder.decodeString(driver.getPassport()));

    }


    @BeforeEach
    void setUp() {
        initDriverService();
    }


    public void initDriverService() {

        Mockito.when(driverRepository.save(Mockito.any())).thenReturn(Driver.builder()
                .fullName(FULL_NAME)
                .passport(PASSPORT64)
                .category(CATEGORY)
                .build()
        );

    }


}



