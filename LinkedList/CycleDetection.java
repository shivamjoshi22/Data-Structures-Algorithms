 //https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle/problem
 
 static boolean hasCycle(SinglyLinkedListNode head) {
        HashMap<SinglyLinkedListNode,Integer>map=new HashMap<>();
        while(head!=null){
         if(map.containsKey(head))
         {
             return true;
         }map.put(head,1);
            head=head.next;
        }
        return false;
    }
