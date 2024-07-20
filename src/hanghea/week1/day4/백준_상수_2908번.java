package hanghea.week1.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 접근 방법
 * 숫자를 두개 받아오고, 뒷자리 수부터 비교하기 --> 복잡하다
 * 다시 생각 : 스트링빌더의 리버스를 이용해보자!!
 */

public class 백준_상수_2908번 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] number = bf.readLine().split(" ");

        String reversedNum1 = new StringBuilder(number[0]).reverse().toString();
        String reversedNum2 = new StringBuilder(number[1]).reverse().toString();

        System.out.println(Math.max(Integer.parseInt(reversedNum1), Integer.parseInt(reversedNum2)));

    }
}
