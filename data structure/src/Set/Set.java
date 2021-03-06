package Set;

public interface Set<T> {

    boolean add(T element);

    boolean remove(T element);

    boolean contains(T element);

    int size();

    Object[] toArray();


}
