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
import java.util.ArrayList; 
/*
Mengimpor library untuk menyimpan daftar objek kamar dan pesanan.
Memakai library ini memudahkan dalam pengelolaan data kamar, tetapi bisa memastikan program bisa mudah diubah.
*/

public class Admin extends Pengguna { //inherence pengguna
    public Admin(String nama) {
        super(nama); // memanggil konstraktor kelas pengguna
    }

    public void tambahKamar(ArrayList<Kamar> daftarKamar, Kamar kamar) { // metode untuk menambahkan objek kamar ke dalam daftar kamar yang dikelola oleh admin
        daftarKamar.add(kamar); //menambahkan objek kamar baru ke daftar
        System.out.println("Kamar " + kamar.getNomorKamar() + " berhasil ditambahkan."); // mencetak pesan setelah kamar berhasil ditambahkan
        
    }

    public void hapusKamar(ArrayList<Kamar> daftarKamar, Kamar kamar) { // metode untuk menghapus objek kamar yang ingin dihapus
        daftarKamar.remove(kamar); //menghapus objek kamar yang ingin dihapus
        System.out.println("Kamar " + kamar.getNomorKamar() + " berhasil dihapus."); //mencetak pesan setelah kamar berhasil dihapus
    }

    public void ubahKamar(Kamar kamar, String tipeBaru, double hargaBaru) { // metode untuk mengubah detail objek kamar
        kamar.setTipeKamar(tipeBaru); //mengubah tipe kamar dengan tipe yang sudah diubah
        kamar.setHargaPerMalam(hargaBaru); //mengubah harga per malam dengan harga yang baru
        System.out.println("Data kamar " + kamar.getNomorKamar() + " berhasil diubah."); //mencetak pesan konfirmasi setelah data berhasil diubah
    }

    public void lihatSemuaPesanan(ArrayList<Pesanan> daftarPesanan) { //metode untuk melihat semua pesanan
        if (daftarPesanan.isEmpty()) { //memeriksa apakah pesanan kosong atau tidak
            //jika kosong akan mencetak pesan ini
            System.out.println("Tidak ada pesanan yang terdaftar.");
        } else { //jika tidak kosong akan mencetak pesan ini
            for (Pesanan pesanan : daftarPesanan) { 
                pesanan.tampilkanDetailPesanan();//menampilkan detail untuk setiap pesanan
                System.out.println("-----------------------");
            }
        }
    }
}
    