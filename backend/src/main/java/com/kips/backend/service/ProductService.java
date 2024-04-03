package com.kips.backend.service;

import com.kips.backend.service.request.ProductRequest;
import com.kips.backend.service.dto.ProductDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
//@CrossOrigin("http://localhost:3000/")
public interface ProductService {
    void save(ProductRequest dto);

    ProductDto getById(Integer id);

    List<ProductDto> getProducts();

    Page<ProductDto> getProductPage(Pageable pageable);

    void deleteById(Integer id);
}
