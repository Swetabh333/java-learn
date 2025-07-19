import packages.tools.AdvCalc;

public class useCalc {
    public static void main(String[] args) {
        AdvCalc calc = new AdvCalc();
        System.out.println(calc.add(5, 10));
        System.out.println(calc.sub(15, 5));
        System.out.println(calc.mul(20, 30));
        System.out.println(calc.div(15, 5));
    }    
}
