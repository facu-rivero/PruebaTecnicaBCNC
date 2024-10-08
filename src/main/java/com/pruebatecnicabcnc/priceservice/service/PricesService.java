package com.pruebatecnicabcnc.priceservice.service;

import com.pruebatecnicabcnc.priceservice.dto.PricesDto;
import java.time.LocalDateTime;


public interface PricesService {

    PricesDto getPrice(LocalDateTime applicationDate, Long productId, Long brandId);
}
