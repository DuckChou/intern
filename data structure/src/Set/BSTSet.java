package Set;

public class BSTSet<T> implements Set<T>{
    class BSTNode{
        T val;
        BSTNode left,right;
        BSTNode(T val){
            this.val=val;
        }


    }

    BSTNode root;
    int size;
    @Override
    public boolean add(T element) {
        return false;
    }

    @Override
    public boolean remove(T element) {
        return false;
    }

    @Override
    public boolean contains(T element) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }
}
