import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KsiegarniaApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> ceny = new HashMap<>();
        ceny.put("Zeszyt", 5);
        ceny.put("Długopis", 3);
        ceny.put("Książka_1", 69);
        ceny.put("Książka_2", 40);
        ceny.put("Książka_3", 100);

        int koszyk = 0;

        while (true) {
            System.out.println("Dostępne produkty:");
            System.out.println("1. Zeszyt - 5 zł");
            System.out.println("2. Długopis - 3 zł");
            System.out.println("3. Książka_1 - 69 zł");
            System.out.println("4. Książka_2 - 40 zł");
            System.out.println("5. Książka_3 - 100 zł");
            System.out.println("0. Zakończ zakupy");

            System.out.println("Wybierz produkt (wpisz numer): ");
            int wybor = scanner.nextInt();

            if (wybor == 0) {
                break;
            }

            System.out.println("Podaj ilość: ");
            int ilosc = scanner.nextInt();

            switch (wybor) {
                case 1:
                    koszyk += ceny.get("Zeszyt") * ilosc;
                    break;
                case 2:
                    koszyk += ceny.get("Długopis") * ilosc;
                    break;
                case 3:
                    koszyk += ceny.get("Książka_1") * ilosc;
                    break;
                case 4:
                    koszyk += ceny.get("Książka_2") * ilosc;
                    break;
                case 5:
                    koszyk += ceny.get("Książka_3") * ilosc;
                    break;
                default:
                    System.out.println("Nieprawidłowy numer produktu.");
            }
        }

        // Promocje
        int iloscKsiazek = Math.min(10, koszyk / ceny.get("Książka_1")); // Maksymalnie 10 książek
        int iloscPrzyborow = Math.min(10, koszyk / (ceny.get("Zeszyt") + ceny.get("Długopis"))); // Maksymalnie 10 przyborów

        // "Starter ucznia" - zniżka 25%
        if (iloscKsiazek >= 1 && iloscPrzyborow >= 1) {
            koszyk *= 0.75;
        }

        // "2 + 1" - trzecia książka za 1 zł
        if (iloscKsiazek >= 3) {
            int najtanszaKsiazka = Math.min(ceny.get("Książka_1"), Math.min(ceny.get("Książka_2"), ceny.get("Książka_3")));
            koszyk -= najtanszaKsiazka;
        }

        System.out.println("Cena końcowa: " + koszyk + " zł");
    }
}
