package com.tutorial;

public class HeroTank extends Hero{
    // atribut 
    String atribut = "Tank";

    // construktor di dalam subclass
    HeroTank(String nama, double defence, double attack){
        super(nama, defence, attack);
    }

    // overridinng cetak()
    void cetak(){
        System.out.println("Hero : " + this.atribut);
        super.cetak();
    }
    
}
