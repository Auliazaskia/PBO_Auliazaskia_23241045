package com.tutorial;

public class Main {

    public static void main(String[] args) {
        // objek dari superclass
        Hero hero1 = new Hero();
        hero1.nama = "RAIN";
        System.out.println("Hero dari superclass");
        hero1.cetak();

        // membuat objek dari herotank
        HeroTank hero2 = new HeroTank();
        hero2.nama = "FLOWERS";
        hero2.defencePower = 100;
        hero2.cetak();
    }
}