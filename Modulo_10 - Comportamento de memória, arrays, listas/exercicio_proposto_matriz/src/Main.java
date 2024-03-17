import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();

        int n = sc.nextInt();

        int[] [] mat = new int[m][n];

        for (int i = 0 ; i < mat.length ; i++){

            for (int j = 0 ; j < mat[i].length ; j++){

                mat[i] [j] = sc.nextInt();

            }

        }

        int numEscolhido = sc.nextInt();

        for (int i = 0 ; i < mat.length ; i++){

            for (int j = 0 ; j < mat[i].length ; j++){

                if (mat[i][j] == numEscolhido){

                    System.out.println("Position " + i + ", " + j + "; ");
                    if (j - 1 >= 0){

                        System.out.println("Left: " + mat[i][j - 1]);

                    }

                    if (j + 1 <= n - 1) {

                        System.out.println("Right: " + mat[i][j + 1]);

                    }

                    if (i - 1 >= 0) {

                        System.out.println("Up: " + mat[i - 1][j]);

                    }

                    if (i + 1 <= m - 1) {

                        System.out.println("Down: " + mat[i + 1][j]);

                    }

                }

            }

        }

        sc.close();

    }
}