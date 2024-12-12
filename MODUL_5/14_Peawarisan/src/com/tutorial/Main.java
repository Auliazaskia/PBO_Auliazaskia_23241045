package com.tutorial;

public class Main {

    public static void main(String[] args) {
        // membuat objek dari superclass
        Hero hero1 = new Hero();
        hero1.nama = "SUN";
        hero1.cetak();

        // membuat objek dari subclass
        HeroStrength hero2 = new HeroStrength();
        hero2.nama = "STAR";
        hero2.cetak();

        HeroIntell hero3 = new HeroIntell();
        hero3.nama = "MOON";
        hero3.cetak();

    }
}