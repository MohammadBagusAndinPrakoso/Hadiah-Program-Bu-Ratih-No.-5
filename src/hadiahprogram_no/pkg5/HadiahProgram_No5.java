/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hadiahprogram_no.pkg5;

import java.util.Scanner;

/**
 *
 * @author MOKLET1
 */
public class HadiahProgram_No5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[]menu = {"X", "Tempe", "Tahu Pong", "Ayam Bakar 1 ekor", "Ayam Goreng 1 ekor", "Ikan Crispy 1 ekor"};
        int[]harga = {0, 7000, 9000, 25000, 23000, 20000};
        
        System.out.println("Menu Makanan");
        
        for (int i = 1; i < menu.length; i++){
            System.out.println(i+ ". " +menu[i]+ " ---> " +harga[i]);
        }
        
        System.out.println();
        System.out.print("Pilih Menu Makanan : ");
        
        int pilihan = input.nextInt();
        
        System.out.println("Menu yang dipilih : "+menu[pilihan]);
        System.out.println();
        
        System.out.println("Masukkan Uang Pembayaran");
        int uang = input.nextInt();
        
        if (uang > harga[pilihan]){
            System.out.println("Kembalian Anda : " +(uang - harga[pilihan]));
        } else if (uang == harga[pilihan]){
            System.out.println("Uang Anda Pas, Mohon Ditunggu Pesanannya Yaa, Terima Kasih!");
        } else {
            System.out.println("Maaf, Uang Anda Kurang " +(harga[pilihan] - uang));
        }
        
    }
    
}
