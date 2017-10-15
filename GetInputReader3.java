import javax.swing.JOptionPane;

public class GetInputReader3{
    public static void main(String[] args){
        String nim, nama, tempat, tgllahir;

        nama = JOptionPane.showInputDialog("Inputkan Nama Anda : ");
        nim = JOptionPane.showInputDialog("Inputkan NIM Anda   : ");
        tempat = JOptionPane.showInputDialog("Inputkan Tempat Lahir Anda      : ");
        tgllahir = JOptionPane.showInputDialog("Inputkan Tanggal Lahir Anda   : ");

       String msg = "hello " + nama + "\ndengan NIM "+ nim + "\nLahir\t" + tempat + tgllahir ;
       JOptionPane.showMessageDialog(null,msg);
    }
}