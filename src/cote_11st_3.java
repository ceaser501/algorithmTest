import java.util.*;

public class cote_11st_3 {

    public static void main(String args[]){

        int N = 5;      // 길이
        int K = 2;      // 문자구성

        System.out.println(solution(N, K));
    }

    public static String solution(int N, int K) {
        Random rnd = new Random();
        StringBuilder result = new StringBuilder();

        // 예외상황 처리 >> K가 1 일 때
        if(K == 0) {
            return null;
        }else if(K == 1){
            for(int i=0; i<N; i++){
                result.append("a");
            }

            return result.toString();
        }

        // 예외상황 처리 >> 길이가 홀수 일 때와 짝수 일 때
        if((N%2 == 0 && (N/2 < K)) || N%2 != 0 && (N/2+1 < K)){
            return null;
        }

        String[] textSet = new String[N];
        for(int i=0; i<K; i++){
            String randomStr = String.valueOf((char) ((int) (rnd.nextInt(26)) + 97));   // 랜덤 영소문자 생성

            // 동일한 값이 있는지 체크 >> 없으면 넣는다 (문자 구성이 달라질 수 있으므로..)
            List<String> list = Arrays.asList(textSet);
            if(!list.contains(randomStr)){
                textSet[i] = randomStr;
            }
        }

        int halfIndex = N/2;

        StringBuilder builder = new StringBuilder();

        for(int i=1; i<=halfIndex; i++){                // 랜덤 index가 1부터 돌려서, 결과 StringBuilider 에 중간 전 지점까지 넣는다
            if(i >= K){
                builder.append(textSet[i-K]);
                result.append(textSet[i-K]);
            }else{
                builder.append(textSet[i]);
                result.append(textSet[i]);
            }
        }

        if(N%2 != 0)
            result.append(textSet[0]);                 // 중간지점 추가 (홀수 일 때)

        String[] str = builder.toString().split("");
        ArrayList<String> arrayList = new ArrayList(Arrays.asList(str));

        Collections.reverse(arrayList);                 // 0~중간전 인덱스까지를 역순정렬

        for(int i=0; i<arrayList.size(); i++){          // 0 ~ 중간 ~ 역순정렬 String을 합쳐줌
            result.append(arrayList.get(i));
        }

        return result.toString();
    }
}





//
//        Random rnd = new Random();
//
//        String[] resultArray = new String[N];
//        String[] textSet = new String[N];
//        // 랜덤 영소문자 생성
//        for(int i=0; i<K; i++){
//            textSet[i] = String.valueOf((char) ((int) (rnd.nextInt(26)) + 97));   // 2개 a b , 3개 a b c
//        }
//
//
//        System.out.println((N/2)-1);
//        for(int j=0; j<(N/2)-1; j++){
//            resultArray[j] = textSet[j];
//        }
//
//
//        for(int j=0; j<(N/2)-1; j++){
//            System.out.println(resultArray[j]);
//        }
//
//
//
//        return str;
//    }
//}


//
//
//if(     == 0){
//        return 0;
//        return null;
//        return false;
//        }
//
//// length가 0이나 1이면 -1 return
//        if(arr.length <= 1){
//        return new int[] {-1};
//        }
//
//
//
//        System.out.println("a  : " + a);
//








//
//    int half = N/2;
//    char ch = 'a';
//    char[] buffer = new char[N];
//
//
//        if( N % 2 == 0) {
//                int diff = half - K;
//                for(int i=0; i<half; ++i) {
//        buffer[i] = ch;
//        buffer[N-i-1] = ch;
//
//        if(i<diff)
//        continue;
//        ++ch;
//        }
//        }else {
//        int diff = half - K;
//        for(int i=0; i<half; ++i) {
//        buffer[i] = ch;
//        buffer[N-i-1] = ch;
//
//        if(i<diff)
//        continue;
//        ++ch;
//        }
//        --ch;
//        buffer[half] = ch;
//        }
//
//        StringBuilder builder = new StringBuilder();
//        for(int j=0; j<buffer.length; j++){
//        builder.append(buffer[j]);
//        }

//return builder.toString();
