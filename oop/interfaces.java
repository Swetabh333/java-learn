package oop;

public class interfaces {
    
    public interface Electronic {
        String LED = "LED"; //public static and final by definitiong
        
        int getElectrictyUse();
        
        static boolean isEnergyEfficient(String electronicType){
            if (electronicType.equals(LED)) {
                return true;
            }
            return false;
        }

        default void printDescription(){
            System.out.println("Electronic Description");
        }
    }

    public class Computer implements Electronic {
        public int getElectrictyUse(){
            return 1000;
        }
    }
}
