import java.util.Scanner;

public class Kolor {

    public static char pobierzPierwszaLitere() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą literę koloru: ");
        String input = scanner.nextLine().trim();

        return input.toLowerCase().charAt(0);
    }

    public String wybierzKolor(char litera) {
        String kolor;

        switch (litera) {
            case 'c':
                kolor = "czerwony";
                break;
            case 'z':
                kolor = "zielony";
                break;
            case 'n':
                kolor = "niebieski";
                break;
            case 'p':
                kolor = "pomarańczowy";
                break;
            case 'f':
                kolor = "fioletowy";
                break;
            case 'b':
                kolor = "biały";
                break;
            case 's':
                kolor = "szary";
                break;
            case 'y':
                kolor = "żółty";
                break;
            default:
                kolor = "Nieznany kolor";
        }

        return kolor;
    }

    public static void main(String[] args) {
        char literaKoloru = pobierzPierwszaLitere();
        Kolor kolor = new Kolor();

        String wynik = kolor.wybierzKolor(literaKoloru);
        System.out.println("Wybrany kolor to: " + wynik);
    }
}

