package com.example.demo;

import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
public class Public {

    private String abc;

    private int abc2;

    private String abc3;


    @Builder
    public Public(String abc){

        System.out.println("public abc");
        this.abc="xxx:"+ abc;
    }

    @Builder
    public Public(String abc,int abc2){
        System.out.println("public abc2");
        this.abc=abc;
        this.abc2=abc2;
    }

}
