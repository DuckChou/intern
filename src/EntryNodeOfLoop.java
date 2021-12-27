import java.util.HashSet;

public class EntryNodeOfLoop {


    public ListNode entryNodeOfLoop(ListNode pHead){
        //第一遍自己的做法
//        HashSet<ListNode> check = new HashSet<>();
//        //check.add(pHead);
//        ListNode a=null;
//        while(!check.contains(pHead)&&pHead!=null){
//            check.add(pHead);
//            a = pHead;
//            pHead = pHead.next;
//        }
//        return a.next;

        //网上做法
        HashSet<ListNode> check = new HashSet<>();
        //遍历链表
        while(pHead!=null){
            //如果发现重复的，就是要找的节点
            if(check.contains(pHead)){
                return pHead;
            }else {
                //没有找到就继续往下找，把未出现过的节点加入到set中
                check.add(pHead);
                pHead=pHead.next;
            }
        }
        // 如果遍历完整个链表都没找到节点，说明没有环的存在，返回null
        return null;
    }
}
