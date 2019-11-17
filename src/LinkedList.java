import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class LinkedList<E> implements List<E>

{

    int size = 0;

    Node<E> first;

    Node<E> last;

    private class Node<E>{

        E elment;

        Node<E> previous;

        Node<E> next;

        public Node(E elment, Node<E> previous, Node<E> next) {
            this.elment = elment;
            this.previous = previous;
            this.next = next;
        }
    }


    @Override
    public boolean add(E e) {

        if (size == 0){
            Node<E> node = new Node<>(e, null, null);
            size++;
            first = node;
            last = node;
            return true;
        }

        else {
            Node<E> node = new Node<>(e, last, null);
            size++;
            last = node;
            return true;
        }


    }

    public boolean remove() {
        if (size > 0){
            first = first.next;
            first.previous = null;
            size--;
            return true;
        } else return false;
    }

    @Override
    public boolean remove(Object o) {
        Node<E> node = first;
        while (node != null){
            if (node.elment == o){
                node.previous.next = node.next;
                node.next.previous = node.previous;
                size--;
                return true;
            }
            node = node.next;
        }

        return false;
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {return null;}
        else {

            Node<E> node = first;

            if (index > 0) {
                for (int i = 0; i < index; i++) {
                    node = node.next;
                }
            }

            return node.elment;
        }
    }

    @Override
    public void add(int index, E element) {
        if (index >= 0 && index <= size){
            if (index == size) {this.add(element);}
            Node<E> node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            Node<E> newNode =  new Node<>(element, node.previous,node);
            node.previous = newNode;
            node.previous.next = newNode;
        }
    }

//----------------------------------------------------------------- TODO next
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
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
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
    public E set(int index, E element) {
        return null;
    }



    @Override
    public E remove(int index) {
        return null;
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
