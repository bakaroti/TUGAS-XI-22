/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bio;

import java.util.Scanner;

/**
 *
 * @author PC1
 */
public class biodat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        
        String nama, alamat, nama2, alamat2;
        int umur, hp, nis, umur2, hp2, nis2;
        double bb, tinggi,bb2, tinggi2;
        char jk, jk2;
        
        System.out.print("NIS\t: ");
        nis = scan.nextInt();
        System.out.print("Nama\t: ");
        nama = scan.next();
        System.out.print("Alamat\t: ");
        alamat = scan.next();
        System.out.print("JenKel\t: ");
        jk = scan.next().charAt(0);
        System.out.print("No HP\t: ");
        hp = scan.nextInt();
        System.out.print("Berat\t: ");
        bb = scan.nextDouble();
        System.out.print("Tinggi\t: ");
        tinggi = scan.nextDouble();
        
        System.out.println("");
        System.out.print("NIS\t: ");
        nis2 = scan.nextInt();
        System.out.print("Nama\t: ");
        nama2 = scan.next();
        System.out.print("Alamat\t: ");
        alamat2 = scan.next();
        System.out.print("JenKel\t: ");
        jk2 = scan.next().charAt(0);
        System.out.print("No HP\t: ");
        hp2 = scan.nextInt();
        System.out.print("Berat\t: ");
        bb2 = scan.nextDouble();
        System.out.print("Tinggi\t: ");
        tinggi2 = scan.nextDouble();
        
        System.out.println("-------------------------------------------------");
        System.out.println("BIODATA SISWA SMKN 24 JAKARTA");
        System.out.println("KELAS XI RPL 2");
        System.out.println("TAHUN 2022");
        System.out.println("-------------------------------------------------");
        
        System.out.println("NIS\tNAMA\tALAMAT\tJENKEL\tNo.HP\tBERAT\tTINGGI");
        System.out.println(nis +"\t"+ nama +"\t"+ alamat +"\t"+ jk +"\t"+ hp +"\t"+ bb +"\t"+ tinggi);
        System.out.println(nis2 +"\t"+ nama2 +"\t"+ alamat2 +"\t"+ jk2 +"\t"+ hp2 +"\t"+ bb2 +"\t"+ tinggi2);
        
        
    }
    
}