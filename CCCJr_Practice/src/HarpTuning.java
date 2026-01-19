import java.util.Scanner;

public class HarpTuning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String instructions = scanner.nextLine();

        int start = 0;
        int end = 0;
        for (int i = 0; i < instructions.length(); i++) {

            String command = null;
            if (Character.isLetter(instructions.charAt(i)) && (
                    (((i >= 1) && !Character.isLetter(instructions.charAt(i - 1))) || ((i == 0))))) {
                start = i;

            }
            if (Character.isDigit(instructions.charAt(i))){
                end = i;
            }

            if(end > 0){
                command = instructions.substring(start,end + 1);
                if(!command.isBlank()){
                    for(int j = 0; j < command.length(); j++ ){
                        if(command.charAt(j) == '+'){
                            System.out.println(command.substring(0,j) + " tightens " + command.charAt(command.length() -1 ));
                        }
                        else if(command.charAt(j) == '-'){
                            System.out.println(command.substring(0,j) + " loosens`   " + command.charAt(command.length() -1 ));
                        }
                    }
                }

            }

        }
    }
}
