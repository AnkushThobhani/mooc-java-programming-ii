
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            inputs.add(input);
        }
        
        String combined = inputs.stream()
                .reduce("", (prevString, word) -> prevString + word + "\n");
        System.out.println(combined);

    }
}
