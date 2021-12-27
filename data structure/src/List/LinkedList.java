package List;

public class LinkedList<T> implements List<T>{
    class LLNode{
        T value;
        LLNode next;

        public LLNode(){}

        public LLNode(T value, LLNode next) {
            this.value = value;
            this.next = next;
        }

        public T getRecursive(int index){
            if(index==0){
                return this.value;
            }else {
                if(this.next==null){
                    throw new IndexOutOfBoundsException();
                }
                return this.next.getRecursive(index-1);
            }
        }

        public T removeRecursive(int index){
            if(this.next==null){
                throw new IndexOutOfBoundsException();
            }
            if(index==1){
                T val = this.next.value;
                this.next = this.next.next;
                return val;
            }else {
                return this.next.removeRecursive(index-1);
            }
        }

        LLNode reverseRecursive(LLNode newNext){
            LLNode oldNext = this.next;
            this.next = newNext;
            if(oldNext==null){
                return this;
            }else {
                return oldNext.reverseRecursive(this);
            }

        }

        LLNode reverseRecursiveMyself1(LLNode head){
            if(head.next==null){
                return head;
            }else {
                LLNode node = reverseRecursiveMyself1(head.next);
                head.next.next=head;
                head.next=null;
                return node;
            }
        }

        LLNode reverseRecursiveMyself2(){
            if(this.next==null){
                return this;
            }else {
                LLNode node = this.next.reverseRecursiveMyself2();
                this.next.next=this;
                this.next=null;
                return node;
            }
        }

        public String toString(){
            return value+" "+next.toString();
        }
    }

    private LLNode start;
    private LLNode end;
    //int size;

    @Override
    public void add(T value) {
        if(start==null){
            start = new LLNode(value,null);
            end=start;
        }else {
            end.next = new LLNode(value,null);
            end = end.next;
        }
        //size++;

    }

    @Override
    public T get(int index) {
        if(start==null){
            throw new IndexOutOfBoundsException();
        }
        return start.getRecursive(index);
    }

    @Override
    public int size() {
        LLNode check = start;
        int result = 0;
        while(check!=null){
            result++;
            check=check.next;
        }
        return result;
    }

    @Override
    public T remove(int index) {
        //size--;
        if(start==null){
            throw new IndexOutOfBoundsException();
        }
        else if(index==0){
            LLNode node = start;
            start=start.next;
            return node.value;
        }else {
            return start.removeRecursive(index);
        }


    }

    @Override
    public void reverse() {
//        LLNode pre = null;
//        LLNode cur = start;
//        while(cur!=null){
//            LLNode node = cur.next;
//            cur.next = pre;
//            pre = cur;
//            cur = node;
//        }
//
//        LLNode temp = start;
//        start = end;
//        end=temp;

//        if(start!=null){
//            LLNode oldStart=start;
//            start=start.reverseRecursive(null);
//            end=oldStart;
//        }

        //myself 1
//        if(start!=null){
//            LLNode oldStart = start;
//            start = new LLNode().reverseRevursiveMyself(start);
//            end=oldStart;
//
//
//
//        }

        //myself 2
        if(start!=null){
            LLNode oldStart = start;
            start = start.reverseRecursiveMyself2();
            end=oldStart;



        }
    }
}
