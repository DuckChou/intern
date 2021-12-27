package Set;

public class HashSetTest extends SetTest{
    @Override
    public <T> Set<T> createSet() {
        return new HashSet<T>();
    }
}
