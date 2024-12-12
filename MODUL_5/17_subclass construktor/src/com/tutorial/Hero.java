package com.tutorial;

public class Hero {
    // atribut 
    String nama;
    double defencePower;
    double attackPower;

    // construktor
    Hero(String nama, double defencePower, double attackPower){
        this.nama = nama;
        this.defencePower = defencePower;
        this.attackPower = attackPower;

    }

    // method 
    void cetak(){
        System.out.println("Nama : " + this.nama);
        System.out.println("defence power : " + this.defencePower);
        System.out.println("attack power :" + this.attackPower);
    }
}