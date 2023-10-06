package com.jaewoopk.trybank.events;

import com.jaewoopk.trybank.domain.user.User;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

import com.jaewoopk.trybank.dto.UserDto;

@Component
@RepositoryEventHandler(User.class)
public class UserEventHandler {

    // 사용자가 생성되기 전에 실행될 로직
    @HandleBeforeCreate
    public void handleUserCreate(User user) {
        //UserDto userDTO = new UserDto(user);
        // 예를 들어, 생성 전에 비밀번호를 암호화
        String encryptedPassword = " ";// 비밀번호 암호화 로직
        //user.setPassword(encryptedPassword);

    }

    // 사용자 정보가 수정되기 전에 실행될 로직
    @HandleBeforeSave
    public void handleUserUpdate(User user) {
        // 예를 들어, 수정 전에 특정 검증을 수행
//        if (user.getPassword().isEmpty()) {
//            throw new RuntimeException("Password cannot be empty");
//        }
    }
}
