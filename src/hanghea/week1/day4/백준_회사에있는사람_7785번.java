package hanghea.week1.day4;

import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 데이터를 넣을 때부터 정렬을 해주는 트리맵을 사용해볼까 했는데 반대 정렬을 어떻게 하는지 몰라서
 * 리스트에 이름을 넣어넣고 반대로 정렬했다.
 * 배운점: tree map 선언시 Collections.reverseOrder()를 넣어주면 반대로 정렬이 가능하다!!
 */
public class 백준_회사에있는사람_7785번 {

    public static void main(String[] args) throws IOException {

        Map<String, String> statusMap = new HashMap<>(); // 키값은 이름이고 밸류는 상태
        List<String> getName = new ArrayList<>(); // 키값은 이름이고 밸류는 상태
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] inputString = br.readLine().split(" ");
            String name = inputString[0];
            String status = inputString[1];
            statusMap.put(name, status); //map은 키가 있다면 기존 값을 덮어쓰니까 그냥 해도 될 것 같음
        }

        for (String str : statusMap.keySet()) {
            if (statusMap.get(str).equals("enter")) {
                getName.add(str);
            }
        }

        getName.sort(Comparator.reverseOrder());

        for (String str : getName) {
            System.out.println(str);
        }
    }
}
