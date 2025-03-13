import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wiek: ");
        int wiek = sc.nextInt();
        System.out.println("Podaj miejsce zamieszkania: ");
        String miejsce = sc.next();
        System.out.println("Jaki jest dzien tygodnia: ");
        String dzien = sc.next();
        double cenaBiletuPodstawowa = 40;
        int znizka = 0;
        double cenaFinalna = cenaBiletuPodstawowa;
        if (wiek < 10) {
            znizka = 100;
            cenaFinalna = 0.0;
        } else {
            if (wiek >= 10 && wiek <= 18) {
                znizka = 50;
                cenaFinalna = cenaBiletuPodstawowa * 0.5;
            }
            if (miejsce.equals("Warszawa") || miejsce.equals("warszawa")) {
                znizka = 10;
                cenaFinalna = cenaFinalna - ((cenaBiletuPodstawowa * znizka) / 100);
                if (wiek >= 10 && wiek <= 18 && (miejsce.equals("Warszawa") || miejsce.equals("warszawa"))) {
                    znizka = znizka + 50;
                }
            }
            if (dzien.equals("Czwartek") || dzien.equals("czwartek")) {
                znizka = 100;
                cenaFinalna = 0.0;
            }
        }
        System.out.println("Dane: " + "  " + miejsce + ", " + wiek + " lat, " + "CENY BILETÓW: " + cenaFinalna + " PLN, " + znizka + "%");
    }
}