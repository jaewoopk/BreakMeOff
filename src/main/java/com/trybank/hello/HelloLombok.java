package com.trybank.hello;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HelloLombok {
    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("jaewoo");
        helloLombok.setAge(28);
        System.out.println("hello lombok" + helloLombok);
    }
}
