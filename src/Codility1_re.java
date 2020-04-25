public class Codility1_re {

    public static void main(String args[]){
        System.out.println(solution(561892));
    }
    public static int solution(int N) {
       String binaryN = Integer.toBinaryString(N);

       char[] binaryCharN = new char[binaryN.length()];
       for(int i=0; i<binaryN.length(); i++){
           binaryCharN[i] = binaryN.charAt(i);
       }

       int max = 0;
       int count = 0;
       for(int j=0; j<binaryCharN.length; j++){

           if(binaryCharN[j] == '0')
               count++;

           if(binaryCharN[j] == '1'){
                if(max < count){
                    max = count;
                }
               count = 0;
           }
       }

       if(max == 0){
           return 0;
       }

        return max;
    }
}

