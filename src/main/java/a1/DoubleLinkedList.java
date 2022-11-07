package a1;

public class DoubleLinkedList<E> implements ADTList<E> {

        private DNode<E> head;        // Pointer to list header
        private DNode<E> tail;        // Pointer to last element in list
        protected DNode<E> curr;      // Pointer ahead of current element
        int size;		      // Size of list


        public DoubleLinkedList() {
            curr = head = new DNode<>(null, null); // Create header node
            tail = new DNode<>(head, null);
            head.setNext(tail);
            size = 0;
        }

        public void clear() {         // Remove all elements from list
            head.setNext(null);         // Drop access to rest of links
            curr = head = new DNode<>(null, null); // Create header node
            tail = new DNode<>(head, null);
            head.setNext(tail);
            size = 0;
        }

        public void moveToStart()  // Set curr at list start
        { curr = head; }

        public void moveToEnd()  // Set curr at list end
        { curr = tail.prev(); }

        /** Insert "it" at current position */
        public void insert(E it) {
            curr.setNext(new DNode<>(it, curr, curr.next()));
            curr.next().next().setPrev(curr.next());
            size++;
        }

        /** Append "it" to list */
        public void append(E it) {
            tail.setPrev(new DNode<>(it, tail.prev(), tail));
            tail.prev().prev().setNext(tail.prev());
            size++;
        }

        /** Remove and return current element */
        public E remove() {
            if (curr.next() == tail) return null; // Nothing to remove
            E it = curr.next().element();      // Remember value
            curr.next().next().setPrev(curr);
            curr.setNext(curr.next().next());  // Remove from list
            size--;			     // Decrement the count
            return it;                         // Return value removed
        }

        /** Move curr one step left; no change if at front */
        public void prev() {
            if (curr != head)   // Can't back up from list head
                curr = curr.prev();
        }
        //Move curr one step right; no change if at end
        public void next(){
            if (curr != tail.prev())
                curr = curr.next();
        }

        public int length() { return size; }

        //Return the position of the current element
        public int currPos() {
            DNode<E> temp = head;
            int i;
            for (i=0; curr != temp; i++)
                temp = temp.next();
            return i;
        }

        //Move down list to a give index position
        public void moveToPos(int pos) {
            assert (pos>=0) && (pos<= size) : "Position out of range";
            curr = head;
            for(int i=0; i<pos; i++)
                curr = curr.next();
        }

        public E getValue() {   // Return current element
            if (curr.next() == tail)
                return null;
            return curr.next().element();
        }

        public String toString()
        {
            // Save the current position of the list
            int oldPos = currPos();
            int length = length();
            StringBuffer out = new StringBuffer((length() + 1) * 4);

            moveToStart();
            out.append("< ");
            for (int i = 0; i < oldPos; i++) {
                out.append(getValue());
                out.append(" ");
                next();
            }
            out.append("| ");
            for (int i = oldPos; i < length; i++) {
                out.append(getValue());
                out.append(" ");
                next();
            }
            out.append(">");
            moveToPos(oldPos); // Reset the fence to its original position
            return out.toString();
        }
    }
