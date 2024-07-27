package leetcode.contest;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class StudentSandwich {
    public int countStudents(int[] students, int[] sandwiches) {
        //no.of.1 == no.of.0
//        int studentOne , studentZero , sandwichOne, sandwichZero;
//        studentOne = studentZero = sandwichOne = sandwichZero = 0;
        Queue<Integer> studentQueue = new LinkedList<>();
        for(int i:students){
            studentQueue.offer(i);
        }
        int sand = 0;
        int eaten = 0;
        while(!studentQueue.isEmpty()){
            //possibility for infinite loop [1,1,1,0,0,1] [1,0,0,0,1,1]

            if(studentQueue.peek() == sandwiches[sand]){
                studentQueue.poll();
                sand++;
                eaten++;
            }
            else{
                studentQueue.offer(studentQueue.poll());
            }
        }
        return students.length - eaten;
    }
}
