package com.jaewoopk.trybank.service;

import com.jaewoopk.trybank.dto.UserDto;

public interface UserService {
    boolean create(UserDto userDto);
    String idCheck(String id);
}
