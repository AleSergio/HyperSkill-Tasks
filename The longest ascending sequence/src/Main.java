import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        int counter = 0;
        int temp = 0;


        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }

        for (int j = 1; j < len; j++) {

            if (array[j - 1] < array[j]) {
                counter++;
            } else if (temp < counter) {
                temp = counter;
                counter = 0;
            }
        }


        if (counter > temp) {
            System.out.println(counter + 1);
        } else if (temp == 0) {
            System.out.println(1);
        } else {
            System.out.println(temp +1);
        }
    }
}
