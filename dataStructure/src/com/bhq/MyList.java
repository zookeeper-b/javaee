package com.bhq;

public interface MyList<E> {
    void add(E element);

    E get(int index);

    int size();

    E remove();


    E remove(int index);
}
