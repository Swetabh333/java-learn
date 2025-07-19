import java.util.Scanner;

public class control_statements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a value for count");

        int count = scanner.nextInt();

        scanner.close();

        if(count > 2){
            System.out.println("Count > 2");
        }else{
            System.out.println("Count less than or equal to 2");
        }

        //ternary
        System.out.println(count > 2 ? "Count is higher than 2" : "Count is lower or equal than 2");

        //switch

        int count2 = 3;
        switch (count2) {
        case 0:
            System.out.println("Count is equal to 0");
            break;
        case 1:
            System.out.println("Count is equal to 1");
            break;
        default:
            System.out.println("Count is either negative, or higher than 1");
            break;
        }

        //loops

        for (int i = 1; i <= 50; i++) {
            //methodToRepeat();
        }

        int whileCounter = 1;
        while (whileCounter <= 50) {
            //methodToRepeat();
            whileCounter++;
        }


    }
}
