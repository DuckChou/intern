package List;

public class ArrayList<T> implements List<T>{
    private T[] values;
    int size;

    public ArrayList() {
        values = (T[])new Object[1];
        size=0;
    }

    @Override
    public void add(T value) {


        if(size==values.length){
            T[] newValues = (T[])new Object[values.length*2];
            System.arraycopy(values,0,newValues,0,values.length);
            //newValues[newValues.length-1] = value;
            values=newValues;
        }
        values[size++]=value;


    }

    @Override
    public T get(int index) {
        if(index>=size){
            throw new IndexOutOfBoundsException();
        }
        return values[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T remove(int index) {
        if(index>=size){
            throw new IndexOutOfBoundsException();
        }
        T result = values[index];
        values[index] = null;
        for(int i=index;i<size;i++){
            values[index] = values[index+1];
        }
        size--;

        return result;
    }

    @Override
    public void reverse() {
        for(int i=0;i<size/2;i++){
            T temp = values[i];
            values[i] = values[size-i-1];
            values[size-i-1]=temp;
        }

    }
}
