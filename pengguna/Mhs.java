package pengguna;


public class Mhs extends User {
    private String Nama;
    private String Nim;
    private int Smt;

    public Mhs (String Username, String Password) {
      super("username", "password");  
    }    

    public void setNama(String Nama) {
        this.nama = nama;
    }
    public String getNama() {
        return this.nama = nama;
    }
    public void setNim(String Nim) {
        this.nim = nim;
    }
    public String getNim() {
        return this.nim = nim;
    }
    public void setSmt(int Smt) {
        this.smt = smt;
    }
    public int getSmt() {
        return this.smt =smt;
    }

}