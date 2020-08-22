import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        ;
        int maxIndex1 = 0;
        int maxIndex2 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j] > array[maxIndex1][maxIndex2]) {
                    maxIndex1 = i;
                    maxIndex2 = j;
                }
            }
        }
        System.out.println(maxIndex1 + " " + maxIndex2);
    }
}
