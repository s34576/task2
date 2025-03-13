
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
        if (dzien.equals("czwartek")  || dzien.equals("Czwartek") ) {
            znizka = 100;
        } else {
            znizka = 0;
        }
        if (miejsce.equals("Warszawa") || miejsce.equals("warszawa")) {
            znizka = znizka+10;
        } else {
            znizka = 0;
        }
        if (wiek < 10) {
            znizka = 100;

        } else if (wiek >= 10 && wiek <= 18) {
            znizka = 50;
        } else {
            znizka = 0;

}
        double nowaCena=cenaBiletuPodstawowa-((znizka*cenaBiletuPodstawowa)/100);
        System.out.println(miejsce+", "+dzien+", "+wiek+": "+nowaCena+": "+znizka+"% ");

    }
}
