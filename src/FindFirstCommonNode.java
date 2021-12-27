public class FindFirstCommonNode {

    public ListNode findFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        //错误解答1
//        ListNode a = pHead1;
//        ListNode b = pHead2;
//        while(!a.equals(b)){
//            if(a.next==null){
//                a.next = pHead2;
//            }else {
//                a=a.next;
//            }
//            if(b.next==null){
//                b.next = pHead1;
//            }else {
//                b = b.next;
//            }
//        }
//        return a;
        ListNode a = pHead1;
        ListNode b = pHead2;
        while(!a.equals(b)){
            if(a==null){
                a = pHead2;
            }else {
                a=a.next;
            }
            if(b==null){
                b = pHead1;
            }else {
                b = b.next;
            }
        }
        return a;

        // 网络解答
//        ListNode l1 = pHead1, l2 = pHead2;
//        while(l1 != l2){
//            l1 = (l1==null)?pHead2:l1.next;
//            l2 = (l2==null)?pHead1:l2.next;
//        }
//        return l1;
    }

    }
