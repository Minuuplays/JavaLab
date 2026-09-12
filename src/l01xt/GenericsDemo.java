package l01xt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Repository<T> {
    private final List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public List<T> getAll() {
        return Collections.unmodifiableList(items);
    }
}

public class GenericsDemo {
    public static void main(String[] args) {
        Repository<String> topics = new Repository<>();
        topics.add("Exceptions");
        topics.add("Generics");
        Repository<Integer> marks = new Repository<>();
        marks.add(80);
        System.out.println(topics.getAll());
        System.out.println(marks.getAll());
    }
}