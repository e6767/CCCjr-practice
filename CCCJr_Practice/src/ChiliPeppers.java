import java.util.Scanner;

public class ChiliPeppers {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int i;
        int Chili = 0;
        i = scanner.nextInt();
        int j = 0;

        while (j < i){
            String pepper = scanner.next();
            switch(pepper){
                case "Poblano" -> {
                    Chili += 1500;
                    j++;
                }
                case "Mirasol" -> {
                    Chili += 6000;
                    j++;
                }
                case "Serrano" -> {
                    Chili += 15500;
                    j++;
                }
                case "Cayenne" -> {
                    Chili += 40000;
                    j++;
                }
                case "Thai" -> {
                    Chili += 75000;
                    j++;
                }
                case "Habanero" -> {
                    Chili += 125000;
                    j++;
                }

            }

        }
        System.out.println(Chili);
    }
}
