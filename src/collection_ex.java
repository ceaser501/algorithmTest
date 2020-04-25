import java.util.*;
import java.util.stream.Collectors;

public class collection_ex {

    public static void main(String args[]){
        int[] arr = {2, 4, 9, 7, 5, 2};
        System.out.println("=======================================");
        System.out.println("정렬 전 : [2, 4, 9, 7, 5, 2]");
        System.out.println("=======================================");

        // JAVA 8 : 내림차순 [9, 7, 5, 4, 2, 2]
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collections.sort(list, Comparator.reverseOrder());


        System.out.println("내림차순 정렬(1) : " + list);
        System.out.println("=======================================");

        // 일반적 : 내림차순 [9, 7, 5, 4, 2, 2]
        List<Integer> arrList = new ArrayList();
        List<Integer> arrList2 = new ArrayList();
        List<Integer> arrList3 = new ArrayList();
        for(int i : arr){
            arrList.add(i);
            arrList2.add(i);
            arrList3.add(i);
        }

        Collections.sort(arrList, Collections.reverseOrder());

        System.out.println("내림차순 정렬(2) : " + arrList);
        System.out.println("=======================================");

        Collections.sort(arrList2);
        System.out.println("오름차순 정렬 : " + arrList2);
        System.out.println("=======================================");

        Collections.reverse(arrList3);
        System.out.println("역순 정렬 : " + arrList3);
        System.out.println("=======================================");
    }
}

