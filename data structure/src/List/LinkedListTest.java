package List;

public class LinkedListTest extends ListTest{
    @Override
    public <T> List<T> createList() {
        return new LinkedList<T>();
    }
}
