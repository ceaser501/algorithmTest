public class Programmers_lv1_4 {
    public static void main(String args[]){

        System.out.println(solution("test"));
        System.out.println(solution("tettsst"));
    }

    public static String solution(String s) {
        int length = s.length();

        if(length %2 == 0){
            return s.substring(length/2-1, length/2+1 - length%2);
        }else{
            return s.substring(length/2, length/2+1);
        }


//        String[] txtArray = s.split("");
//        ArrayList<String> list = new ArrayList<>(Arrays.asList(txtArray));
//
//        String answer = "";
//        StringBuilder builder = new StringBuilder();
//
//        switch(s.length()%2){
//            case 0:
//                builder.append(list.get(s.length()/2-1)).append(list.get(s.length()/2));
//                break;
//            case 1:
//                builder.append(list.get(s.length()/2));
//                break;
//            default:
//                System.out.println("입력 값 오류");
//                break;
//        }
//
//        answer = builder.toString();
//
//        return answer;
    }
}


//        // 짝수
//        if(s.length() % 2 == 0){
//        answer += String.valueOf(s.charAt(    (s.length() / 2) -1   ));
//        answer += String.valueOf(s.charAt(    (s.length() / 2)   ));
//        }else{
//        answer = String.valueOf(s.charAt((s.length()-1) / 2));
//        }



//    단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
//            재한사항
//    s는 길이가 1 이상, 100이하인 스트링입니다.
//
//    입출력 예
//    s  abcde , return c
//       qwer  , return we
