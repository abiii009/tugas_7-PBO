// Class ini menerima 3 parameter tipe generic: N (NIM), A (Nama), C (Class/Umur)
public class Mahasiswa<N, A, C> {
    private N nim;
    private A name;
    private C clas;

    // Setter Methods
    public void setNim(N nim) {
        this.nim = nim;
    }

    public void setName(A name) {
        this.name = name;
    }

    public void setClas(C clas) {
        this.clas = clas;
    }

    // Getter Methods
    public N getNim() {
        return nim;
    }

    public A getName() {
        return name;
    }

    public C getClas() {
        return clas;
    }
}