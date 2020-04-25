import java.util.GregorianCalendar;

public class Programmers_lv1_3 {

    public static void main(String args[]){
        System.out.println(leapYear(2019));
        System.out.println(leapYearFnc(2019));
    }

    public static boolean leapYear(int year){
        boolean leapYearYn = false;

        if((year % 4 == 0 && year % 100 !=0 ) || (year % 400 == 0)){
            leapYearYn = true;
        }

        return leapYearYn;
    }

    public static boolean leapYearFnc(int year){
        boolean leapYearYn = false;

        GregorianCalendar gc = new GregorianCalendar();
        if (gc.isLeapYear(year)) {
            leapYearYn = true;
        }

        return leapYearYn;
    }
}


// 윤년 평년 구하기 (param = 년도)
//
// 1. 윤년은 4년에 한번 발생 (year % 4 == 0)
// 2. 1의 조건을 만족 하는 것 중, 100년 마다 평년 (year % 100 == 0)
// 3. 2의 조건을 만족 하는 것 중, 400년 마다 윤년 (year % 400 == 0)
//
// 위의 조건을 토대로 윤년 = [년도를 4로 나눈 나머지가 0] 이면서(and), [년도를 100으로 나눈 것이 0이 아니거나] [400으로 나눈 나머지가 0인 것]
// 기본값 "평년"
