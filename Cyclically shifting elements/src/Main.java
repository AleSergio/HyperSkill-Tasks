import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        int length = len - 1;

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }

        for (int j = 0; j < length; j++) {
            int number = array[j];
            array[j] = array[length];
            array[length] = number;
        }

        StringBuilder builder = new StringBuilder();

        for (int value : array) {
            builder.append(value + " ");
        }

        String text = builder.toString();

        System.out.println(text);
    }
}
