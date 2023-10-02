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
            kirak(pakli);
            int oszlop = melyikOszlop();
            kever(oszlop, pakli);
        }
        ezVolt(pakli);
    }
    
    private static void kirak(String[] pakli) {
        for (int i = 1; i < pakli.length; i++) {
            System.out.printf("%-8s", pakli[i]);
            if(i%3==0){
                System.out.println("");
            }
        }
    }
    
    private static int melyikOszlop() {
        int oszlop;
        do{
            System.out.print("Kérem adja meg melyik oszlop(1-3):");
            oszlop = sc.nextInt();
        } while (0 > oszlop || 3 < oszlop);
        return oszlop;
    }
    
    private static void kever(int oszlop, String[] pakli) {
        String[] ujTomb = new String[22];
        switch(oszlop){
            case 1:
                for (int i = 0; i < 7; i++) {
                    ujTomb[i] = pakli[20-(i-1)*3];
                }
                for (int i = 7; i < 7; i++) {
                    ujTomb[i] = pakli[19-(i-1)*3];
                }
                for (int i = 14; i < 7; i++) {
                    ujTomb[i] = pakli[21-(i-1)*3];
                }
            case 2:
                for (int i = 0; i < 7; i++) {
                    ujTomb[i] = pakli[20-(i-1)*3];
                }
                for (int i = 0; i < 7; i++) {
                    ujTomb[i] = pakli[19-(i-1)*3];
                }
                for (int i = 0; i < 7; i++) {
                    ujTomb[i] = pakli[21-(i-1)*3];
                }
            case 3:
                for (int i = 0; i < 7; i++) {
                    ujTomb[i] = pakli[20-(i-1)*3];
                }
                for (int i = 0; i < 7; i++) {
                    ujTomb[i] = pakli[19-(i-1)*3];
                }
                for (int i = 0; i < 7; i++) {
                    ujTomb[i] = pakli[21-(i-1)*3];
                }
        }
    }
    
    private static void ezVolt(String[] pakli) {
        System.out.printf("Ez volt a gondolt lap: %s\n", pakli[11]);
    }
    
    private static void pakliOsszeAllit(String[] pakli) {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász","Kir","Fel","X","IX","VIII"};
        
        int j = 1;
        for (int i = 0; i < szinek.length; i++) {
            for (int k = 0; k < ertekek.length && j< pakli.length; k++) {
                pakli[j++] = szinek[i] + "_" + ertekek[k];
            }
        }
        
    }
}
