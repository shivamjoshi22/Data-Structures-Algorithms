// Refer link for problem description and submissions
//https://www.hackerearth.com/problem/algorithm/problem-1-29/submissions/

import java.util.*;
class TestClass {
    static int k;
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
        int n=sc.nextInt();
        k=n;
        int maze[][]=new int[n][n];
        int path[][]=new int[n][n];
        for(int i =0;i<n;i++)
        for(int j=0;j<n;j++)
        {
            maze[i][j]=sc.nextInt();
        }
       boolean var= solution(maze,0,0,path);
       if(var == true)
       System.out.println("POSSIBLE");
       else
       System.out.println("NOT POSSIBLE");
        t--;
        }
    }

    static boolean solution(int maze[][],int row,int col,int path[][] )
    {
       if(row<0 || col >=k || row>=k || col<0 || path[row][col]==1 || maze[row][col] == 0 )
       return false;
        if(row== k-1 && col==k-1)
        return true;
        path[row][col]=1;
        if(solution(maze,row-1,col,path))
        return true;
       if(solution(maze,row-1,col,path))
       return true;
       if(solution(maze,row,col+1,path))
       return true;
       if(solution(maze,row+1,col,path))
       return true;
       if(solution(maze,row,col-1,path))
       return true;

       return false;

    }
}
