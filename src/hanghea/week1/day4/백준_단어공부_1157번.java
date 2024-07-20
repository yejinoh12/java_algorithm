package hanghea.week1.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * 접근법 --> 할리갈리와 비슷하게 풀 수 있을 것 같다.
 * 처음 받은 스트링을 모두 대문자로 바꾸고 시작
 * 이것도 맵을 사용해서 풀 수 있을 듯, 단어를 키로 놓고 키값이 들어올 때마다 밸류를 카운트
 * 값이 가장 높은 것이 하나 일 경우 해당 키를 출력, 두개 이면 ? 출력
 */

public class 백준_단어공부_1157번 {

    public static void main(String[] args) throws IOException {

        HashMap<Character, Integer> words = new HashMap<>(); // 키값은 알파벳이 되고, 밸류는 카운티한 숫자가 됨

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] inputStr = br.readLine().toUpperCase().toCharArray(); //대문자로 바꾸고 char 배열로 바꿈

        for (int i = 0; i < inputStr.length; i++) {
            words.put(inputStr[i], words.getOrDefault(inputStr[i], 0) + 1); // 키값이 있다면 원래 있던 값에 +1, 키값이 없다면 0
        }

        char maxChar = ' '; //정답 캐릭터 변수를 담을 char 변수 선언
        int max = 0; // 갱신해갈 max 변수
        boolean findEqual = false; //동일한 값이 있다면 true

        for (Character c : words.keySet()) {  //맵을 조회
            if (words.get(c) > max) { //조회하는 값이 기존 max 보다 크다면
                max = words.get(c); //max 갱신
                maxChar = c; //maxChar 도 갱신
                findEqual = false; //값을 갱신했다면 false
            } else if (words.get(c) == max) { //동일한 값이 있다면
                findEqual = true; //상태를 true
            }
        }

        System.out.println(findEqual ? "?" : maxChar); //동일한 값이 있다면 ? 없다면 maxChar
    }
}
