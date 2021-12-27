package Set;

import java.util.LinkedList;

public class HashSet<T> implements Set<T>{

    public static final int DEFAULT_SIZE = 4;
    private LinkedList<T>[] table;
    private int size=0;

    public HashSet(){
        table = new LinkedList[DEFAULT_SIZE];
    }


    @Override
    public boolean add(T element) {
        if(element==null){
            return false;
        }else {
            LinkedList<T> bucket = getBucket(element);
            if(bucket.contains(element)){
                return false;
            }else {
               bucket.add(element);
                size++;
                return true;
            }

        }
    }

    public LinkedList<T> getBucket(T element){
        int hash = Math.abs(element.hashCode())% table.length;
        LinkedList<T> bucket = table[hash];
        if(bucket==null){
            table[hash] = new LinkedList<>();;
        }
        return table[hash];
    }

    @Override
    public boolean remove(T element) {
        if(element==null||!contains(element))
            return false;
        LinkedList<T> bucket = getBucket(element);
        bucket.remove(element);
        size--;
        return true;
    }

    @Override
    public boolean contains(T element) {
        if(element==null)
            return false;
        LinkedList<T> bucket = getBucket(element);
        return bucket.contains(element);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object[] toArray() {
        Object[] elements = new Object[size];
        int i =0;
        for(LinkedList<T> bucket:table){
            if(bucket!=null){
                for (T element:bucket) {
                    elements[i++]=element;
                }
            }
        }

        return elements;
    }
}
