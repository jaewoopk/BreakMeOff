package com.jaewoopk.trybank.domain.user;

import jakarta.persistence.*;


@Entity
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "USER_ID")
    private Long id;

    @Column(name = "USER_PASSWORD", length = 20, nullable = false)
    private String password;

    @Column(name = "USER_NAME", length = 20, nullable = false)
    private String name;

    @Column(name = "BIRTHDAY", length = 8)
    private String birthday;

    @Column(name = "PHONENUMBER", length = 13)
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "ROLE_CODE")
    private RoleCode roleCode;

    @Enumerated(EnumType.STRING)
    @Column(name = "BANK_CODE")
    private BankCode bankCode;

    // Getter, Setter, Constructors, equals, hashcode, etc...
}

enum RoleCode {
    ADMIN,
    REGULAR_CUSTOMER,
    PREMIUM_CUSTOMER,
    VIP_CUSTOMER,
    BUSINESS_CUSTOMER
}

enum BankCode {
    SINHAN,
    WOORI,
    KOOKMIN,
    HANA,
    KAKAO,
    TOSS,
    NOGHHYEOP,
    JAEIL,
    CITY,
    OEHWAN,
    KIUP
}
