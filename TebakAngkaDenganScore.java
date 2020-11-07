/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangkadenganscore;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author LENOVO
 */
public class TebakAngkaDenganScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ATRIBUTE
        int agk_random;
        int tebakan;
        int score = 100;
        int bonus = 50;
        int score_anda;
        int score_total;
                
        Random angka = new Random();
        agk_random = angka.nextInt(101);
        System.out.println("Hai..nama saya Rafi, saya telah memilih angka dari 0 -100. Silahkan tebak ya!!");
        Scanner input = new Scanner(System.in);
        
        
        do{
            System.out.print("Tebakkan anda : ");
            tebakan = input.nextInt();
            if ( tebakan == agk_random ){
                System.out.println("yeyeye... bilangan tebakan anda benar" + "\n");
            }else if ( tebakan > agk_random ){
                System.out.println("Hehehe...bilangan tebakan anda terlalu besar" + "\n");
            }else{
                System.out.println("hehehe...bilangan tebakan anda terlalu kecil" + "\n");
            }
            
            if ( tebakan != agk_random){
                score_anda = score-=2;
                System.out.println("Score anda : " + score_anda + "\n");
            }
            
            
            
            
            /* Saya mengalami stuck ketika pemberian bonus jika tebakan tidak lebih dari 5. untuk setelah operator && dibawah,
               yang harus dimasukkan itu bagian yang mana ya pak/mas biar bisa diberi bonus ketika tebakan benar dan tebakan tidak lebih dari 5. 
               Terimakasih..
            
            
            else if ( tebakan == agk_random &&  ){
                score_total = score + bonus;
                System.out.println("Score akhir dengan bonus : " + score_total);
            }
            
            */  
            
            
            
            
           // Untuk baris kode dibawah sengaja saya beri yang tanpa bonus dan dengan bonus
            else {
                score_total = score + bonus;
                System.out.println("Score anda : " + score + "\n");
                System.out.println("Score total : " + score_total);
            }
        }while( tebakan != agk_random );
        
    }
        
}

