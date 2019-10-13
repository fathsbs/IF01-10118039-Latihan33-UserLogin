
import java.util.Scanner;

/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program untuk Log in  
 */

public class Main {

    private static String uname;
    private static String pass;
    public static void main(String[] args) {
        User login = new User();
        Scanner masuk = new Scanner(System.in);
        
        System.out.print("Masukkan Usernama anda\t= ");
        uname = masuk.next();
        System.out.print("Masukkan Password\t= ");
        pass = masuk.next();
        
        login.pengecekkanLogin(uname, pass);
    }

}
