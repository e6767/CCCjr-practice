import java.util.*;

import static java.util.Arrays.*;

public class BronzeCount2 {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        Integer [] array = {10,5,3,15,30,18,18,3,15,5,5};
        sort(array);
        System.out.println(Arrays.toString(array));

        Set<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < array.length; i++){
            set.add(array[i]);
        }
        System.out.println(set);

        int bronze = (int) set.toArray()[2];
        System.out.print(bronze);


        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++){
            if (map.keySet().contains(array[i])){
               int count =  map.get(array[i]) + 1;
               map.put(array[i], count);
            } else {
                map.put(array[i], 1);
            }

        }
        System.out.println(map);

        System.out.println(map.get(bronze));




        Integer[] array2 = new Integer[76];
        for (int i = 0 ; i < array2.length; i++){
            array2[i]= 0 ;
        }

        int input;
        // Integer [] array = {10,5,3,15,30,18,18,3,15,5,5};
        for (int i = 0 ; i< array.length ; i ++){
           array2[array[i]] += 1;
        }

       System.out.println(Arrays.toString(array2));

        int counter = 0;
        int bronzeMedal = 0;
        int occurorunce = 0;
        for (int i = 75; i > 0; i--) {
            if (array2[i] > 0) {
                counter ++;
                if (counter == 3) {
                    bronzeMedal = i;
                    occurorunce = array2[i];
                    break;
                }


            }
        }
        System.out.println("Bronze: " + bronzeMedal + " Participants: " + occurorunce);


    }
}
