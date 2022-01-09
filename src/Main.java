import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        String urunler[] = {"Armut", "Elma", "Domates", "Muz", "Patlıcan"};
        double fiyatlar[] = {2.14, 3.67, 1.11, 0.95, 5.00};
        Scanner scanner = new Scanner(System.in);
        double toplam = 0;
        for(int i = 0; i < urunler.length; i++){
            System.out.print(urunler[i] + " Kaç Kilo? : ");
            toplam += fiyatlar[i] * scanner.nextDouble();
        }
        System.out.println("Toplam Tutar : " + toplam);
    }
}
