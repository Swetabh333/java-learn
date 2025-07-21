public class class_types {



    interface Drivable{
        void honk();
        void drive();
    }

    public abstract class Vehicle{
        public abstract void honk();

        public void drive(){
            System.out.println("zoom");
        }
    }

    public class FancyCar extends Vehicle implements Drivable{
        public void honk(){
            System.out.println( "honk");
        }
    }

}
