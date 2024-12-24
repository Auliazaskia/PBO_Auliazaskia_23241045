package BangunDatar;

public class PersegiPanjang extends BangunDatar{
    // atribut
    private float Panjang;
    private float Lebar;

    public PersegiPanjang(float Panjang, float Lebar){
        this.Panjang = (Panjang >= 0) ? Panjang : 0; // Menangani Panjang Negatif
        this.Lebar = (Lebar >= 0) ? Lebar : 0; // Menangani Lebar Negatif
    }

    public float luas(){
        return Panjang * Lebar; // L = panjang = 4, lebar = 6
    }

    public float keliling(){
        return 2 * (Panjang + Lebar); // K = 2 (panjang = 6, lebar = 8)
    }
    
}
