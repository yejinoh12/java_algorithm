package hanghea.week1.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * 접근 방법
 * 이중 포문을 돌면서 문자열을 계속 연결해가고, 연결된 문자열을 set에 넣기..??
 */
public class 백준_서로다른부분문자열의개수_11478번 {

    public static void main(String[] args) throws IOException {

        Set<String> words = new HashSet<>(); //중복 방지를 위해 Set 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        for(int i = 0; i < str.length(); i++){

            String string = "";
            char c = str.charAt(i); // 기준 문자열 str.charAt(i) 을 기준으로 문자열을 더해가기
            string += c;
            words.add(string); //기준 문자열을 더함

            for(int j = i + 1; j < str.length(); j++){

                string += str.charAt(j); //더해나가면서
                words.add(string); //Set에 넣기

            }
        }

        System.out.println(words.size());

    }
}
