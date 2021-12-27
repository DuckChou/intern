import java.util.Stack;

public class FindKthToTail {
    public ListNode findKthToTail(ListNode pHead,int k){
        //第一遍自己的做法
        //首先判断k是不是大于链表长度
//        ListNode check = pHead;
//        int a = 0;
//        while(check!=null){
//            a++;
//            check=check.next;
//        }
//        if(a<k){
//            return null;
//        }
//
//        //找倒数第k个节点
//        int result = a-k;
//        ListNode resultNode = null;
//        while(result>=0){
//            resultNode=pHead;
//            pHead=pHead.next;
//            result--;
//        }
//        return resultNode;

        //解法2 快慢指针
//        ListNode slow = pHead;
//        ListNode fast = pHead;
//        for(int i=0;i<k;i++){
//            if(fast==null){
//                return null;
//            }
//            fast= fast.next;
//        }
//        while(fast!=null){
//            fast = fast.next;
//            slow=slow.next;
//        }
//        return slow;

        //解法3 堆 stack
        if(pHead ==null||k==0){
            return null;
        }
        Stack<ListNode> check = new Stack<>();
        while(pHead!=null){
            check.push(pHead);
            pHead=pHead.next;
        }
        if(check.size()<k){
            return null;
        }
        ListNode firstNode =null;
        while(k>0){
            firstNode = check.pop();
            k--;
        }
        return firstNode;


    }
}
