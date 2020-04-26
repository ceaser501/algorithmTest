import java.util.*;

public class cote_11st_3 {

    public static void main(String[] args){

        int N = 5;      // 길이
        int K = 2;      // 문자구성

        System.out.println(solution(N, K));
    }

    public static String solution(int N, int K) {
//        Random rnd = new Random();  // 굳이 상단에 표현할 필요가 없음;
//        StringBuilder result = new StringBuilder();  // 굳이 상단에 표현할 필요가 없음;

        // 예외상황 처리 >> K가 1 일 때
        if(K == 0) {
            return null;
        }else if(K == 1){
            return new String(new char[N]).replace("\0", "a");
        }else
        // 예외상황 처리 >> 길이가 홀수 일 때와 짝수 일 때
        if((N%2 == 0 && (N/2 < K)) || N%2 != 0 && (N/2+1 < K)){
            return null;
        }

//        String[] textSet = new String[N];
        Random rnd = new Random();
        Set<Character> set = new HashSet<>();
        Set<Integer> index = new HashSet<>();
        while(set.size() < K){
//            List<String> list = Arrays.asList(textSet);  // FAULT: 왜 매번 Arrays.asList 를 해야만 했는가?
            set.add((char) (rnd.nextInt(26) + 97));
            index.add(rnd.nextInt(N/2));
        }
        while(index.size() <  K) {
            index.add(rnd.nextInt(N/2));
        }
        Character[] setArray = set.toArray(new Character[K]);
        Integer[] indexArray = index.toArray(new Integer[K]);

        StringBuilder text = new StringBuilder();
        for(int i = 0; i< N/2; i++){                // 랜덤 index가 1부터 돌려서, 결과 StringBuilder 에 중간 전 지점까지 넣는다
            text.append(setArray[rnd.nextInt(K)]);
        }

        for(int i = 0; i< indexArray.length; i++){
            text.setCharAt(indexArray[i], setArray[i]);
        }

        StringBuilder result = new StringBuilder(text);
        if(N%2 != 0) {
            result.append(setArray[rnd.nextInt(K)]);                 // 중간지점 추가 (홀수 일 때)
        }
        text.reverse();
        result.append(text);

        return result.toString();
    }
}
