import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DeleteDuplication {
    // 自己第一遍写的
    public ListNode deleteDuplication1(ListNode pHead){
        Map<Integer, ArrayList<ListNode>> check = new HashMap<>();
        ListNode interval = pHead;
        while(interval!=null){
            if(check.containsKey(interval.val)){
                check.get(interval.val).add(interval);
            }else {
                ArrayList<ListNode> a = new ArrayList<>();
                a.add(interval);
                check.put(interval.val,a);
            }
            interval=interval.next;
        }

        ListNode result = new ListNode(0);
        result.next = pHead;
        ListNode in = result;

        while(in.next!=null){
            if(check.get(in.next.val).size()>1){
                in.next = in.next.next;
            }
            in=in.next;
        }

        return result.next;
    }
}
