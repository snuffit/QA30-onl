package homework.homework_11.custom_array_list;

public interface CustomList<T> {
    void add(T... elements);
    void del(int index);
    T get(int index);
    boolean contains(T elements);
    void clear();
    int size();
    StringBuilder print();
}
