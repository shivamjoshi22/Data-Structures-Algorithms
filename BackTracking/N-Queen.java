// this code works fine for n=4 to n=15 
// I will update it soon


import java.util.*;
public class MyClass {
     static int k;
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
         k=sc.nextInt();
        int queen[][]=new int[k][k]; 
        sol(k,0,queen);
        for( int i=0;i<k;i++)
        {
        for( int j=0;j<k;j++)
        System.out.print(queen[i][j]+ " ");
        System.out.println("");
        }

    }
    static void sol(int n,int row,int queen[][])
    {
        int i;
       if(row==n)
       return;
       for( i=0;i<k;i++)
       {
           int x= checkValidCol(queen,row,i);
           if(x==1){
           queen[row][i]=1;
           break;
           }
           
           if(x>=k)  // this condition says that while performing backtracking we found queen on the last column so perform backtracking
           i=x-k;
           
           if(x==-1){
           i=k;
           break;
           }
          
        }
           if(i==k) // means that no col is suitable for the current row so perform backtraacking
           sol(n,row-1,queen);
           else
           sol(n,row+1,queen);
    }
    static int checkValidCol(int queen[][],int row,int col)
    {
        int x=0,y=0;
        boolean flag=true;
        if(col==k)
        return 0;
        
        for(int i=0;i<k;i++)   // loop is used for backtracking purpose
        {
            if(queen[row][i]==1 && i==k-1)
            {
                queen[row][i]=0;
                return -1;
            }
            if(queen[row][i]==1)
            {
               queen[row][i]=0;
               return i+k;
            }
        }
       
        for(int i=0;i<k;i++)   //loop is used to check clash of queen along the columns
        if (queen[i][col] == 1) 
                flag= false; 
            
         for ( x = row,  y = col; x >= 0 && y<k ; x--, y++)   //loop is used to check clash of queen along the upper diagonal 
            if (queen[x][y] == 1) 
                flag= false; 
               
    for (x = row, y = col; y >= 0 && x >=0; x--, y--) //loop is used to check clash of queen along the lower diagonal
        if (queen[x][y]==1) 
            flag= false;
            
        if(flag)    
          return 1;
        else
        return 0;  
    }
    
}
