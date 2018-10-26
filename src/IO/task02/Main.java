package IO.task02;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        byte a, b;
        int i = 0;
        while ((a = (byte) System.in.read()) != -1){
            if (a == 13){
                b = a;
                i++;
                a = (byte) System.in.read();
                if (a == 10)
                    System.out.write(a);
                else if (a != -1){
                    System.out.write(b);
                    System.out.write(a);
                }
            } else if (a != -1){
                System.out.write(a);
                i++;
            }
        }
        System.out.flush();
    }
}
