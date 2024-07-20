package hanghea.week1.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 붕어빵
 * 1. n,m입력 받고
 * 2. 인덱스를 반전해서 결과값에 저장하고
 * 3. 출력
 */
public class 백준_뜨거운붕어빵_11945번 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] num = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = num[0];
        int m = num[1];

        char[][] result = new char[n][m];

        for (int i = 0; i < n; i++) {
            int k = m; //마지막 인덱스를 k에 저장
            char[] ch = br.readLine().toCharArray();
            for (int j = 0; j < m; j++) {
                result[i][j] = ch[--k]; //k를 감소시켜서 반전된 결과 값을 result에 저장
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}
