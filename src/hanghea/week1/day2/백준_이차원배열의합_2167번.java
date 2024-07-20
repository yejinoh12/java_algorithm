package hanghea.week1.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 1. 탐색을 시작할 좌표를 구함(i, j) --> 배열의 인덱스를 결정
 * 2. 몇번을 탐색할지를 구함 (x - i, y - j)  --> 루프 회수를 결정
 * 3. 값을 더하고 출력
 */
public class 백준_이차원배열의합_2167번 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] num = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); //2차원 배열의 크기 입력
        int n = num[0]; //행
        int m = num[1]; //열

        int[][] array = new int[n][m]; //입력 받을 배열 선언

        for (int i = 0; i < n; i++) {
            int[] tmp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < m; j++) {
                array[i][j] = tmp[j]; //배열 저장
            }
        }

        int k = Integer.parseInt(br.readLine()); //k개의 줄 입력
        int[] resultArr = new int[k]; //k개의 줄에 대한 정답을 담을 배열 선언

        for (int i = 0; i < k; i++) {

            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int rowCount = input[2] - input[0] + 1; //탐색할 행의 수
            int colCount = input[3] - input[1] + 1; //탐색할 열의 수

            int startRow = input[0] - 1; //탐색 시작할 행의 인덱스
            int startCol = input[1] - 1; //탐색 시작할 열의 인덱스

            for (int j = 0; j < rowCount; j++) {
                for (int z = 0; z < colCount; z++) {
                    resultArr[i] += array[startRow][startCol++];
                }

                startRow ++ ; //열 추가
                startCol = input[1] - 1; //행은 계속 반복되므로 초기화
            }

        }

        for (int i : resultArr) {
            System.out.println(i);
        }

    }
}
