/**
로또의 최고 순위와 최저 순위
*/

import java.util.Arrays;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int rnk = 7;
        int cnt = 0;
        int[] answer = {0, 0};
        
        for(int i=0; i<lottos.length; i++) { // 비교해야할 인덱스의 가짓 수가 36이므로 브루트포스 탐색을 진행한다
            for(int j=0; j<win_nums.length; j++) {
                if(lottos[i] == win_nums[j]) { rnk--; } // 두 인덱스가 서로 같으면 순위 증가
            }
            
            if(lottos[i] == 0) { cnt++; } // lottos의 인덱스가 0이면 카운트 증가
        }
        
        answer[0] = rnk - cnt; // 최고 순위
        if(rnk == 7) { // 최저 순위
            answer[1] = 6;
        } else {
            answer[1] = rnk; 
        }
        
        return answer;
    }
}
