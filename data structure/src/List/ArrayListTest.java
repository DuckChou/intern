package List;

public class ArrayListTest extends ListTest {

    @Override
    public <T> List<T> createList() {
        return new ArrayList<T>();
    }
}
