import java.util.ArrayList;

public class Codility2 {

    public static void main(String args[]){
        int[] A = {};
        int[] B = solution(A , 42);
        for(int i=0; i<B.length; i++){
            System.out.print(B[i]);
        }
    }

    public static int[] solution(int[] A, int K) {
        // write your code in Java SE 8

        // A길이와 K가 같으면 제자리
        // A길이보다 K가 크면, 길이뺀 만큼으로 계산
        // A길이보다 K가 작으면, index+K하는데, 길이보다 크면 길이뺀 걸 index로
        int len = A.length;
        int[] answer = new int[A.length];

        if(len == 0  || len == 1  || K == 0 || len == K){
            return A;
        }else if(len < K){
            K = K%len;
        }

        for(int i=0; i<len; i++){
            if((i+K) >= len){
                answer[i+K-len] = A[i];
            }else{
                answer[i+K] = A[i];
            }
        }

        return answer;
    }
}

