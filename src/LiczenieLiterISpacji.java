import java.util.Scanner;

public class LiczenieLiterISpacji {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj tekst:");
        String tekst = scanner.nextLine();

        int licznikA = 0;
        int licznikSpacji = 0;

        char[] znaki = tekst.toCharArray();

        for (char znak : znaki) {
            if (znak == 'a' || znak == 'A') {
                licznikA++;
            } else if (znak == ' ') {
                licznikSpacji++;
            }
        }

        System.out.println("Ilość liter 'a': " + licznikA);
        System.out.println("Ilość spacji: " + licznikSpacji);
    }
}
