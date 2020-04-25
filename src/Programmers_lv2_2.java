import java.util.*;

public class Programmers_lv2_2 {
    //프렌즈4블록

    public static void main(String args[]){
//        String[][] board = { {"T","T","T","A","N","T"},
//                             {"R","R","F","A","C","C"},
//                             {"R","R","R","F","C","C"},
//                             {"T","R","R","R","A","A"},
//                             {"T","T","M","M","M","F"},
//                             {"T","M","M","T","T","J"} };

        String[] board = {"CCBDE", "AAADE", "AAABF", "CCBBF"};

        solution(4, 5, board);
    }

    public static int solution(int m, int n, String[] board) {
        String[][] boardArray = new String[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                boardArray[i][j] = String.valueOf(board[i].charAt(j));
            }
        }

        // 2차원 출력
       for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(boardArray[i][j]);
                if((j+1)%n == 0){
                    System.out.println();
                }
            }
        }

        int answer = 0;

        // 2X2로 사라지고, 사라진 좌표를 hashSet에 담아서 중복 제거하고 count를 answer에 담음
        // 사라진 좌표의 가장 큰 row 위치로, 사라지지 않은 좌표들이 내려옴
        // 또다시 2x2로 비교해서, 같으면 사라진 좌표를 다시 hashset에 담아서 중복제거하고 count를 answer에 담음
        Set hashSet = new HashSet();
        for(int i=0; i<m-1; i++) {                    // i = 0,1,2,3
            for (int j = 0; j<n-1; j++) {             // j = 0,1,2,3,4

                if( boardArray[i][j].equals(boardArray[i][j+1]) &&
                    boardArray[i][j].equals(boardArray[i+1][j]) &&
                    boardArray[i][j].equals(boardArray[i+1][j+1])){

                    hashSet.add(i + String.valueOf(j));
                    hashSet.add(i + String.valueOf(j+1));
                    hashSet.add((i + 1) + String.valueOf(j));
                    hashSet.add((i + 1) + String.valueOf(j+1));
                }
            }
        }
        answer += hashSet.size();
        System.out.println(answer);

        return answer;
    }
}

