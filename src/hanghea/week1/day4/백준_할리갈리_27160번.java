package hanghea.week1.day4;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * 접근 방법 : map<String, Integer> 자료구조를 이용해서 과일, 개수를 넣고
 * 숫자가 추가될 때마다 개수를 갱신, 갱신 된 숫자가 5 이면 YES, 아니면 NO
 */
public class 백준_할리갈리_27160번 {

    public static void main(String[] args) throws IOException {

        HashMap<String, Integer> card = new HashMap<>(); // 키값은 과일이 되고 , 값은 과일의 숫자가 되는 해시맵 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); //카드의 수

        for(int i = 0; i < n; i++){ //입련된 카드의 수만큼 반복
            String[] inputString = br.readLine().split(" ");
            String fruit = inputString[0]; //0번 인덱스는 과일
            Integer number = Integer.parseInt(inputString[1]); //1번 인덱스는 숫자
            card.put(fruit, card.getOrDefault(fruit, 0) + number); //원래 있던 밸류를 가져오고 거기에 나온 숫자를 더함(키가 없다며면 기본값은 0)
        }

        int count = 0;
        for(Integer i : card.values()){
            if(i == 5){
                count ++; //밸류가 5인게 있다면 카운트, 키값이 무엇인지는 중요하지 않고 5라는 숫자만 있다는 것만 알면 되므로 card.value() 로 가져옴
            }
        }
        System.out.println(count >= 1 ? "YES"  : "NO"); // 출력

    }
}
