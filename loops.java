import java.util.*;

public class loops {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            System.out.println("Simple for loop i: " + i);
        }

        //for( ; ; ){ //all 3 args are optional
            //infinite for loop
        //}

        // labeled for loops

        aa: for (int i = 0; i < 10; i++) {
            if(i == 1) continue;
             for(int j=1 ;j < 5; j++){
                if( i == 2 && j == 2) {
                    break aa;
                }
                System.out.println(i + " " + j + " ");
            }
        }

        //enhanced for loops
        int[] intArr = { 0,1,2,3,4 };
        for(int num: intArr){
            System.out.println("Enhanced for-each loop: i = " + num);
        }

        Map<String,Integer> map = new HashMap<>();

        map.put("apple", 3);
        map.put("banana", 5);
        map.put("orange", 2);

        for( Map.Entry<String,Integer> entry: map.entrySet() ){
            System.out.println(
                "Key: " + entry.getKey() + 
                " - " + 
                "Value: " + entry.getValue());
        }

        List<String> names = new ArrayList<>();
        names.add("Larry");
        names.add("Steve");
        names.add("James");
        names.add("Conan");
        names.add("Ellen");

        names.forEach(name -> System.out.println(name));

        //do-while loop

        int i = 0;
        do {
            System.out.println("Do-While loop: i = " + i++);
        } while (i < 5);

    }
}
