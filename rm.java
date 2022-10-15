import java.util.*;
public class rm {
    public static void main(String[] args) {
        int o = 1;
        for (int i = 1; i <= 10; i++) {
            o *= i;
            System.out.println("After iteration " + i + " this is the value of o: " + o);
        }
        int oo = 1;

        for (int i = 1; i <= 10; i++) {
            oo = mult(oo, i);
            System.out.println("After iteration " + i + " this is the value of oo: " + oo);
        }
    }

    public static int mult(Integer o, Integer i) {
        o = (o*i);
        return o;
    }
}
