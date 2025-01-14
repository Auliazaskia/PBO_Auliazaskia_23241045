package com.terminal;

    // Subclass untuk Pegawai Tetap
class PegawaiTetap extends Pegawai { // class adalah kata kunci untuk mendeklarasikan sebuah kelas. 
                                    //Semua kode di dalam kurung kurawal {} merupakan bagian dari kelas ini.

    private double tunjangan; // int adalah tipe data untuk angka bulat. 
                            //Variabel ini akan menyimpan jumlah jam lembur.
                            
    private int durasiLembur;

    public PegawaiTetap(String nama, double gajiPokok) {
        super(nama, gajiPokok);
        this.tunjangan = 0.7 * gajiPokok;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setDurasiLembur(int durasiLembur) {
        this.durasiLembur = durasiLembur;
    }

    public int getDurasiLembur() {
        return durasiLembur;
    }

    // menghitung GajiBersih pegawai tetap
    public void hitungGajiBersih() {
        double lembur = durasiLembur * (0.01 * getGajiPokok());
        setGajiBersih(getGajiPokok() + tunjangan + lembur);
    }

}