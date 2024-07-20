package hanghea.week1.day4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 접근 방법 : 문자열을 split 하고 length 구하기 --> 실패
 * 문자열이 공백으로 시작하거나 끝날 수 있으니까 공백인 문자는 카운트 하지 않기
 */
public class 백준_단어의개수_1152번 {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputString = br.readLine();
        String[] splitString = inputString.split(" "); //문자열 split
        for(String s : splitString){
            System.out.println(s);
        }

        int length = 0;
        for(String str : splitString){
            if (!str.isBlank()){
              length += 1;
            }
        }

        System.out.println(length); //길이 출력
    }
}
