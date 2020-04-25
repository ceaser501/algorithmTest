import java.util.*;

public class Codility1 {

    public static void main(String args[]){
        //System.out.println(solution(5));
        System.out.println(solution(20));
        //System.out.println(solution(32));
        //System.out.println(solution(529));
        //System.out.println(solution(1041));
    }

    public static int solution(int N) {
        ArrayList arrayList = new ArrayList();
        while(N >= 1){
            arrayList.add(String.valueOf(N%2));
            N = N/2;
        }



        String[] spText = String.join("", arrayList).split("1");
        int max = 0;

        for(int i=0; i<spText.length; i++){
            if(spText.length == 1)
                return 0;

            if(max < spText[i].length()){
                max = spText[i].length();
            }
        }

        return max;

//        for(int i=0; i<arrayList.size(); i++){
//
//            System.out.print(arrayList.get(i));
//        }

//        int count = 0;
//        int max = 0;
//
//        while(N > 0){
//            if(N%2 == 0){
//                count++;
//            }
//
//            if((N%2 == 1) || (N/2 == 1)){
//                if(max < count){
//                    max = count;
//
//                    count = 0;
//                }
//            }
//
//            N = N/2;
//        }
//        System.out.println(max);
//
//        return max;
    }
}

