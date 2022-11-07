package a1;
public class DNode<E> {

    private E element; // Value for this node

    private DNode<E> next; // Pointer to next node in list

    private DNode<E> prev; // Pointer to previous node

    /** Constructors */
    DNode(E it, DNode<E> p, DNode<E> n){
        element = it;
        prev = p;
        next = n;
    }

    DNode(DNode<E> p, DNode<E> n) {
        prev = p;
        next = n;
    }

    /** Get and set methods for the data members */
    DNode<E> next() { return next; }

    DNode<E> setNext(DNode<E> nextval)
    { return next = nextval; }

    DNode<E> prev() { return prev; }

    DNode<E> setPrev(DNode<E> prevval)
    { return prev = prevval; }

    E element() { return element; }

    E setElement(E it) { return element = it; }
}