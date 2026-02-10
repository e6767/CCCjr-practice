import java.util.Scanner;

public class Flipper {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        String inputs = scanner.nextLine();
        int[][] numbers = {{1,2},{3,4}};
        int[][] changedNumbers = new int[2][2];
        for (int i = 0; i < inputs.length(); i++){
            if(inputs.charAt(i) == 'h'){
                changedNumbers[0][0] = numbers[1][0];
                changedNumbers[1][0] = numbers[0][0];
                changedNumbers[0][1] = numbers[1][1];
                changedNumbers[1][1] = numbers[0][1];
                for(int j = 0; j < 2; j++){
                    System.arraycopy(changedNumbers[j], 0, numbers[j], 0, 2);
                }
            }
            else if(inputs.charAt(i) == 'v'){
                changedNumbers[0][0] = numbers[0][1];
                changedNumbers[0][1] = numbers[0][0];
                changedNumbers[1][0] = numbers[1][1];
                changedNumbers[1][1] = numbers[1][0];
                for(int j = 0; j < 2; j++){
                    System.arraycopy(changedNumbers[j],0,numbers[j],0,2);
                }
            }
        }
        for(int i = 0; i < 2; i++){
            if(i > 0){
                System.out.println();
            }
            for(int j = 0; j < 2; j++){
                System.out.print(changedNumbers[i][j] + " ");
            }
        }
    }
}
