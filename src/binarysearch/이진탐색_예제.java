package binarysearch;

import java.util.ArrayList;
import java.util.List;

public class 이진탐색_예제 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(9,2,1,6,4,3));
        list.sort(null);
        System.out.println("sortingList: " + list);
        System.out.println("index of 3: " + binarySearch(list,3));
    }

    public static int binarySearch(List<Integer> list, int key){

        int low = 0;
        int high = list.size()-1;

        while(low <= high){

            int mid = (low + high) / 2;

            if(list.get(mid) > key){
                high = mid - 1;
            }else if(list.get(mid) < key){
                low = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
