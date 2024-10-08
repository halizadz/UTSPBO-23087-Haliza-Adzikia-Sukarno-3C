/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reservasi;

/**
 *
 * @author user
 */
import Pengguna.*; //mengimport semua kelas yang ada di packages pengguna
import java.util.ArrayList; //mengimport library array
import java.util.Scanner; //mengimpor scanner yang fungsinya untuk input bagi pengguna

public class Main {
    public static void main(String[] args) {
        ArrayList<Kamar> daftarKamar = new ArrayList<>(); //menyimpan daftar kamar hotel dalam array list
        ArrayList<Pesanan> daftarPesanan = new ArrayList<>(); //menyimpan daftar pesanan dalam array list

        // Dummy data untuk kamar
        Kamar kamar1 = new Kamar(101, "Deluxe", 500000);
        Kamar kamar2 = new Kamar(102, "Standard", 300000);
        daftarKamar.add(kamar1); //menambahkan kamar1 ke daftar kamar
        daftarKamar.add(kamar2); //menambahkan kamar2 ke daftar kamar

        Scanner scanner = new Scanner(System.in); //membuat objek scanner untuk membaca input dari pengguna

        //menampilkan menu awal
        System.out.println("Selamat datang di Aplikasi Reservasi Hotel!");
        System.out.println("Login sebagai:");
        System.out.println("1. Admin");
        System.out.println("2. Customer");
        

        int pilihan = scanner.nextInt(); //untuk membaca pilhan dari pengguna
        scanner.nextLine(); // Membersihkan buffer input

        if (pilihan == 1) {
            // Login sebagai Admin
            System.out.print("Masukkan username admin: ");
            String usernameA = scanner.nextLine(); //membaca username admin
            
            Admin admin = new Admin (usernameA); //membuat objek admin
            
                System.out.println("Login berhasil sebagai Admin.");
                int opsiAdmin; //variable untuk pilihan menu admin
                do {
                    System.out.println("1. Tambah Kamar");
                    System.out.println("2. Hapus Kamar");
                    System.out.println("3. Ubah Kamar");
                    System.out.println("4. Lihat Semua Pesanan");
                    System.out.println("5. Keluar");

                    opsiAdmin = scanner.nextInt(); //untuk membaca pilihan opsi yang dipilih oleh admin
                    switch (opsiAdmin) {
                        case 1: //jika memilih nomor 1
                            System.out.print("Masukkan nomor kamar: ");
                            int nomorKamar = scanner.nextInt();
                            System.out.print("Masukkan tipe kamar: ");
                            String tipeKamar = scanner.next();
                            System.out.print("Masukkan harga per malam: ");
                            double harga = scanner.nextDouble();
                            Kamar kamarBaru = new Kamar(nomorKamar, tipeKamar, harga);
                            admin.tambahKamar(daftarKamar, kamarBaru);
                            break;
                        case 2: //jika memilih nomor 2
                            System.out.print("Masukkan nomor kamar yang akan dihapus: ");
                            int nomorKamarHapus = scanner.nextInt();
                            for (Kamar kamar : daftarKamar) {
                                if (kamar.getNomorKamar() == nomorKamarHapus) {
                                    admin.hapusKamar(daftarKamar, kamar);
                                    break;
                                }
                            }
                            break;
                        case 3: //jika memilih nomor 3
                            System.out.print("Masukkan nomor kamar yang akan diubah: ");
                            int nomorKamarUbah = scanner.nextInt();
                            for (Kamar kamar : daftarKamar) {
                                if (kamar.getNomorKamar() == nomorKamarUbah) {
                                    System.out.print("Masukkan tipe kamar baru: ");
                                    String tipeBaru = scanner.next();
                                    System.out.print("Masukkan harga baru: ");
                                    double hargaBaru = scanner.nextDouble();
                                    admin.ubahKamar(kamar, tipeBaru, hargaBaru);
                                    break;
                                }
                            }
                            break;
                        case 4: //jika memilih nomor 4
                            admin.lihatSemuaPesanan(daftarPesanan);
                            break;
                        case 5: //jika memilih nomor 5
                            System.out.println("Keluar dari aplikasi.");
                            break;
                        default:
                            System.out.println("Pilihan tidak valid.");
                    }
                } while (opsiAdmin != 5); //looping hinga admin memilih untuk keluar

            

        } else if (pilihan == 2) { 
            // Login sebagai Customer
            System.out.print("Masukkan Username: ");
            String usernameC = scanner.nextLine();
            
            Customer cus = new Customer(usernameC);
           
                System.out.println("Login berhasil sebagai Customer.");
                System.out.println("1. Pesan Kamar");
                System.out.println("2. Lihat Pesanan");
                System.out.println("3. Keluar");

                int opsiCustomer = scanner.nextInt();
                switch (opsiCustomer) {
                    case 1: //jika memilih nomor 1
                        System.out.println("Kamar yang tersedia:");
                        for (Kamar kamar : daftarKamar) { 
                            if (kamar.cekKetersediaan()) { //memeriksa ketersediaan kamar
                                System.out.println("Kamar: " + kamar.getNomorKamar() + " (" + kamar.getTipeKamar() + "), Harga: Rp" + kamar.getHargaPerMalam());
                            }
                        }
                        System.out.print("Pilih nomor kamar: ");
                        int nomorKamarPesan = scanner.nextInt();
                        for (Kamar kamar : daftarKamar) {
                            if (kamar.getNomorKamar() == nomorKamarPesan && kamar.cekKetersediaan()) {
                                kamar.pesanKamar(); //memesan kamar
                                System.out.print("Masukkan lama menginap: ");
                                int lamaMenginap = scanner.nextInt(); //untuk membaca lama menginap
                                //membuat objek pesanan baru
                                Pesanan pesananBaru = new Pesanan("PSN" + (daftarPesanan.size() + 1), usernameC, kamar, lamaMenginap);
                                daftarPesanan.add(pesananBaru); //menambahkan pesanan ke daftar pesanan
                                break;
                            }
                        }
                        break;
                    case 2: //jika memilih nomor 2 
                        for (Pesanan pesanan : daftarPesanan) {
                            if (pesanan.getNamaCustomer().equals(usernameC)) { //memeriksa pemesanan sesuai yang dipesan oleh customer
                                cus.lihatPesanan(pesanan); //menampilkan detail pesanan
                            }
                        }
                        break;
                    case 3:
                         System.out.println("Terima kasih sudah berkunjung dan memesan kamar di hotel kami");
                    default:
                        System.out.println("Pilihan tidak valid.");
                }

            } 
        } 
    }



