import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        int left = 1; int right = diffs[1];
        for(int i = 2; i<diffs.length; i++) {
            if(right < diffs[i]) right = diffs[i];
        }
        int answer;
        //숙련도에 따른 time을 저장하기 위한 1차원 배열
        long result[] = new long [right + 1];
        
        while(left <= right) {
            answer = (left + right) / 2;

            long time_cur = caculate (result,diffs,times,answer);
            long time_next = ((answer-1)>0) ? caculate(result,diffs,times,(answer-1)) : time_cur;

            if(time_cur == limit) return answer;
            if(time_cur <= limit && time_next > limit) 
                return answer;
            else if(time_cur < limit) right = answer - 1;
            else left = answer + 1;
            }
        return left;
        }
    
    public long caculate (long[] result, int[] diffs, int[] times, int answer) {
        long time = times[0];
        //이미 계산한 숙련도
        if(result[answer] != 0) return result[answer];
        //time 계산
        else {
            for(int i = 1; i<diffs.length; i++) {
                if(answer < diffs[i]) {
                    time += (long) (diffs[i] - answer) * (times[i-1] + times[i]) + times[i];
                }
                else time += times[i];
                }
            result[answer] = time;
            return time;
        }
    }
    }	
