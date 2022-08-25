

public class HelloGoodbye {
    public static void main(String[] argv){
        String s = "Hello " + argv[0] + " and " + argv[1] + ".";
        String s2 = "Goodbye " + argv[1] + " and " + argv[0] + ".";

        System.out.println(s);
        System.out.println(s2);
    }
}