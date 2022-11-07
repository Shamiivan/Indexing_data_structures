package a1;

class SNode<E> {

    private E element; // Value for this node

    private SNode<E> next; // Pointer to next node in list

    // Constructors
    SNode(E _element, SNode<E> _next) {
        element = _element;
        next = _next;
    }


    SNode(SNode<E> _next) { next = _next; }


    //Getters and setters
    SNode<E> next() { return next; }

    SNode<E> setNext(SNode<E> _next)
    { return next = _next; }

    E element() { return element; }

    E setElement(E _element) { return element = _element; }

}

