package IO.task01;

import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int result = 0;
        int n = inputStream.read();
        while(n > -1) {
            result = Integer.rotateLeft(result, 1) ^ n;
            n = inputStream.read();
        }
        return result;
    }
}
