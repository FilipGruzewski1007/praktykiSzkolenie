public class WejściowkaZadanieDrugie {
    public static void main(String[] args) {
        int suma = 0;
        int liczba = 1;

        do {
            if (liczba % 2 != 0) {
                suma += liczba;
            }
            liczba++;
        } while (liczba <= 100);

        System.out.println("Suma liczb nieparzystych w przedziale od 1 do 100 wynosi: " + suma);
    }
}

