/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reservasi;

/**
 *
 * @author user
 */
import java.util.ArrayList;

public class Kamar{
    private int nomorKamar; //untuk menyimpan nomor unik setiap kamar
    private String tipeKamar; // menyimpan tipe kamar
    private double hargaPerMalam; //menyimpan harga per malam
    private boolean tersedia; // menyimpan ketersediaan

    public Kamar(int nomorKamar, String tipeKamar, double hargaPerMalam) { //konstruktor 
        this.nomorKamar = nomorKamar; 
        this.tipeKamar = tipeKamar;
        this.hargaPerMalam = hargaPerMalam;
        this.tersedia = true; // Default kamar tersedia
    }

    public boolean cekKetersediaan() { // metode untuk memeriksa ketersediaan kamar
        return tersedia; //mengembalikkan status ketersediaan
    }

    public void pesanKamar() { //metode untuk memesan kamar
        if (tersedia) { //memeriksa apakah kamar tersedia
            tersedia = false; //untuk menandai kamar sebagai tidak tersedia
            System.out.println("Kamar berhasil dipesan."); //menampilkan pesan keberhasilan
        } else { //jika kamar tidak tersedia maka pesan yang keluar adalah ini
            System.out.println("Kamar sudah dipesan.");
        }
    }

    public void batalPesan() { //metode untuk membatalkan pesanan
        if (!tersedia) { //memeriksa apakah pesanan sudah dipesan atau belum
            tersedia = true; //jika sudah dipesan, mengembalikkan status kamar menjadi tersedia
            System.out.println("Pesanan dibatalkan."); 
        } else {//jika belum pesan yang keluar adalah 'kamar belum dipesan'
            System.out.println("Kamar belum dipesan.");
        }
    }

    public String getTipeKamar() { //getter untuk medapatkan tipe kamar
        return tipeKamar; //mengembalikkan tipe kamar
    }

    public double getHargaPerMalam() { //getter untuk mendapatkan harga per malan
        return hargaPerMalam; //mengembalikkan harga per malam
    }

    public int getNomorKamar() { //getter untuk mendapatkan nomor kamar
        return nomorKamar; //mengembalikkan nomor kamar
    }

    public boolean isTersedia() { //getter untuk memeriksa apakah masih tersedia atau tidak
        return tersedia; //mengembalikkan ketersediaan kamar
    }

    public void setTipeKamar(String tipeKamar) { //setter untuk mengubah tipe kamar
        this.tipeKamar = tipeKamar; //mengubah tipe kamar
    }

    public void setHargaPerMalam(double hargaPerMalam) { //setter untuk mengubah harga per malam
        this.hargaPerMalam = hargaPerMalam; //mengubah harga per malam
    }
}


