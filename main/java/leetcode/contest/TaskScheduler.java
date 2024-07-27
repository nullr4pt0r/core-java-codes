package leetcode.contest;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TaskScheduler {
        public int leastInterval(char[] tasks, int n) {


            ///not this code

            Stack<Character> st = new Stack<>();
            Queue<Character> q = new LinkedList<>();
            int j = 0;
            int[] pos = new int[26];
            Arrays.fill(pos,-1);
            for(char ch:tasks){
                if(st.isEmpty()){
                    st.push(ch);
                    pos[ch-'A'] = j++;
                }
                else{
                    int val = pos[ch - 'A'];
                    if(st.peek() == ch  || ( (val != -1) && (j - val -1) < n) ){
                        q.offer(ch);
                    }
                    else{
                        st.push(ch);
                        pos[ch-'A'] = j++;
                    }
                }

            }

            st.push('-');
            j++;

            while(!q.isEmpty()){
                int size = q.size();
                for(int i=0;i<size;i++){
                    char ch = q.poll();
                    int val = pos[ch - 'A'];
                    if(st.peek() == ch  | ( (val != -1) &&(j - val -1) < n) ){
                        q.offer(ch);
                    }
                    else{
                        st.push(ch);
                        pos[ch-'A'] = j++;
                    }
                }
                st.push('-');
                j++;
            }

            if(st.peek() == '-'){
                return st.size()-1;
            }
            else{
                return st.size();
            }
        }

    public static void main(String[] args) {
        TaskScheduler taskScheduler = new TaskScheduler();
        System.out.println(taskScheduler.leastInterval(new char[]{'A','A','A','B','B','B'}, 2));
    }
    }

