public class Mahasiswaku {
    public static void main(String[] args) {
        // Instansiasi objek generic yang sudah diperbaiki dari soal awal
        Mahasiswa<String, String, Integer> m = new Mahasiswa<>();
        
        m.setNim("1102020");
        m.setName("Ferdi");
        m.setClas(21);

        // Menampilkan data ke konsol
        System.out.println(m.getNim());
        System.out.println(m.getName());
        System.out.println(m.getClas());
    }
}