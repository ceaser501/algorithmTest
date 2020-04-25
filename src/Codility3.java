import java.util.*;

public class Codility3 {

    public static void main(String args[]){
        int[] A = {1, 3, 6, 4, 1, 2};
        //int[] A = {-1, -3};
        //int[] A = {1, 2, 3, 4, 5};
        //int[] A = {5, 3, 8, 5, 2, 6, 5, 7, 2, 1};
        //int[] A = {2};

        System.out.println(solution(A));

    }

    public static int solution(int[] A) {
            Set<Integer> foundNums = new HashSet();

            for (int a : A) {
                foundNums.add(a);
            }

            for (int i = 1; i <= Integer.MAX_VALUE; i++) {
                if (!foundNums.contains(i)) {
                    return i;
                }
            }

            return -1;
        }
}

