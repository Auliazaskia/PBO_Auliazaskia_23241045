package com.terminal; //package menspesifikasikan lokasi kode dalam struktur proyek Java. 
                     //com.terminal menunjukkan bahwa kelas ini berada di dalam paket com.terminal.

// Kelas Utama
public class Main { 
    public static void main(String[] args) {
        // Pegawai tetap
        PegawaiTetap pegawaiTetap = new PegawaiTetap("Jul", 5000000);
        pegawaiTetap.setDurasiLembur(10);
        pegawaiTetap.hitungGajiBersih();

        // Pegawai tidak tetap
        PegawaiTidakTetap pegawaiTidakTetap = new PegawaiTidakTetap("Nita", 3000000);
        pegawaiTidakTetap.setDurasiLembur(5);
        pegawaiTidakTetap.hitungGajiBersih();

        // Tampilkan hasil dari Pegawai Tetap
        System.out.println("Pegawai Tetap:");
        System.out.println("Nama: " + pegawaiTetap.getNama());
        System.out.println("Gaji Pokok: " + pegawaiTetap.getGajiPokok());
        System.out.println("Tunjangan: " + pegawaiTetap.getTunjangan());
        System.out.println("Durasi Lembur (jam): " + pegawaiTetap.getDurasiLembur());
        System.out.println("Gaji Bersih: " + pegawaiTetap.getGajiBersih());

        // Tampilan hasil dari Pegawai Tidak Tetap 
        System.out.println("Pegawai Tidak Tetap:");
        System.out.println("Nama: " + pegawaiTidakTetap.getNama());
        System.out.println("Gaji Pokok: " + pegawaiTidakTetap.getGajiPokok());
        System.out.println("Durasi Lembur (jam): " + pegawaiTidakTetap.getDurasiLembur());
        System.out.println("Gaji Bersih: " + pegawaiTidakTetap.getGajiBersih());
    }
}
