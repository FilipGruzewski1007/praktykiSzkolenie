import java.util.Scanner;

public class SredniaWierszyIKolumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczby oddzielone spacją (wiersze oddzielone Enterem):");
        int[][] tablica = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                tablica[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            double sumaWiersza = 0;
            for (int j = 0; j < 5; j++) {
                sumaWiersza += tablica[i][j];
            }
            double sredniaWiersza = sumaWiersza / 5;
            System.out.printf("Wiersz %d: %.2f\n", i + 1, sredniaWiersza);
        }

        for (int j = 0; j < 5; j++) {
            double sumaKolumny = 0;
            for (int i = 0; i < 5; i++) {
                sumaKolumny += tablica[i][j];
            }
            double sredniaKolumny = sumaKolumny / 5;
            System.out.printf("Kolumna %d: %.2f\n", j + 1, sredniaKolumny);
        }
    }
}
