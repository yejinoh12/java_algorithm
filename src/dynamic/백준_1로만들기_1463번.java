package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준_1로만들기_1463번 {

    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(makeOne(n));

    }

    public static int makeOne(int n) {


        if(n==1) return count;

        if (n % 3 == 0) {
            n/= 3;
        } else if (n % 3 == 1) {
            n -= 1;
        } else if (n % 2 == 1) {
            n -= 1;
        } else if(n % 2 == 0){
            n /= 2;
        }

        count++;

        return makeOne(n);
    }
}
