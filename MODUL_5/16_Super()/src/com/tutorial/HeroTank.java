package com.tutorial;

public class HeroTank extends Hero{
    // atribut baru 
    String nama = "class Hero Tank";

    // overriding methog
    void cetak(){
        System.out.println("ini adalah " + super.nama);
        this.dummyMethod();

    }
}
