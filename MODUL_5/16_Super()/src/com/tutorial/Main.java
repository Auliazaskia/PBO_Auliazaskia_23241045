package com.tutorial;

public class Main {

    public static void main(String[] args) {
        // membuat objek 
        Hero hero1 = new Hero();
        // membuat objek dari subclass
        HeroTank hero2 = new HeroTank();


        hero1.cetak();
        hero2.cetak();

        
    }
}