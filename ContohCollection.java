import java.util.ArrayDeque;
import java.util.ArrayList;

public class ContohCollection {
    public static void main(String[] args) {
        
        // ==========================================
        // A. IMPLEMENTASI ARRAYLIST
        // ==========================================
        System.out.println("=== IMPLEMENTASI ARRAYLIST ===");
        ArrayList<String> daftarMahasiswa = new ArrayList<>();
        
        // Menambahkan data ke ArrayList
        daftarMahasiswa.add("Ferdi");
        daftarMahasiswa.add("Andi");
        daftarMahasiswa.add("Siti");
        
        // Menampilkan data menggunakan For-Each Loop
        for (String mhs : daftarMahasiswa) {
            System.out.println("Nama Mahasiswa: " + mhs);
        }
        
        // ==========================================
        // B. IMPLEMENTASI ARRAYDEQUE (FIFO - Queue)
        // ==========================================
        System.out.println("\n=== IMPLEMENTASI ARRAYDEQUE ===");
        ArrayDeque<String> antreanKTM = new ArrayDeque<>();
        
        // Menambahkan elemen dari belakang antrean
        antreanKTM.addLast("Antrean 1 (Budi)");
        antreanKTM.addLast("Antrean 2 (Lani)");
        antreanKTM.addLast("Antrean 3 (Candra)");
        
        System.out.println("Kondisi Awal Antrean: " + antreanKTM);
        
        // Melihat elemen terdepan tanpa menghapusnya
        System.out.println("Elemen paling depan: " + antreanKTM.peekFirst());
        
        // Memproses dan menghapus elemen dari depan (First-In, First-Out)
        System.out.println("Diproses & Keluar: " + antreanKTM.pollFirst());
        System.out.println("Diproses & Keluar: " + antreanKTM.pollFirst());
        
        // Menampilkan sisa antrean akhir
        System.out.println("Sisa Antrean Akhir : " + antreanKTM);
    }
}