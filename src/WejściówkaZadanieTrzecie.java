public class WejściówkaZadanieTrzecie {
    public static void main(String[] args) {
        int[][] a = new int[10][10];
        int[][] b = new int[10][10];
        int[][] c = new int[10][10];


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                a[i][j] = 1;
                b[i][j] = 2;
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Wynik dodawania macierzy:");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
    }


