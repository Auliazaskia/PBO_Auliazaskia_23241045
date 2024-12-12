package com.tutorial;

public class Player {
    // Atribut 
    private String Name;
    private static int jumlahPlayer;

    // konstruktor 
    // opsi 1 untuk membuat objek
    Player(String Name){
        Player.jumlahPlayer++;
        this.Name = Name;

    }

    // overloading konstruktor 
    // opsi 2 untuk membuat objek
    Player(){
        Player.jumlahPlayer++;
        this.Name = "Player" + Player.jumlahPlayer;
    }

    // method 
    void cetak (){
        System.out.println(" Name : " + this.Name);
    }
    
}
