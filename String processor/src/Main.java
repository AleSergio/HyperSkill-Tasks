import java.util.Scanner;

class StringProcessor extends Thread {

    final Scanner scanner = new Scanner(System.in); // use it to read string from the standard input
    StringBuilder builder = new StringBuilder();

    @Override
    public void run() {
        while (scanner.hasNext()) {

            String line = scanner.nextLine();

            if (!line.equals(line.toUpperCase())) {
                builder.append(line.toUpperCase()).append("\n");
            } else {
                System.out.println(builder + "FINISHED");
                break;
            }
        }
    }
}
