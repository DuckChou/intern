public class MergeLists {

    public ListNode solve(ListNode list1,ListNode list2){
        ListNode begin = new ListNode(0);
        ListNode interval = begin;
        while(list1!=null&&list2!=null){
            if(list1.val<=list2.val){
                interval.next = list1;
                interval = interval.next;
                list1=list1.next;

            }else {
                interval.next = list2;
                interval = interval.next;
                list2 = list2.next;
            }
        }
        if(list1==null){
            interval.next = list2;
        }else {
            interval.next = list1;
        }

        return begin.next;
    }
}
