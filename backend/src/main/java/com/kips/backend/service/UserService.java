package com.kips.backend.service;

import com.kips.backend.service.dto.UserDto;
import org.springframework.web.bind.annotation.CrossOrigin;

//@CrossOrigin("http://localhost:3000/")
public interface UserService {
    UserDto whoAmI();

    UserDto updateProfile(UserDto userDto);
}
