
//https://leetcode.com/submissions/detail/355683196/

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1=l1;
        ListNode t2=l2;
        int n1,n2,n,c=0;
        ListNode t3,head;
        n=t1.val+t2.val;
        t1=t1.next; t2=t2.next;
        if(n>9)
            {
                c=n/10;
                n=n%10;
                
            }
        t3=nn(n);
        head=t3;
        while(t1!=null && t2!=null)
        {
            if(c!=0)
            {
                n=t1.val+t2.val+c;
                c=0;
           }
            else n=t1.val+t2.val;
            if(n>9)
            {
                c=n/10;
                n=n%10;
                
            }
            t3.next=nn(n);
            t3=t3.next;
            t1=t1.next;t2=t2.next;
        }
        
            if(t2!=null)
            {
        while(t2!=null){
        if(c!=0)
            {
                n=t2.val+c;
                c=0;
          }else n=t2.val;
             if(n>9)
            {
                c=n/10;
                n=n%10;
                
            }
            t3.next=nn(n);
            t3=t3.next;
            t2=t2.next;
            
        }
            }
            else{
         while(t1!=null){
        if(c!=0)
            {
                n=t1.val+c;
                c=0;
          }else n=t1.val;
             if(n>9)
            {
                c=n/10;
                n=n%10;
                
            }
            t3.next=nn(n);
            t3=t3.next;
            t1=t1.next;
            
        }
            }
        if(c!=0)
            {
                t3.next=nn(c);
          }
        
        return head;
        
    }
  static  ListNode nn(int val)
    {
        ListNode newnode =new ListNode(val,null);
        return newnode;
        
    }
}
