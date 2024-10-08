/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pengguna;
/**
 *
 * @author user
 */
public class Pengguna {
    protected String nama; 
    /*
    membuat atribut dengan menggunakan modifer procected.
    alasanya karena agar atribut nama dapat diakses oleh kelas turunan saja(admin dan customer)
    dan juga jika menggunakan privat, sulit untuk diakses dari kelas lain, dan harus memakai getter dan setter,
    begitupun public, namum bedanya di public semua bisa akses dari kelas yang berbeda maupun package.
    */
    
    public Pengguna(String nama) { //konstruktor kelas Pengguna
        this.nama = nama;
    }

}   

