package com.jaewoopk.trybank.exceptions;

public class UserException extends Exception {

    private static final long serialVersionUID = 1L;  // Serializable 클래스의 버전 ID (권장사항)

    // 기본 생성자
    public UserException() {
        super();
    }

    // 메시지를 전달받는 생성자
    public UserException(String message) {
        super(message);
    }

    // 메시지와 원인 예외를 전달받는 생성자
    public UserException(String message, Throwable cause) {
        super(message, cause);
    }

    // 원인 예외만 전달받는 생성자
    public UserException(Throwable cause) {
        super(cause);
    }
}

