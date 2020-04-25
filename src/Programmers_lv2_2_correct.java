import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        List<Character> mnList[] = new ArrayList[n];
        for (int i = 0; i < mnList.length; i++) {
            mnList[i] = new ArrayList();
        }

        final int boardLength = board.length;
        for (int i = boardLength - 1; i >= 0; i--) {
            final char[] chars = board[i].toCharArray();
            int k = 0;
            for (int j = chars.length - 1; j >= 0; j--) {
                mnList[k % n].add(chars[j]);
                k++;
            }
        }
        int result = 0;
        do {
            result = clean(mnList, m, n);
            answer += result;
        } while (result != 0);
        System.out.println(answer);
        return answer;
    }

    int clean(List<Character> mnList[], int m, int n) {
        int result = 0;
        boolean[][] checker = new boolean[n][m];
        int mnListLength = mnList.length;
        for (int i = 1; i < mnListLength; i++) {
            int mListLength = mnList[i].size();
            for (int j = 1; j < mListLength; j++) {
                if (mnList[i].size() > j && mnList[i - 1].size() > j && // 인접 배열 크기
                        mnList[i].get(j).equals(mnList[i].get(j - 1)) && mnList[i - 1].get(j).equals(mnList[i - 1].get(j - 1)) // 세로
                        && mnList[i].get(j).equals(mnList[i - 1].get(j)) && mnList[i - 1].get(j - 1).equals(mnList[i].get(j - 1)) // 가로
                ) {
                    checker[i][j] = true;
                    checker[i][j - 1] = true;
                    checker[i - 1][j] = true;
                    checker[i - 1][j - 1] = true;
                }
            }
        }

        for (int i = mnListLength - 1; i >= 0 && i < mnList.length; i--) {
            for (int j = mnList[i].size() - 1; j >= 0 && j < mnList[i].size(); j--) {
                if (checker[i][j]) {
                    mnList[i].remove(j);
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        new Solution().solution(6, 6, new String[]{"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"});
    }
}
