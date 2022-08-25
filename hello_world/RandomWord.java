import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.ArrayList;

public class  RandomWord {
    public static void main(String[] argv){
        String champion = "";
        int i = 1;
        while(!StdIn.isEmpty()){
            String s = StdIn.readString();
            boolean select = StdRandom.bernoulli(1.0/i);
            i++;
            if(select){
                champion = s;
            }
        }
        System.out.println(champion);
    }
}