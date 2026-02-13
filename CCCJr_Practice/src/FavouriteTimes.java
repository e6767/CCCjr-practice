import java.util.Scanner;

public class FavouriteTimes {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int time = 1200;
        int numOfArithmetic = 0;
        int hours = 0;
        if( N >= 60){
            hours = N/60;
        }
        else if(N < 60){
            hours = 1;
        }
        for(int i = 0; i < hours; i++){
            if(hours > 1 && i >= 1){
                time = i * 100;
            }
            for(int j = 0; j < 60; j++){
                if(j == N){
                    break;
                }

                int difference = 0;
                boolean arithmetic = true;
                int k = 0;
                for(int l = 0; l < Integer.toString(time).length(); l++){
                    if(l + 1 < Integer.toString(time).length()){
                        int m = Integer.parseInt(Integer.toString(time).substring(l,l+1));
                        if(l ==Integer.toString(time).length() ){
                            k = Integer.parseInt(Integer.toString(time).substring(l+1));
                        }else{
                            k = Integer.parseInt(Integer.toString(time).substring(l+1,l+2));
                        }

                        if(l == 0){
                            difference = m - k;
                        }
                        else if(l > 0){
                            if(m - k == difference){
                                if(arithmetic) {
                                    arithmetic = true;
                                }
                            }
                            else{
                                arithmetic = false;
                            }
                        }
                    }
                }
                if(arithmetic){
                    numOfArithmetic++;
                    System.out.println(time);
                }
                time++;
            }
        }
        System.out.println(numOfArithmetic);
    }
}
