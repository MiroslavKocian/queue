public class Queue {
    private Piece first;
    private Piece last;

    public void enqueue(Object object) {
        Piece pieceToAdd = new Piece(object);
        if (first == null) {
            first = pieceToAdd;
            last = pieceToAdd;
        } else {
            last.setNext(pieceToAdd);
            last = last.getNext();
        }
    }

    public Object dequeue() {
        if (first == null) return null;
        Object firstValue = first.getValue();
        first = first.getNext();
        return firstValue;
    }

    public Object peek() {
        if (first == null ) return null;
        return first.getValue();
    }
}
