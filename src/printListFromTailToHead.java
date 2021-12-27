import java.util.ArrayList;
import java.util.List;

public class printListFromTailToHead {


    List<Integer> result = new ArrayList<>();

    public List<Integer> So1(ListNode listNode){
        ArrayList<Integer> result = new ArrayList<>();
        while(listNode!=null){
            result.add(0,listNode.val);
            listNode=listNode.next;
        }
        return result;
    }

    public List<Integer> So2(ListNode listNode){
        if(listNode==null){
            return result;
        }else {
            result.add(listNode.val);
            return So2(listNode.next);
        }
    }


}
