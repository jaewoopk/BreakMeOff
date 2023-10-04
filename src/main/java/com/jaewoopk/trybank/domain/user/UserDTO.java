package com.jaewoopk.trybank.domain.user;

public class UserDTO {
    private Long userId;
    private String password;
    private String name;
    private String birthday;
    private String phoneNumber;
    private String roleCode;
    private String bankCode;

    // 기본 생성자
    public UserDTO() {}

    // 모든 필드를 초기화하는 생성자
    public UserDTO(Long userId, String password,
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

    // Getter & Setter 메서드들
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }
}
