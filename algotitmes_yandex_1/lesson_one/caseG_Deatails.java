import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Deatails {

    public static void main(String[] args) throws Exception{
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String in = b.readLine();
        String[] numbers = in.split(" ");
        int N = Integer.parseInt(numbers[0]);
        int K = Integer.parseInt(numbers[1]);
        int M = Integer.parseInt(numbers[2]);
        int count = 0;
        while (N >= K) {
            int countWorkPieces = N / K;
            int countDetails = K / M;
            if (countWorkPieces <= 0 || countDetails <= 0) {
                break;
            }
            N = (N % K) + (K % M) * countWorkPieces;
            count += countWorkPieces * (countDetails);
        }
        System.out.println(count);
    }
}