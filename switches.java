import java.util.Scanner;
import java.time.Month;

public class switches {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String animal = sc.nextLine();
        sc.close();
        String result;
        switch (animal) {
            case "Dog":
                result = "Domestic animal";
                break;
            case "Cat":
                result = "Domestic animal";
                break;
            default:
                result = "Wild animal";
                break;
        }
        System.out.println(result);

        Month month = Month.MARCH;
        var result2 = switch (month) {
        case JANUARY, JUNE, JULY -> 3;
        case FEBRUARY, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER -> 1;
        case MARCH, MAY, APRIL, AUGUST -> {
            int monthLength = month.toString().length();
            yield monthLength * 4;
        }
        default -> 0;
    };
    System.out.println(result2);

    }
}
