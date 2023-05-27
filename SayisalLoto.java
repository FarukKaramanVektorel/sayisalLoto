/*
Sayısal loto tahmin programı
 by Faruk Karaman
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayisalLoto {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rnd=new Random();
        boolean oyun = true;
        boolean reNumber = false;
        int[] loto = new int[6];
        while (oyun) {
            for (int i = 0; i < 6; i++) {
                reNumber = false;
                while (reNumber == false) {
                    int k = 0;
                    int randomNumber=rnd.nextInt(49)+1;
                    for (k = 0; k < 6; k++) {
                        if (loto[k] == randomNumber) {
                            break;
                        }
                    }
                    if (k == 6) {
                        loto[i] = randomNumber;
                        reNumber = true;
                    }
                }
            }
            Arrays.sort(loto);
            System.out.println("Tahmini sayisal loto sonuclari");
            System.out.println(Arrays.toString(loto));
            System.out.println("Tekrar oynamak istermisiniz (evet/hayır)?");
            String evetHayir = scn.next();
            if (evetHayir.equals("evet")) {
                oyun = true;
            } else if (evetHayir.equals("hayır")) {
                oyun = false;
                System.out.println("Oyun sonlandırıldı.");
            }
        }
    }
}
