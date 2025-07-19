public class primitives {
    static int x; //zero
    static byte empty; //also zero
    public static void main(String[] args) {
        //int y; int takes 32 bits
        //default int val is 0
        System.out.println(x); //must be defined if inside a method

        byte b = 100; // byte is only 8 bits so it can only go deom -128 to 127
        System.out.println(b);
        //short is 16 bits

        short s = 20_020;

        System.out.println(s);

        //long for 64 bits

        long l = 1_234_567_890;
        System.out.println(l);

        float f = 3.145f; //32-bit
        System.out.println(f);

        double d = 3.13457599923384753929348D; //64-bit
        System.out.println(d);

        boolean bo = true;
        System.out.println(bo);

        //char is 16 bit
        char c = 'a';
        System.out.println(c);

        //overflow
        int i  = Integer.MAX_VALUE;
        int j = i + 1;

        double do1 = Double.MAX_VALUE;
        double do2 = do1 + 1;

        System.out.println(j);
        System.out.println(do2);

        //autoboxing
        Integer i2 = 1;
        Character c2 = 'H';

        System.out.println(c2 + i2);


    }
}
