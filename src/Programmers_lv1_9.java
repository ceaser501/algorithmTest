import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Programmers_lv1_9 {
    public static void main(String args[]){

        long result = solution(118372);
        System.out.println( result );
    }

    public static long solution(long n) {
        // Long형을 String[]에 담아, 읽으면서 ArrayList에 add
        ArrayList arrayList = new ArrayList();
        String[] number = String.valueOf(n).split("");
        for(String i : number){
            arrayList.add(i);
        }

        // 내림차순 정렬
        Collections.sort(arrayList, Collections.reverseOrder());

        // StringBuilder 에 arrayList의 원소를 append
        StringBuilder builder = new StringBuilder();
        Iterator it = arrayList.iterator();
        while(it.hasNext()){
            builder.append(it.next());
        }

        // Long형으로 builder 변환 return
        return Long.parseLong(builder.toString());
    }
}

//        함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
//
//        제한 조건
//        n은 1이상 8000000000 이하인 자연수입니다.
//        입출력 예
//            n           return
//        118372          873211
