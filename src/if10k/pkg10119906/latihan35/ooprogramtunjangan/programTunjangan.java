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
public class programTunjangan {
    private String status;
    private double gajiPokok, totalGaji, tunjangan;
    Scanner scanner = new Scanner(System.in);
    
    public String getStatus() {
        System.out.print("Status Anda? (Menikah/Belum)\t\t: ");
        status = scanner.next();
        return status;
    }
    public Double getGajiPokok() {
        System.out.print("Berapa Gaji Pokok Anda Perbulan?\t: Rp. ");
        gajiPokok = scanner.nextDouble();
        return gajiPokok;
    }
    public Double hitungTunjangan(String status){
        tunjangan= (status.equals("Menikah"))? 0.35 * gajiPokok : 0;
        return tunjangan;
    }
    public Double setTotal() {
        totalGaji = tunjangan + gajiPokok;
        return totalGaji;
    }
}
