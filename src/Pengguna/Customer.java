/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pengguna;
import Reservasi.*;
/**
 *
 * @author user
 */
public class Customer extends Pengguna { //inherence dari kelas pengguna
    public Customer(String nama) {
        super(nama);// memanggil konstruktor kelas induk(pengguna)
        
    }
 public void lihatPesanan(Pesanan pesanan) {
        pesanan.tampilkanDetailPesanan();
    }  

}