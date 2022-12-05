import java.util.Scanner;

public class bolunebilme {
    public static void main(String[] args) {

        int sayi, total=0,ortalama=0,bolme=0;
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        sayi = inp.nextInt();

        for (int i=1; i<sayi; i++) {
            if(i % 12 == 0) {
                System.out.println(i);
                total = total+i;
                bolme++;
                ortalama = total/bolme;

            }
        } System.out.println("Sayıların ortalaması"+ ortalama);

    }
}