// code is to print combination of n numbers i.e nCr
// auxilliary buffer is used of size r

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int bufferindex,arrayindex;
        System.out.println("Enter size of Buffer :");
        bufferindex=sc.nextInt();
        System.out.println("Enter size of Array :");
        arrayindex=sc.nextInt();
        if(bufferindex>arrayindex)
        System.out.println(" bufferindex should be lower then arrayindex");
        else{
            int a[]=new int [arrayindex];
            System.out.println("Enter value in array");
            for(int i=0;i<a.length;i++)
                a[i]=sc.nextInt();
            int buffer[]=new int [bufferindex];
            printCombos(a,buffer,0,0);
        }
    }
    static void printCombos(int a[],int buffer[],int start,int bufferindex)
     {
           if(bufferindex == buffer.length)
            {
                for(int i=0;i<buffer.length;i++)
                System.out.print(buffer[i]+ " " );
                System.out.println();
                return;
                
            }
            if(start == a.length)
          return;
       
       for(int i=start;i<a.length;i++)
        {
            buffer[bufferindex]=a[i];
            printCombos(a,buffer,i+1,bufferindex+1);
        }
        
    }
}
