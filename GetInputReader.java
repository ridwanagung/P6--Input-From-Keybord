import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetInputReader{
    public static void main(String[] args)throws IOException{
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String nim="", nama="", tempat="", tgllahir="";

        System.out.println("Masukan Nama Anda :");
        nama = dataIn.readLine();

        System.out.println("Masukan NIM Anda :");
        nim = dataIn.readLine();

        System.out.println("Masukan tempat lahir Anda :");
        tempat = dataIn.readLine();

        System.out.println("Masukan tanggal lahir Anda :");
        tgllahir = dataIn.readLine();

        System.out.println("");
        System.out.println("------------------------");
        System.out.println("------------------------");
        System.out.println("Selamat datang " + nama);
        System.out.println("NIM  : " +nim);
        System.out.println("Tempat Lahir    : " + tempat);
        System.out.println("Tanggal Lahir   : " + tgllahhir);
    }
}