package com.terminal;

    // Subclass untuk Pegawai Tidak Tetap
class PegawaiTidakTetap extends Pegawai { // class adalah kata kunci untuk mendeklarasikan sebuah kelas. 
                                         //Semua kode di dalam kurung kurawal {} merupakan bagian dari kelas ini.

    private int durasiLembur; // 

    public PegawaiTidakTetap(String nama, double gajiPokok) {
        super(nama, gajiPokok);
    }

    public void setDurasiLembur(int durasiLembur) {
        this.durasiLembur = durasiLembur;
    }

    public int getDurasiLembur() {
        return durasiLembur;
    }
     
    // menghitung GajiBersih pegawai tidak tetap
    public void hitungGajiBersih() {
        double lembur = durasiLembur * (0.05 * getGajiPokok());
        setGajiBersih(getGajiPokok() + lembur);
    }
}
