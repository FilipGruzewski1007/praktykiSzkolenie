import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Ksiegarnia {

    public static List<String> koszyk = new ArrayList<>();
    public static Map<String, Integer> ceny = new HashMap<>();

    static {
        ceny.put("Zeszyt", 5);
        ceny.put("Długopis", 3);
        ceny.put("Książka_1", 69);
        ceny.put("Książka_2", 40);
        ceny.put("Książka_3", 100);
    }

    public static void main(String[] args) {
        // Zadanie 1
        for (int i = 0; i < 3; i++) {
            koszyk.add("Zeszyt");
        }
        for (int i = 0; i < 2; i++) {
            koszyk.add("Długopis");
        }
        koszyk.add("Książka_1");

        double rabatStarter = 0;
        int liczbaKsiazek = 0;
        int liczbaPrzyborow = 0;

        for (String produkt : koszyk) {
            if (produkt.startsWith("Książka")) {
                liczbaKsiazek++;
            } else if (produkt.equals("Zeszyt") || produkt.equals("Długopis")) {
                liczbaPrzyborow++;
            }
        }

        if (liczbaKsiazek >= 1 && liczbaPrzyborow >= 1) {
            rabatStarter = 0.25;
        }

        double rabat2plus1 = 0;

        if (koszyk.size() >= 3) {
            int najtanszaKsiazka = Math.min(ceny.get("Książka_1"), Math.min(ceny.get("Książka_2"), ceny.get("Książka_3")));
            rabat2plus1 = najtanszaKsiazka;
        }

        double cenaPelna = 0;
        for (String produkt : koszyk) {
            cenaPelna += ceny.get(produkt);
        }

        double cenaZRabatem = cenaPelna * (1 - rabatStarter) - rabat2plus1;

        System.out.println("Cena z rabatem: " + cenaZRabatem + " zł");


        // Zadanie 2
        int[][] tablica = new int[100][100];
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                tablica[i][j] = random.nextInt(21) % 2 == 0 ? 1 : 0;
            }
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.print(tablica[i][j]);
            }
            System.out.println();
        }

        int sumaElementow = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                sumaElementow += tablica[i][j];
            }
        }

        System.out.println("Suma elementów w tablicy: " + sumaElementow);


        // Zadanie 3
        int[][] tablicaLiczb = new int[20][20];

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                tablicaLiczb[i][j] = random.nextInt(11);
            }
        }

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(tablicaLiczb[i][j] + " ");
            }
            System.out.println();
        }

        int[] licznik = new int[11];

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                licznik[tablicaLiczb[i][j]]++;
            }
        }

        for (int i = 0; i < 11; i++) {
            System.out.println("\"" + i + "\" – " + licznik[i]);
        }
    }
}
