import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TimeToDecompress {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        List<String> code = new ArrayList<>();
        for (int i = 0; i < N; i++){
            String encoded = scanner.nextLine();
            Integer repeat = Integer.parseInt(encoded.split(" ")[0]);
            String line = "";
            for(int j = 0; j < repeat; j++){
                line = line.concat(encoded.split(" ")[1]);
            }
            code.add(line);
        }
        for(String string: code){
            System.out.println(string);
        }


    }
}
