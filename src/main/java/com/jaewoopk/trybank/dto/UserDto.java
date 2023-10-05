package com.jaewoopk.trybank.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserDto {
    private Long userId;
    private String password;
    private String name;
    private String birthday;
    private String phoneNumber;
    private String roleCode;
    private String bankCode;

    // 기본 생성자
    public UserDto() {

    }

    // 모든 필드를 초기화하는 생성자
    public UserDto(Long userId, String password,
                   String name, String birthday,
                   String phoneNumber, String roleCode,
                   String bankCode) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.roleCode = roleCode;
        this.bankCode = bankCode;
    }
}
