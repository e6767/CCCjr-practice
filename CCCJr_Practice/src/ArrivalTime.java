import java.util.Scanner;

public class ArrivalTime {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int [] time = new int[2];
        boolean pastMidnight = false;
        time[0] = Integer.parseInt(input.split(":")[0]);
        time[1] = Integer.parseInt(input.split(":")[1]);
        int minutes = time[1];
        String time3 = (input.split(":")[0]) +  (input.split(":")[1]);
        int time2 = Integer.parseInt(time3);
        int travelTime = 0;
        int travelTime2 = 0;
        while(travelTime < 120) {
            if(time2 >= 1000 && time2 <= 1500){
                while(travelTime<120){
                    for(int i = travelTime2/10; i < 12;i++){
                        time[1] += 10;
                        travelTime += 10;
                        if(time[1] == 60 + minutes){
                            time[1] = minutes;
                            time2 += 100;
                        }
                    }
                }
            }
            if(time2 >= 1900){
                pastMidnight = true;
                if(time2 == (2400 + minutes)){
                    time2 = 0;
                }
                time[1] += 60;
                if(time[1] == 60 + minutes){
                    time[1] = minutes;
                    time2 += 100;
                }
                travelTime += 60;
            }
            if (time2 >= 700 && time2 <= 1000) {
                while (time2 < 1000) {
                    time[1] += 60;
                    if(time[1] == 60 + minutes){
                        time[1] = minutes;
                        time2 += 100;
                    }
                    travelTime += 30;
                }
                travelTime2 = travelTime;
            }
            else if(time2 >= 1500 && time2 <= 1900){
                if(time2 < 1900){
                    time[1] += 60;
                    if(time[1] == 60 + minutes){
                        time[1] = 0;
                        time2 += 100;
                    }
                    travelTime += 30;
                }
                travelTime2 = travelTime;
            }
            else if(time2 < 700 && pastMidnight == false){
            for (int i = 0; i < 2; i++) {
                time[1] += 60;
                if(time[1] == 60 + minutes){
                    time[1] = minutes;
                    time2 += 100;
                }
                travelTime += 60;
                travelTime2 = travelTime;
            }

            }
        }
        if(Integer.toString(time2).length() == 4) {
            input = Integer.toString(time2).substring(0, 2) + ":" + Integer.toString(time[1]);
            System.out.println(input);
        }
        else if(Integer.toString(time2).length() == 3){
            input = "0" + Integer.toString(time2).charAt(0) + ":" + Integer.toString(time[1]);
            if(input.length() == 4){
                System.out.println(input + Integer.toString(time[1]));
            }else{
                System.out.println(input);
            }
        }





    }
}
