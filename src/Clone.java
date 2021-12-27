import java.util.HashMap;
import java.util.Map;

public class Clone {
    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }


        public RandomListNode Clone(RandomListNode pHead) {
            Map<RandomListNode,RandomListNode> check = new HashMap<>();
            RandomListNode a = pHead;
            while (a!=null){
                RandomListNode node = new RandomListNode(a.label);
                check.put(a,node);
                a=a.next;
            }

            RandomListNode b = pHead;
            while (b!=null){
                RandomListNode node = check.get(b);
                node.next= check.get(b.next);
                node.random = check.get(b.random);
                b=b.next;
            }







            return check.get(pHead);

        }
    }


}
