import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        StringBuilder builder = new StringBuilder();

        while (!a.equals("0")) {

            try {
                builder.append(Integer.parseInt(a) * 10).append("\n");

            } catch (Exception e) {
                builder.append("Invalid user input: ").append(a).append("\n");

            } finally {
                a = scanner.nextLine();
            }
        }
        System.out.println(builder);

    }
}
