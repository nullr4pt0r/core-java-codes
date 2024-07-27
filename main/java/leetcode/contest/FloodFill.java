package leetcode.contest;

import java.util.*;
import java.util.stream.Stream;

class FloodFill {

    static class rowcol{
        int row;
        int col;
    }
    Queue<rowcol> q =  new LinkedList<>();

    void checkBoundryAndColor(rowcol r, int color, int n,int m, int[][] image){
        int row = r.row;
        int col = r.col;
        //check top
        if(row-1>=0 && image[row-1][col] == color){
            rowcol top = new rowcol();
            top.col = col;
            top.row = row-1;
            q.offer(top);
        }
        if(row+1<n && image[row+1][col] == color){
            rowcol bottom = new rowcol();
            bottom.col = col;
            bottom.row = row+1;
            q.offer(bottom);
        }
        if(col-1>=0 && image[row][col-1] == color){
            rowcol left = new rowcol();
            left.col = col-1;
            left.row = row;
            q.offer(left);
        }
        if(col+1<m && image[row][col+1] == color){
            rowcol right = new rowcol();
            right.col = col+1;
            right.row = row;
            q.offer(right);
        }
    }
    public  int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color){
            return image;
        }
        //multilevel bfs
        int scolor = image[sr][sc];
        int rowlen = image.length;
        int colen = image[0].length;
        image[sr][sc] = color;
        rowcol r = new rowcol();
        r.row = sr;
        r.col = sc;
        q.offer(r);
        while(!q.isEmpty()){
            rowcol rc = q.poll();
            // int size =
            checkBoundryAndColor(rc,scolor, rowlen, colen, image);
            int row = rc.row;
            int col = rc.col;
            image[row][col] = color;
        }
        return image;
    }

    public static void main(String[] args) {
        FloodFill ff = new FloodFill();
//        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
//        int[][] result = ff.floodFill(image, 1,1,2);
////        Arrays.stream(result).forEach(System.out::print);
//        Arrays.stream(result).flatMap(Stream::of).forEach(System.out::println);
//        System.out.println(Arrays.deepToString(result));
//        image = new int[][]{{0,0,0},{0,0,0}};
//        result = ff.floodFill(image, 1,1,0);



        List<int[][] > matrix = new ArrayList<>();
        matrix.add(new int[][]{{1,1,1},{1,1,0},{1,0,1}});
        matrix.add(new int[][]{{0,0,0},{0,0,0}});
        matrix.add(new int[][]{{0,0,0},{0,2,1}});

        for(int[][] mat:matrix){
            int[][] result = ff.floodFill(mat,1,1,2);
            System.out.println(Arrays.deepToString(result));
        }

    }
}