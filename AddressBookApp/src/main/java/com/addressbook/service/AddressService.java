package com.addressbook.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AddressService {

    // testing if service layer is working
    public String serviceTest() {
        log.info("in service test");
        return "This is from Service layer";
    }
}
