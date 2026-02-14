import java.util.Scanner;

public class MagicSquares {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int[][] magicSquare = new int[4][4];
        int magicSum = 0;
        boolean isMagic = false;
        for (int i = 0; i < 4; i++){
            String numberRow = scanner.nextLine();
            for(int j = 0; j < 4; j++){
                magicSquare[i][j] = Integer.parseInt(numberRow.split(" ")[j]);
            }
        }
        for(int i = 0; i < 4; i++){
            if(i == 0){
                magicSum = magicSquare[i][0] + magicSquare[i][1] + magicSquare[i][2] + magicSquare[i][3];
            }
            else{
                if((magicSquare[i][0] + magicSquare[i][1] + magicSquare[i][2] + magicSquare[i][3]) == magicSum){
                    isMagic = true;
                }
                else{
                    isMagic = false;
                }
            }
        }
        if(isMagic) {
            for (int i = 0; i < 4; i++) {
                if (i == 0) {
                    magicSum = magicSquare[0][i] + magicSquare[1][i] + magicSquare[2][i] + magicSquare[3][i];
                } else {
                    if ((magicSquare[0][i] + magicSquare[1][i] + magicSquare[2][i] + magicSquare[3][i]) == magicSum) {
                        isMagic = true;
                    } else {
                        isMagic = false;
                    }
                }
            }
        }
        if(isMagic){
            System.out.println("Magic");
        }else{
            System.out.println("Not magic");
        }
    }
}
