import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class SilentAuction {
    public static void main (String [] args){
     Scanner scanner = new Scanner(System.in);
     int N = scanner.nextInt();
     scanner.nextLine();
     int i = 0;
     HashMap<String,Integer> auctioneers = new LinkedHashMap<>(N);

     while (i < N){
         int placeholder = 0;

         String name = scanner.nextLine();

         int bid = scanner.nextInt();
         scanner.nextLine();
         auctioneers.put(name,bid);

         i++;

     }
        int highestBid = 0;

     for (String key : auctioneers.keySet()) {
         highestBid = Math.max(auctioneers.get(key),highestBid);
     }


     for (String key : auctioneers.keySet()) {
        if (auctioneers.get(key) == highestBid) {
            System.out.println(key);
            break;
        }
     }

    }
}
