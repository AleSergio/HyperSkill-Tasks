import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        int counter = 1;
        int rowNum = 0;
        int rowOn = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int k = scanner.nextInt();

        if (k != 1) {
            for (int i = 0; i < n; i++) {
                if (rowNum != 0 && k == counter) {
                    break;
                }

                if (i != rowOn) {
                    counter = 1;
                    rowOn = i;
                }

                for (int j = 0; j < m - 1; j++) {
                    if (array[i][j] == 0 && array[i][j] == array[i][j + 1] && k != counter) {
                        counter++;
                        rowNum = i + 1;
                    } else if (array[i][j] != 0) {
                        counter = 1;
                    } else if (k == counter) {
                        break;
                    }
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (rowNum != 0) {
                    break;
                }
                for (int j = 0; j < m - 1; j++) {
                    if (array[i][j] == 0 || array[i][j + 1] == 0) {
                        rowNum = i + 1;
                        break;
                    }
                }
            }
        }

        if (k == counter) {
            System.out.println(rowNum);
        } else {
            System.out.println(0);
        }
    }
}