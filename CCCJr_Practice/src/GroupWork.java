import java.util.Scanner;

public class GroupWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        x = scanner.nextInt();
        scanner.nextLine();
        int i = 0;
        int k = 0;
        String[][] together = new String[x][2];
        while (i < x) {
            String name = scanner.nextLine();
            for (int j = 0; j < name.length(); j++) {

                if (name.charAt(j) == ' ') {
                    together[i][0] = name.substring(0, j);
                    together[i][1] = name.substring(j + 1);
                    i++;
                }
            }
        }

        int y;
        y = scanner.nextInt();
        scanner.nextLine();
        int h = 0;
        String[][] apart = new String[y][2];
        while (h < y) {
            String name = scanner.nextLine();
            for (int j = 0; j < name.length(); j++) {
                if (name.charAt(j) == ' ') {
                    int start = 0;
                    apart[h][0] = name.substring(start, j);
                    apart[h][1] = name.substring(j + 1);
                    h++;
                }
            }
        }
        int g;
        g = scanner.nextInt();
        scanner.nextLine();
        int n = 0;
        int violations =0;
        String[][] groups = new String[g][3];
        while (n < g) {
             int start = 0;
             int increment = 0;
            String name = scanner.nextLine();
            for (int j = 0; j < name.length(); j++) {
                if(increment == 2){
                    if(Character.isLetter(name.charAt(j))){
                       groups[n][increment] = name.substring(start);
                    }
                }
                else if (name.charAt(j) == ' ') {
                    groups[n][increment] = name.substring(start, j);
                    start = j + 1;
                    increment++;

                }
            }
            n++;
        }
        if (x != 0){
            for(int j = 0; j < x; j++){
                int fulfilled= 0;
                for(int l = 0; l < g; l++){
                    if(together[j][0].equals(groups[l][0]) || together[j][0].equals(groups[l][1]) || 
                            together[j][0].equals(groups[l][2])){
                        for(int m = 0; m < 3; m++){
                            if(groups[l][m].equals(together[j][1])){
                                fulfilled++;
                            }
                        }
                        if(fulfilled == 0){
                            violations++;
                        }
                    }
                }
            }
        }
        if (y != 0){
            for(int j = 0; j < y; j++){
                for(int l = 0; l < g; l++){
                    if(apart[j][0].equals(groups[l][0]) || apart[j][0].equals(groups[l][1]) ||
                            apart[j][0].equals(groups[l][2])){
                        for(int m = 0; m < 3; m++){
                            if(groups[l][m].equals(apart[j][1])){
                                violations++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(violations);

    }
}

