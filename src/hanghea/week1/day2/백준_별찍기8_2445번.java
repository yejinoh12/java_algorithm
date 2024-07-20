package hanghea.week1.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 별찍기 2
 * 1. n을 입력 받고, n*2 크기의 빈 char array 만들기
 * 2. low 는 첫번째 인덱스, high는 마지막 인덱스 -> low++, high--하면서 별로 채워가기
 * 3. 그럼 char array는 모두 * 로 채워짐
 *
 * 4. 다시 mid(중간값) 에서 low, high 방향으로 별을 지워줘야하니까 midToLow, midToHigh 변수 두개 선언
 * 5. midToLow--, midToHigh++ 하면서 별을 지워 나감
 */
public class 백준_별찍기8_2445번 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] star = new char[n * 2]; //n*2크기의 배열 선언

        //빈 배열 생성
        //for (int i = 0; i < n * 2; i++) {
          //  star[i] = ' ';
        //}

        int low = 0; //처음 인덱스
        int high = 2 * n - 1; //마지막 인덱스

        for (int i = 0; i < n; i++) {
            star[low++] = '*'; //low를 증가시키며 중간으로 이동
            star[high--] = '*'; //high를 감소시키며 중간이로 이동 이동
            System.out.println(star);
        }

        // star는 모두 별이 되었음

        int midToLow = (low + high) / 2; //다시 low갈 mid
        int midToHigh = (low + high) / 2 + 1; //high로 갈 mid

        for (int i = 0; i < n - 1; i++) {
            star[midToLow--] = ' '; //low로 돌아가면서 별을 지움
            star[midToHigh++] = ' '; //high로 돌아가면서 별을 지움
            System.out.println(star);
        }

        System.out.println();
    }
}

