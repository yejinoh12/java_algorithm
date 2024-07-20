package hanghea.week1.day3;

/**
 * 문제에 있는 의사코드를 그대로 적음
 * 해당 코드가 호출될 때마다 카운트 변수를 ++ 시킴
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준_피보나치수1_24416번 {

    static int rec_fib_count = 0; //재귀 호출 횟수를 저장하는 변수
    static int dp_fib_count = 0; //dp 호출 횟수를 저장하는 변수

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        rec_fib(n);
        System.out.println(rec_fib_count);

        dp_fib(n);
        System.out.println(dp_fib_count);
    }

    //재귀 호출
    public static int rec_fib(int n) {

        if (n == 1 || n == 2) {
            ++rec_fib_count; //호출 되는 부분
            return 1;
        } else {
            return (rec_fib(n - 1) + rec_fib(n - 2));
        }
    }

    //DP 적용
    public static void dp_fib(int n) {

        int[] f = new int[n + 1];

        f[1] = 1;
        f[2] = 1;

        for (int i = 3; i <= n; i++) {
            ++dp_fib_count; //호출 되는 부분
            f[i] = f[i - 1] + f[i - 2];
        }
    }
}
