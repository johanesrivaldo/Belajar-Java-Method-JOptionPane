import javax.swing.JOptionPane;

public class BiodataSaya {
    

    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog(null, "Masukkan Nama : ");
        String alamat = JOptionPane.showInputDialog(null, "Masukkan Alamat");

        JOptionPane.showMessageDialog(null, "Nama : "+ nama + "\nAlamat : " + alamat);
    }
}
