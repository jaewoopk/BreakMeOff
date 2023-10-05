package com.jaewoopk.trybank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jaewoopk.trybank.dto.UserDto;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserDao userDao;

    @Override
    public boolean create(UserDto userDto) {
        return userDao.create(userDto);
    }

    @Override
    public String emailCheck(String email) {
        return userDao.emailCheck(email);
    }
}