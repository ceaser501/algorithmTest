import java.util.Scanner;

public class Programmers_lv1_1 {

    public static void main(String args[]){
        System.out.println(solution(3, 5));
    }

    public static long solution(long a, long b) {
        if(a == b){
            System.out.println("두 값이 같음");
            return a;
        }else if(a > b){
            long i=0;

            i = a;
            a = b;
            b = i;

            System.out.println("두 값이 다름");
        }

        long answer = 0;
        long plusCnt = b-a;

        for(int j = 0; j<=plusCnt; j++){
            answer += (a + j);
        }

        return answer;
    }
}


//    두 정수 a, b가 주어졌을 때, a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
//    예를 들어 a = 3, b = 5 인 경우, 3+4+5=12 이므로 12를 리턴합니다.
//
//    제한 조건
//            1) a 와 b가 같은 경우는 둘중 아무수나 리턴하세요.
//            2) a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
//            3) a와 b의 대소관계는 정해져 있지 않습니다.
//
//      입출력의 예
//              a = 3, b = 5,  return 12
//              a = 3 , b = 3, return 3
//              a = 5 , b = 3, return 12
