/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reservasi;

/**
 *
 * @author user
 */
public class Pesanan implements DetailPesanan { //mengimplementasikan interface DetailPesanan
    private String nomorPesanan;// menyimpan nomor unik untuk setiap pesanan
    private String namaCustomer; //menyimpan nama customer
    private Kamar kamar; //menyimpan objek kamar yang dipesan
    private int lamaMenginap; // menyimpan jumlah hari yang ingin dipesan 

    public Pesanan(String nomorPesanan, String namaCustomer, Kamar kamar, int lamaMenginap) { //konstruktor 
        this.nomorPesanan = nomorPesanan; //inisialisasi nomor pesanan
        this.namaCustomer = namaCustomer; //inisialisasi nama customer
        this.kamar = kamar; //inisialisasi objek kamar
        this.lamaMenginap = lamaMenginap; //inisialisasi lama menginap
    }

    public void tampilkanDetailPesanan() { //metode untuk menampilkan pesanan
        System.out.println("Nomor Pesanan: " + nomorPesanan); //menampilkan nomor pesanan
        System.out.println("Nama Customer: " + namaCustomer); //menampilkan nama customer
        System.out.println("Kamar: " + kamar.getNomorKamar() + " (" + kamar.getTipeKamar() + ")"); //menampilkan nomor dan tipe kamar
        System.out.println("Lama Menginap: " + lamaMenginap + " malam"); //menampilkan lama menginap
        System.out.println("Total Biaya: Rp" + (kamar.getHargaPerMalam() * lamaMenginap)); //menghitung dan menampilkan total biaya bedasarkan harga per malam yang dipilih
    }

    public String getNamaCustomer() { //getter untuk mendapatkan nama customer
        return namaCustomer; //mengembalikkan nama customer
    }

    public Kamar getKamar() { //getter untuk mendapatkan objek kamar yang dipesan
        return kamar; //mengembalikkan objek kamar
    }
}