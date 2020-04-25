public class Programmers_lv1_2 {

    public static void main(String args[]){
        System.out.println(solution(5, 24));
    }

    // 2016년 1월 1일 = 금요일
    // solution을 많이 반복하는 경우, solution()에 아래 변수가 있으면 변수를 여러번 생성햇다가 파기하니까... 위로 빼는게 좋음
    // private static String day[] = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};


    public static String solution(int a, int b) {
        String answer = "";

        // 2016년 1월 1일 = 금요일
        String day[] = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int daySum = 0;

        // 1, 3, 5, 7, 8, 10, 12 = 31일
        // 2 = 29일 (윤년)
        // 4, 6, 9, 11 = 30일

        int dayCnt = 0;

        for(int i=1; i<a; i++){
            daySum += fncDayCnt(i);
        }

        daySum += b;
        answer = day[(daySum % 7)-1];

        return answer;
    }

    public static int fncDayCnt(int param){
        int dayCnt = 0;
        switch(param){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                dayCnt = 31;
                break;
            case 2:
                dayCnt = 29; break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayCnt = 30;
                break;
            default:
                System.out.println("월 계산 오류");
                break;
        }

        return dayCnt;
    }
}

//			2016년 1월 1일은 금요일입니다.
//			2016년 a월 b일은 무슨 요일일까요?
//			두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
//			요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT 입니다.
//			예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 TUE를 반환하세요.
//					제한 조건
//			2016년은 윤년입니다.
//			2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
