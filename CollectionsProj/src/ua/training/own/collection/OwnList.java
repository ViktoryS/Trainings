package ua.training.own.collection;

import java.util.*;

public class OwnList<E> extends AbstractList<E> {
    private Object[] array;
    private final int DEFAULT_INITIAL_CAPASITY = 16;
    private int countOfElements;

    public OwnList() {
        array = new Object[DEFAULT_INITIAL_CAPASITY];
        countOfElements = 0;
    }

    public OwnList(int size) {
        array = new Object[size];
        countOfElements = 0;
    }

    @Override
    public E get(int index) {
        checkRange(index);
        return (E) array[index];
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        super.removeRange(fromIndex, toIndex);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return super.subList(fromIndex, toIndex);
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return super.listIterator(index);
    }

    @Override
    public ListIterator<E> listIterator() {
        return super.listIterator();
    }

    @Override
    public Iterator<E> iterator() {
        return super.iterator();
    }

    @Override
    public int size() {
        return countOfElements;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return super.addAll(index, c);
    }

    @Override
    public void clear() {
        super.clear();
    }

    @Override
    public int lastIndexOf(Object o) {
        return super.lastIndexOf(o);
    }

    @Override
    public int indexOf(Object o) {
        return super.indexOf(o);
    }

    @Override
    public E remove(int index) {
        return super.remove(index);
    }

    @Override
    public void add(int index, E element) {
        checkRange(index);
        if (array.length - 1 == countOfElements) ensureCapasity();

        Object[] newArray = new Object[array.length];
        if(index == 0){
            System.arraycopy(array, 0, newArray, 1, countOfElements);
            newArray[index] = element;
        }else {
            System.arraycopy(array, 0, newArray, 0, index);
            newArray[index] = element;
            System.arraycopy(array, index, newArray, index + 1, countOfElements - 1 - index);
        }
        countOfElements++;
        array = newArray;
    }

    @Override
    public E set(int index, E element) {
        checkRange(index);
        Object o = array[index];
        array[index] = element;
        return (E) o;
    }

    @Override
    public boolean add(E e) {
        if (countOfElements == array.length - 1) {
            ensureCapasity();
        }
        array[countOfElements++] = e;
        return array[countOfElements - 1] == e;
    }

    private void checkRange(int index) {
        if (index < 0 && index >= countOfElements)
            throw new IndexOutOfBoundsException();
    }

    private void ensureCapasity() {
        Object[] newArray = new Object[array.length + array.length / 3];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

}
