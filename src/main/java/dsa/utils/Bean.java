package dsa.utils;

public interface Bean<T> {
    void setValue(T v);
    T getValue();
}
