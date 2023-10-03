package com.jaewoopk.trybank.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name="ACCOUNT")
public class Account {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="ACCOUNT_NUMBER", unique=true, nullable=false)
    private String accountNumber;

    @Column(name="ACCOUNT_NAME", nullable=false)
    private String accountName;

    @Column(name="BALANCE", nullable=false)
    private BigDecimal balance;

}
