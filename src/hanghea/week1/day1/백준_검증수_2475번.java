package hanghea.week1.day1;

import java.io.*;

public class 백준_검증수_2475번 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] str = bf.readLine().split(" ");
        int[] number = new int[5];

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            number[i] = Integer.parseInt(str[i]) * Integer.parseInt(str[i]);
            sum += number[i];
        }

        int result = sum % 10;
        System.out.println(result);
    }
}

/**
 * 반복문을 돌면서 제곱된 값을 number 배열에 넣고, 변수 sum에 누적해서 더함
 * sum을 10으로 나눈 나머지를 변수 result에 저장하고 출력
 */