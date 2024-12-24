package BangunDatar;

public class Persegi extends BangunDatar{
        // atribut
        private float sisi;
    
        public Persegi(float sisi){
            this.sisi = (sisi >= 0) ? sisi : 0; // menangani sisi negatif
        }
    
        public float luas(){
            return sisi*sisi; // 10 = nilai sisi (nilai sisi sama)
        }
    
        public float keliling(){
            return 4*sisi;   // (4) = panjang sisi
        }
    }