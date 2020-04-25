import java.util.ArrayList;
import java.util.Collections;

public class Programmers_lv1_8 {

    public static void main(String args[]){
        int[] arr = {4,3,2,1};

        int[] result = solution(arr);
        for(int i=0; i<result.length; i++){
            System.out.println( result[i] );
        }
    }

    public static int[] solution(int[] arr) {
        // length가 0이나 1이면 -1 return
        if(arr.length <= 1){
            return new int[] {-1};
        }

        ArrayList arrayList = new ArrayList();
        for(int i : arr){
           arrayList.add(i);
        }

        int min = (int) Collections.min(arrayList);         // 최소값
        int index = arrayList.indexOf(min);                 // 최소값 인덱스

        arrayList.remove(index);                            // arrayList에서 최소값 인덱스 위치 값 제거

        int[] answer = new int[arrayList.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = (int) arrayList.get(i);
        }

        return answer;
    }
}


//        정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
//                제한 조건
//        arr은 길이 1 이상인 배열입니다.
//        인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
//        입출력 예
//        arr       return
//     [4,3,2,1]    [4,3,2]
//         [10]        [-1]
