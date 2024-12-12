package com.tutorial;

public class HeroTank extends Hero {
    // overriding 
    double defencePower;

    // overriding method
    void cetak(){
        System.out.println("Hero dari Subclass");
        System.out.println("Hero Tank");
        System.out.println("Hero Nama : " + this.nama);
        System.out.println("Defence Power : " + this.defencePower);

    
    }
    
}
