package intervals;

import java.util.Arrays;
import java.util.LinkedList;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        //sort intervals based on starting time
        //now merge the interval which has start time < prev start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0],b[0]));

        //now we need to merge those intervals based on the start and end time
        //usually when the start time is prior than last interval end time, we need to merge that

        LinkedList<int[]> merged = new LinkedList<>();

        for(int[] interval : intervals){
            //if end is in past of the current start
            if(merged.isEmpty() || merged.getLast()[1] < interval[0]){
                merged.add(interval);
            }else{
                //end time is
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }

   static public int eraseOverlapIntervals(int[][] intervals) {

        //find the overlapping interval
        //len - overlapping


        int count = 0;
        int len = intervals.length;

        Arrays.sort(intervals, (x,y) -> Integer.compare(x[1], y[1]));

        int[] end = intervals[0];
        for(int i=1;i<len;i++){
            if(intervals[i][0] >= end[1]){
                end = intervals[i];
                count++;
            }
        }
        return len - count;

    }

    public static void main(String[] args) {
        int[][] inter = {{1,2},{2,3},{3,4},{1,3}};
        System.out.println(eraseOverlapIntervals(inter));
    }
}
