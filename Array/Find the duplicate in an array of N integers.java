// Difficulty : Medium    https://practice.geeksforgeeks.org/problems/find-duplicates-in-an-array/1

//Task is to find duplicates in O(N) time and O(1) Space Complexity

//If there are no duplicates theen return -1;

//This code works fine for N numbers   i.e  0 <= arr[i] <= N-1

class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> a =new ArrayList<Integer>(); 
        int count=1;
        for(int i=0;i<n;i++)
        {
           int index=arr[i]%n;
           arr[index]+=n;
           if(arr[index]/n==2){
           a.add(index);
           count=0;
           }
        }
        if(count ==1)
        a.add(-1);
        return a;
    }
}





