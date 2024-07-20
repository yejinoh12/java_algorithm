package hanghea.week1.day1;

/**
 * 1. 사이즈 3 배열에 입력 받고 정렬
 * 2. 정렬 후 중간값을 앞과 뒷자리수랑 비교
 * 3. 중간자리와 앞자리 수 또는 뒷자리 수가 같다면 앞 과 뒷자리 수를 한번 더 비교
 * 4. 앞과 뒤가 같다면 모두 일치, 아니라면 두개만 일치(중간값이 일치하는 숫자가 됨)
 * 5. 중간자리가 앞자리, 뒷자리와 모두 같지 않으면 아무것도 일치하지 않음
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class 백준_주사위세계_2480번 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] array = bf.readLine().split(" ");
        ArrayList<Integer> dice = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            dice.add(Integer.parseInt(array[i]));
        }

        dice.sort(null); //정렬
        System.out.println(dice);

        int result = 0;

        if (dice.get(1).equals(dice.get(0)) || dice.get(1).equals(dice.get(2))) { //중간자리, 앞자리 또는 중간자리 , 뒷자리가 같다면

            if (dice.get(0).equals(dice.get(2))) { //앞자리와 뒷자리 비교
                result = 10000 + dice.get(0) * 1000; //모두 일치하는 경우
            } else {
                result = 1000 + dice.get(1) * 100; //한번만 일치하는 경우
            }
        } else {
            result = Collections.max(dice) * 100; //모두 일치하지 않는 경우
        }

        System.out.println(result);
    }
}
