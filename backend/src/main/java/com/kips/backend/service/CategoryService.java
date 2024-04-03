package com.kips.backend.service;

import com.kips.backend.service.dto.CategoryDto;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
//@CrossOrigin("http://localhost:3000/")
public interface CategoryService {
    CategoryDto getById(Integer id);
    List<CategoryDto> getCategories();

    void create(CategoryDto categoryDto);
}
