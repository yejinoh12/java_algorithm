package hanghea.week1.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

//HashMap을 사용했는데 키값이 배열의 인덱스가 될 수 있으므로 배열을 사용하는게 나았을 것 같음
public class 백준_2007년_1924번 {

    public static void main(String[] args) throws IOException {

        Map<Integer, Integer> month = new HashMap<>(Map.of());
        month.put(1, 31);
        month.put(2, 28);
        month.put(3, 31);
        month.put(4, 30);
        month.put(5, 31);
        month.put(6, 30);
        month.put(7, 31);
        month.put(8, 31);
        month.put(9, 30);
        month.put(10, 31);
        month.put(11, 30);
        month.put(12, 31);

        Map<Integer, String> week = new HashMap<>();
        week.put(1, "MON");
        week.put(2, "TUE");
        week.put(3, "WED");
        week.put(4, "THU");
        week.put(5, "FRI");
        week.put(6, "SAT");
        week.put(0, "SUN");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int[] input = new int[2];

        for (int i = 0; i < 2; i++) {
            input[i] = Integer.parseInt(str[i]);
        }

        int days = 0;
        for (int i = 1; i < input[0]; i++) {
            days += month.get(i);
        }

        days += input[1];
        System.out.println(week.get(days%7));

        br.close();
    }
}
