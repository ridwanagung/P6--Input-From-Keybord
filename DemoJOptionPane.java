import javax.swing.JOptionPane;

public class DemoJOptionPane{
    public static void main(String[] args){
        String nama;

        nama = JOptionPane.showInputDialog("Inputkan Nama Anda : ");
        String msg = "hello" + nama + "!";
        JOptionPane.showMessageDialog(null,msg);
    }
}