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
    @Enumerated(EnumType.STRING)
    @Column(name = "ROLE_CODE")
    private RoleCode roleCode;

    @Enumerated(EnumType.STRING)
    @Column(name = "BANK_CODE")
    private BankCode bankCode;
}
