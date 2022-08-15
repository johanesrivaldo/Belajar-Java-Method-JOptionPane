/**
 * main
 */
import javax.swing.*;

public class datamahasiswa {


  public static void main(String[] args) {
    
    String nama  =JOptionPane.showInputDialog(null, "Masukan Nama :");
    String alamat =JOptionPane.showInputDialog(null, "Masukan Alamat :");
    String input1 =JOptionPane.showInputDialog(null, "Nilai Matematika: ");
    String input2 =JOptionPane.showInputDialog(null, "Nilai Bahasa Indonesia :");
   
    int NilaiMtk = Integer.parseInt(input1);
    int nilaiBhsIndonesia = Integer.parseInt(input2);

    double nilai  =(NilaiMtk / nilaiBhsIndonesia);
    JOptionPane.showMessageDialog(null,"Nama :" + nama + "\nAlamat : " + alamat + "\nRata-rata Nilai : "+ nilai);

  }

  }

    

  