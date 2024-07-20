package hanghea.week1.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 구구단 출력
 * 1. n단을 입력
 * 2. 반복문으로 n에 1~9까지 곱하기
 */
public class 백준_구구단_2739번 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i < 10 ; i++){
            System.out.printf("%d * %d = %d\n", n , i , n * i);
        }


    }
}
