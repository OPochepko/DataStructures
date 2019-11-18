
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


    public boolean add(E e) {

        if (size == 0){
            Node<E> node = new Node<E>(e, null, null);
            size++;
            first = node;
            last = node;
            return true;
        }

        else {
            Node<E> node = new Node<E>(e, last, null);
            size++;
            last = node;
            node.previous.next = node;
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


    public int size() {
        return size;
    }

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

    public void add(int index, E element) {
        if (index >= 0 && index <= size){
            if (index == size) {
                this.add(element);
                return;
            }
            Node<E> node = first;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            Node<E> newNode =  new Node<E>(element, node,node.next);
            node.next.previous = newNode;
            node.next = newNode;
            size++;
        }
    }

}
