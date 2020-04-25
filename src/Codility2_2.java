import java.util.*;

public class Codility2_2 {

    public static void main(String args[]){

        int[] A = {9, 3, 9, 3, 9, 7, 9};

         System.out.print(solution(A));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8

        int result = 0;

        for (int i : A)
            result = result ^ i;

        return result;

//        if(A.length == 1)
//            return A[0];
//
//        if(A.length %2 == 0)
//            return 0;
//
//        ArrayList list = new ArrayList();
//        HashSet<Integer> set = new HashSet<>();
//
//        for(int i : A){
//            list.add(i);
//            set.add(i);
//        }
//
//        int answer = 0;
//        for(int value : set){
//            int count = Collections.frequency(list, value);
//
//            if(count %2 != 0){
//               return value;
//            }
//        }
//
//        return answer;
    }
}




//int count = Collections.frequency(Arrays.asList(A), value);         // Arrays.asList로 배열을 list로 바꾼다면, Integer[] A 일때만 사용가능
