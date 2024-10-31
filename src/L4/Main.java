package L4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputs = new ArrayList<>();

        for (int i = 0; i < 3; i ++) {
            System.out.println("Input Lottery Number: ");
            String input = scanner.nextLine();

            inputs.add(input);
        }
    }
}
