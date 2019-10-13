/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program untuk Log in   
 */

/**
 *
 * @author Fatahillah Seno
 */
public class User {

    private String username;
    private String password;
    private boolean status;

    private boolean cekAkun(String parUsername, String parPassword) {
        username = "RizkiAdam";
        password = "terbaikselalu";

        status = parUsername.equals(username) && parPassword.equals(password);
        return status;
    }

    private void hasilLogin(boolean status, String parUsername) {
        if (status == true) {
            System.out.printf("\n******Hallo %s******", parUsername.toUpperCase());
            System.out.println("\nSelamat datang di aplikasi ini");
        } else {
            System.out.println("\nOoops, username atau password anda salah");
        }
    }
    
    public void pengecekkanLogin(String parUsername, String parPassword){
        cekAkun(parUsername, parPassword);
        hasilLogin(status, parUsername);
    }

}
