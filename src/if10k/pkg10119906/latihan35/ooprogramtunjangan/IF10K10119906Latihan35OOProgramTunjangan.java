/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan35.ooprogramtunjangan;

import java.util.Scanner;

/**
 *
 * @author senenngahenen
 * Nama     : Rizqy Ananda Rusmana
 * NIM      : 10119906
 * Kelas    : IF-10K
 */
public class IF10K10119906Latihan35OOProgramTunjangan {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        programTunjangan user = new programTunjangan();
        
        System.out.println("==========Program Tunjangan==========");
	Double gpUser = user.getGajiPokok();
	String statusUser = user.getStatus();
        Double tunjanganUser = user.hitungTunjangan(statusUser);
        Double totalGaji = user.setTotal();
        
        System.out.println("\n========Hasil Perhitungan Gaji Anda========");
        System.out.printf("Gaji Pokok\t\t: Rp %.1f%n",gpUser);
        System.out.printf("Tunjangan\t\t: Rp %.1f%n",tunjanganUser);
        System.out.printf("Total Gaji\t\t: Rp %.1f%n",totalGaji);
        System.out.println("(Developed by: Rizqy Ananda Rusmana)");
    }
    
}
