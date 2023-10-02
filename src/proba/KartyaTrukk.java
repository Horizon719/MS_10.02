package proba;

import java.util.Scanner;

public class KartyaTrukk {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        program();
    }
    
    private static void program() {
        String[] pakli = new String[22];
        pakliOsszeAllit(pakli);
        for (int i = 0; i < 3; i++) {
            kirak();
            melyikOszlop();
            kever();
        }
        ezVolt();
    }
    
    private static void kirak() {
        
    }
    
    private static void melyikOszlop() {
        int oszlop;
        do{
            System.out.print("Kérem adja meg melyik oszlop(1-3):");
            oszlop = sc.nextInt();
        } while (0 > oszlop || 3 < oszlop);
    }
    
    private static void kever() {
        
    }
    
    private static void ezVolt() {
        
    }
    
    private static void pakliOsszeAllit(String[] pakli) {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertek = {"Ász","Kir","Fel","X","IX","VIII"};
        
        int j = 0;
        for (int i = 0; i < szinek.length; i++) {
            while (){
                pakli[j++] = szinek[i] + "_" + ;
            }
        }
        
    }
}
