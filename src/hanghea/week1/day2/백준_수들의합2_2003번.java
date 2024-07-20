package hanghea.week1.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 처음 생각 : 이중 포문으로 모든 경우의 수 탐색 --> 시간 초과
 * for 문을 돌 때 sum의 값이 num을 초과할 경우에 대해서  break를 걸지 않음
 * 배운 것 : 루프가 돌때는 종료 조건에 대해서 한번 더 생각해보기
 */

public class 백준_수들의합2_2003번 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            array[i] = i + 1;
        }

        int count = 1; //자기 자신은 항상 포함

        for (int i = 0; i < n - 1; i++) {

            int sum = 0;

            for (int j = i; j < n - 1; j++) {
                sum += array[j];

                if(sum == n){
                    count++;
                    break;
                }

                if(sum > n){  // 이 부분 추가
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
