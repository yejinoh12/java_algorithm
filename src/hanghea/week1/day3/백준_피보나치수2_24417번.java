package hanghea.week1.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준_피보나치수2_24417번 {

    static int count;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.print(dp_fib(n) + " ");
        // System.out.print(dp_fib(n) % 1_000_000_007 + " "); //
        System.out.print(count % 1_000_000_007);
    }


    public static int dp_fib(int n) {

        int [] f = new int [n + 1];

        f[1] = 1;
        f[2] = 1;

        for (int i = 3; i <= n; i++) {
            count++ ; //dp 카운트
            //f[i] = f[i - 1] + f[i - 2];
            f[i] = (f[i - 1] + f[i - 2]) % 1_000_000_007;
            /**
             * 여기서 1_000_000_007로 나눈 나머지를 구함
             * int 자료형 범위가 -2,147,483,648 ~ 2,147,483,647
             * 여기서 나누지 않고 메인에서 나머지를 구하게 되면
             * n의 최대값(200000000) 이 주어지면 범위를 넘어감
             * -->long은 메모리 초과
             */
        }

        return f[n];
    }

}
