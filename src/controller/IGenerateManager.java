package controller;

import java.util.List;

public interface IGenerateManager<T> {
    List<T> showAll();
    void add(T t);
    void remove(T t);
    void update(T t);
}
