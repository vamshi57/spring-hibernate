package com.vamshi.service;

import java.util.List;

import com.vamshi.dto.PassengerDto;

public interface RegistractionService {
       String batchinsert(List<PassengerDto> listDto);
}
