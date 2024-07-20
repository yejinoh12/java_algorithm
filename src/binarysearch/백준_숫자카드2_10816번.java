package binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class 백준_숫자카드2_10816번 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine()); // 원래 있는 카드 개수
        int[] card = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); //원래 있는 카드

        Arrays.sort(card); //정렬

        int num2 = Integer.parseInt(bf.readLine()); //비교 할 숫자카드 개수
        int[] findCard = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); //비교할 숫자카드

        int result = 0;

        for (int i = 0; i < num2; i++) {

            int startIndex = binaryFirstSearch(card, findCard[i]); //첫번째 인덱스
            int endIndex = binaryLastSearch(card, findCard[i]); //두번째 인덱스

            if (startIndex != -1 && endIndex != -1) {
                result = endIndex - startIndex + 1; //숫자 카드가 있다면 정답 저장
            }else{
                result = 0; //없다면 0
            }
            System.out.print(result + " ");


        }
    }

    public static int binaryFirstSearch(int[] arr, int key) {

        int low = 0;
        int high = arr.length -1 ;


        while (low <= high) {
            int mid = (low + high) / 2;

            if (key > arr[mid]) {
                low = mid + 1;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                if (mid == 0 || arr[mid - 1] != key) { //mid의 인덱스가 가장 앞이고, mid의 앞 인덱스가 키값이 아니라면
                    return mid;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static int binaryLastSearch(int[] arr, int key) {

        int low = 0;
        int high = arr.length -1 ;


        while (low <= high) {
            int mid = (low + high) / 2;

            if (key > arr[mid]) {
                low = mid + 1;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                if (mid == arr.length - 1 || arr[mid + 1] != key) { //mid의 인덱스가 가장 앞이고, mid의 앞 인덱스가 키값이 아니라면
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
}
