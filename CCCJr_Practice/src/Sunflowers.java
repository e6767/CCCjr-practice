import java.util.Scanner;

public class Sunflowers {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        int [][] data = new int[N][N];
        int [][] originalData = new int[N][N];

        for(int i = 0; i < N; i++){
            String dataRow = scanner.nextLine();
            for(int j = 0; j < N; j++){
                data[i][j] = Integer.parseInt(dataRow.split(" ")[j]);

            }
        }
        boolean otherArrangement = true;
        for(int i = 0; i < N; i++){
            int row = 0;
            for(int j = 0; j < N; j++){
                if(j + 1 < N){
                    if(data[i][j] < data[i][j + 1]){
                        originalData[i] = data[i];
                        otherArrangement = false;
                    }
                    else if(data[i][j] > data[i][j + 1]){
                        otherArrangement = true;
                    }
                }
            }
        }
        if(otherArrangement) {
            boolean correctPos2 = false;
            for (int i = 0; i < N; i++) {
                int column = 0;
                for (int j = 0; j < N; j++) {
                    if (i + 1 < N) {
                        if (data[i][j] < data[i + 1][j]) {
                            correctPos2 = true;
                            column = j;
                            for (int l = 0; l < N; l++) {
                                originalData[column][l] = data[l][column];
                            }
                        } else if (data[i][j] > data[i + 1][j]) {
                            correctPos2 = false;
                        }
                    }
                }

            }
        }
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < N; i++) {
                if (i + 1 < N) {
                    if (originalData[i][0] > originalData[i + 1][0]) {
                        int[] row = new int[N];
                        row = originalData[i];
                        originalData[i] = originalData[i + 1];
                        originalData[i + 1] = row;
                    }
                }
            }

        }
        for(int i = 0; i < N; i++){
            System.out.println();
            for(int j = 0; j < N; j++){
                System.out.print(originalData[i][j] + " ");
            }
        }
    }
}
