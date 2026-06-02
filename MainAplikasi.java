package com.pbo.project; // 1. IMPLEMENTASI PACKAGE

import java.util.ArrayList; // Mengimport Collection ArrayList

// ==========================================
// 2. IMPLEMENTASI INTERFACE
// ==========================================
interface SistemInformasi {
    void kirimNotifikasi(String pesan);
}

// ==========================================
// 3. IMPLEMENTASI ABSTRACT CLASS & ENCAPSULATION
// ==========================================
abstract class Anggota {
    // Encapsulation: menggunakan modifier private
    private String id;
    private String nama;

    // Constructor
    public Anggota(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    // Getter dan Setter (Encapsulation)
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    // Abstract Method yang wajib diimplementasikan oleh subclass
    public abstract void tampilkanProfil();
}

// ==========================================
// 4. IMPLEMENTASI INHERITANCE & POLIMORFISME
// ==========================================
class MahasiswaAktif extends Anggota implements SistemInformasi {
    private String jurusan;

    // Constructor MahasiswaAktif memanggil constructor superclass (Anggota)
    public MahasiswaAktif(String id, String nama, String jurusan) {
        super(id, nama);
        this.jurusan = jurusan;
    }

    // Polimorfisme (Method Overriding dari Abstract Class Anggota)
    @Override
    public void tampilkanProfil() {
        System.out.println("ID: " + getId() + " | Nama: " + getNama() + " | Jurusan: " + this.jurusan);
    }

    // Implementasi Method dari Interface SistemInformasi
    @Override
    public void kirimNotifikasi(String pesan) {
        System.out.println("[NOTIFIKASI MAHASISWA - " + getNama() + "]: " + pesan);
    }
}

// ==========================================
// 5. IMPLEMENTASI GENERIC CLASS & COLLECTION
// ==========================================
// Class Generic 'DataGrup' dibatasi hanya untuk objek turunan 'Anggota'
class DataGrup<T extends Anggota> {
    private String namaGrup;
    // Menggunakan Collection ArrayList di dalam Generic Class
    private ArrayList<T> listAnggota = new ArrayList<>();

    public DataGrup(String namaGrup) {
        this.namaGrup = namaGrup;
    }

    public void tambahAnggota(T anggota) {
        listAnggota.add(anggota);
        System.out.println(anggota.getNama() + " dimasukkan ke dalam grup " + namaGrup);
    }

    public void cetakSemuaProfil() {
        System.out.println("\n--- DAFTAR ANGGOTA GRUP " + namaGrup.toUpperCase() + " ---");
        for (T anggota : listAnggota) {
            anggota.tampilkanProfil(); // Polimorfisme berjalan dinamis di sini
        }
    }
}

// ==========================================
// 6. MAIN CLASS (EKSEKUSI PROGRAM)
// ==========================================
public class MainAplikasi {
    public static void main(String[] args) {
        System.out.println("=== MEMULAI APLIKASI MANAGEMENT AKADEMIK ===\n");

        // Pembuatan objek konkret mahasiswa (Class & Object)
        MahasiswaAktif mhs1 = new MahasiswaAktif("2026001", "Ferdi", "Informatika");
        MahasiswaAktif mhs2 = new MahasiswaAktif("2026002", "Siti", "Sistem Informasi");

        // Instansiasi Class Generic dengan parameter tipe MahasiswaAktif
        DataGrup<MahasiswaAktif> grupPBO = new DataGrup<>("Kelas PBO");

        // Memasukkan data objek ke dalam koleksi grup
        grupPBO.tambahAnggota(mhs1);
        grupPBO.tambahAnggota(mhs2);

        // Menampilkan seluruh profil anggota yang terdaftar (Polimorfisme + Collection)
        grupPBO.cetakSemuaProfil();

        System.out.println("\n--- UJI COBA INTERFACE ---");
        // Memanggil fungsi interface
        mhs1.kirimNotifikasi("Tugas Praktikum Generic & Collection telah dirilis!");
    }
}