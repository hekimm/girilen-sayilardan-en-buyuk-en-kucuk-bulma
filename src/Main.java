/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hekimcanaktas
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfNumbers,ilkSayi,enBuyuk,enKucuk,sayi;
        System.out.println("Kaç adet sayı gireceksiniz: ");
        
        
        numberOfNumbers = scanner.nextInt();
        
        System.out.println("İlk sayıyı giriniz: ");
        
        ilkSayi =scanner.nextInt();
        
        enBuyuk = ilkSayi;
        enKucuk = ilkSayi;
        
        for(int i =1;i<=numberOfNumbers -1;i++){
             System.out.println( "bir sayı giriniz");
             sayi = scanner.nextInt();
             if(sayi> enBuyuk){
                 enBuyuk = sayi;
             }
             
             if(sayi<enKucuk ){
                 enKucuk = sayi;
             }
        }
        
        
        System.out.println("Girilen sayilardan en büyüğü : " + enBuyuk);
        System.out.println("Girilen sayilardan en küçüğü : " + enKucuk);
     
       
    }
}
