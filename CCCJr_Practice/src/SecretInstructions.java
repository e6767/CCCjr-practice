import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecretInstructions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean hasNext = true;
        String previousTurn = "";
        List<Integer> steps = new ArrayList<>();
        List<String> finalSteps = new ArrayList<>();
        while (hasNext) {
            //Integer instructions = scanner.nextInt();
            String stringInstructions = scanner.nextLine();
            Integer instructions = Integer.parseInt(stringInstructions);
            if (stringInstructions.equals("99999")) {
                hasNext = false;

            }
            if (hasNext) {
                String numToString = instructions.toString();
                String turn = numToString.substring(0, 3);
                steps.add(instructions);
                if (instructions != 99999) {
                    if (numToString.length() == 3) {
                        finalSteps.add(previousTurn + " " + instructions);
                    } else if (((instructions - instructions % 10000) / 10000 + (instructions % 10000 - instructions % 1000) / 1000) % 2 != 0) {
                        finalSteps.add("left " + numToString.substring(2));
                        previousTurn = "left";

                    } else if (((instructions - instructions % 10000) / 10000 + (instructions % 10000 - instructions % 1000) / 1000) % 2 == 0) {
                        finalSteps.add("right " + numToString.substring(2));
                        previousTurn = "right";

                    }
                }
            }
        }
        for (String string : finalSteps) {
            System.out.println(string);
        }
    }

}

