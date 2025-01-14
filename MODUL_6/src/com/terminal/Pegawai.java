package com.terminal;

public class Pegawai {
        // Superclass
    private String nama; //private berarti variabel ini hanya dapat diakses dari dalam kelas PegawaiTetap. 
                        //String adalah tipe data untuk teks. Variabel ini akan menyimpan nama pegawai.

    private double gajiPokok; //double adalah tipe data untuk angka desimal (floating-point). 
                            //Variabel ini akan menyimpan gaji pokok pegawai.

    private double gajiBersih; //double adalah tipe data untuk angka desimal. 
                              //Variabel ini akan menyimpan hasil perhitungan gaji bersih.

    public Pegawai(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public String getNama() {
        return nama;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public double getGajiBersih() {
        return gajiBersih;
    }

    protected void setGajiBersih(double gajiBersih) {
        this.gajiBersih = gajiBersih;
    }
}