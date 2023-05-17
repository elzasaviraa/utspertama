import pengguna.User;
import pengguna.Mhs;

class Main {
    public static void main(String[] args) {
        
        Mhs mhs = new Mhs("username", "password");

        mhs.setNama("Elza Savira Hanindyantika");
        mhs.setNim("G.111.20.0048");
        mhs.setSmt(6);

        System.out.println("Nama Mahasiswa: " + mhs.getNama());
        System.out.println("Nim Mhs: " + mhs.getNim());
        System.out.println("Smt Mhs: " + mhs.getSmt());

        User mahsiswa = new User("elza savira", "xyz123");
    
    System.out.println("Username :" + mahsiswa.getUsername());
    System.out.println("Password :" + mahsiswa.getPassword());
    }
}