

public class cote_11st_2 {

    public static void main(String args[]){

        int[][] A = new int[2][2];

        A[0][0] = 1;
        A[0][1] = 4;
        A[1][0] = 2;
        A[1][1] = 3;


        System.out.println(solution(A));

    }

    public static int solution(int[][] A) {
        int max = 0;

        for(int fy = 0; fy < A.length - 1; ++fy ){
            for(int  fx = 0; fx < A[fy].length; ++fx ){
                int value1 = A[ fy ][ fx ];

                for(int  sy = 0; sy < A.length; ++sy ){
                    if( sy == fy )
                        continue;

                    for(int  sx = 0; sx < A[sy].length; ++sx ){
                        if( sx == fx )
                            continue;

                        int value2 = A[ sy ][ sx ];
                        if( value1 + value2 > max )
                            max = value1 + value2;
                    }
                }
            }
        }

        return max;
    }
}

