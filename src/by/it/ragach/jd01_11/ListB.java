package by.it.ragach.jd01_11;

import java.util.*;

public class ListB<E> implements List<E> {

    private E[] elements = (E[]) new Object[10];
    private int size = 0;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        String delimiter = "";
        for (int i = 0; i < size; i++) {
            stringBuilder.append(delimiter).append(elements[i]);
            delimiter = ", ";
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        if (size==elements.length-1){
            elements= Arrays.copyOf(elements,elements.length*3/2+1);
        }
        elements [size] = e ;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        if  (size<=elements.length-1+c.size()){
            elements = Arrays.copyOf(elements,elements.length*3/2+c.size());

        }
        int index = size;
        for (E element : c) {
            elements[index] = element;
            index++;
        }
        size=size+ c.size();
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        return elements[index];
    }

    @Override
    public E set(int index, E element) {
        E result = elements[index];
        elements[index]=element;
        return result;

    }

    @Override
    public void add(int index, E element) {
        if (size==elements.length-1){
            elements= Arrays.copyOf(elements,elements.length*3/2+1);
        }

        System.arraycopy(elements,index+0,elements,index+1,size-index);
        elements[index]=element;
        size++;

    }

    @Override
    public E remove(int index) {
        E result = elements[index];
        System.arraycopy(elements,index+1,elements,index,size-index-1);
        elements[--size]=null;
        return result;

    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}