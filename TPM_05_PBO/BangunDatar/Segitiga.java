package BangunDatar;

public class Segitiga extends BangunDatar {
    // atribut
    private float alas;
    private float tinggi;

    public Segitiga(float alas, float tinggi){
        this.alas = (alas >= 0) ? alas : 0; // menangani alas negatif
        this.tinggi = (tinggi >= 0) ? tinggi : 0; // menangani tinggi negatif
    }

    public float luas(){
        return 0.5f * alas * tinggi; // rumus = L = 0,5*a*t, 
                                    //jadi 0,5 bagian dari rumus, a = alas, t = tinggi
    }

    // Perhitungan keliling membutuhkan panjang ketiga sisi. Contoh ini mengasumsikan 
    //segitiga sama kaki untuk penyederhanaan. Solusi yang lebih umum membutuhkan parameter tambahan.
    public float keliling(){
        // Teorema Pythagoras untuk segitiga sama kaki
        float sisiMiring = (float) Math.sqrt(alas * alas / 4 + tinggi * tinggi); // untuk mencari sisi miring 
        return alas + 2 * sisiMiring; // untuk hasil keliling segitiga 
    }
    
}
