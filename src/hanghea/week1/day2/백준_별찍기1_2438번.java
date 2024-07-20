package hanghea.week1.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 별찍기
 * 1. 별 행의 개수를 n으로 입력받음 : i
 * 2. 별 열의 개수는 행의 개수와 동일해 져야함 : j
 * 3. j를 1씩 증가시키며 i와 같아질 때까지 별 출력
 */

public class 백준_별찍기1_2438번 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) { //별 행의 개수 i
            for (int j = 0; j <= i; j++) { //열의 개수 j는 행의 개수 i 와 같아져야 하니까 j가 i와 같아질 때까지 출력
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
