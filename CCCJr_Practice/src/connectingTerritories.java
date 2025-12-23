import java.util.Scanner;

public class connectingTerritories{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        /*int length;
        int max;
        length = scanner.nextInt();
        max = scanner.nextInt();
        int[] array = new int[length];
        for(int i = 0; i < length; i++){
            array[i] = i % max + 1;
            System.out.println(array[i] + " ");
        } */
        int C;
        int R;
        int M;


        C = scanner.nextInt();
        R = scanner.nextInt();
        M = scanner.nextInt();
        int [][] matrix = new int [R][C];
        
        for (int i = 0; i < R; i++){
            System.out.println();
            for (int j = 0; j < C; j++){
                matrix[i][j] = (C *i + j) % M + 1;
                System.out.print(matrix[i][j] + " ");
            }
        }
        int [][] bestCost = new int [R][C];

        for (int i = 0; i < R; i++){
            for (int j = 0; j < C; j++){
                bestCost[i][j] = Integer.MAX_VALUE;
            }
        }
        for (int c = 0; c < C; c++){
            bestCost[0][c] = matrix[0][c];
        }
        System.out.println();

        for (int r = 1; r < R; r++){
            System.out.println();
            for (int c = 0; c < C; c++){
                int above = Integer.MAX_VALUE;

                above = Math.min(bestCost[r-1][c], above);

                if (c > 0){
                    above = Math.min(bestCost[r-1][c - 1], above);

                }
                if (c + 1 < C){
                    above = Math.min(bestCost[r-1][c + 1], above);
                }
                bestCost[r][c] = above + matrix[r][c];
                System.out.print(bestCost[r][c] + " ");


            }
        }
        int bottomRow = Integer.MAX_VALUE;
        for (int c = 0; c < C; c++){

            bottomRow = Math.min(bestCost[R - 1][c], bottomRow);
        }
        System.out.println(bottomRow);

            }
        }

