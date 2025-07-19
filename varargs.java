public class varargs {

    public static String formatWithVarArgs(String... values){ //each method can have only one varargs param and it should be the last one
        return "hi";
    }
    public static void main(String[] args) {
        formatWithVarArgs("a", "b","c","d");
        formatWithVarArgs("a", "b","c");

    }
}
