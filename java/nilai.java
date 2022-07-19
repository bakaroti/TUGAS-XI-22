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
public class nilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        String nama, kelas;
        int tugas, uh, pts, pas,total;
        
        System.out.print("NAMA\t: ");
        nama = scan.next();
        System.out.print("KELAS\t: ");
        kelas = scan.next();
        System.out.print("TUGAS\t: ");
        tugas = scan.nextInt();
        System.out.print("UH\t: ");
        uh = scan.nextInt();
        System.out.print("PTS\t: ");
        pts = scan.nextInt();
        System.out.print("PAS\t: ");
        pas = scan.nextInt();
        
        total = (2*tugas + 2*uh + 1*pts + 1*pas) / 6;
        System.out.println("\nNilai  " + nama +" kelas "+ kelas +" Adalah: "+total);
    }
    
}
