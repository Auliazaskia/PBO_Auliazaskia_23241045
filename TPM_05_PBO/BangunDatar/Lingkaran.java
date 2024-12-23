package BangunDatar;

public class Lingkaran extends BangunDatar{
    // atribut
    private float r;

    public Lingkaran(float r){
        this.r = (r >= 0)? r : 0; // menangani (r) = jari-jari negatif
    }

    public float luas(){
        return(float) (Math.PI * r * r); // (r) = jari-jari // (phi) = 355/113
    }

    public float keliling(){
        return(float) (2 * Math.PI * r); // (r) = jari-jari // (phi) = 355/113, // (2) = diameter lingkaran
    }
    
}
