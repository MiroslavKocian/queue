public class Piece {

    private Object value;
    public Piece next;

    public Piece(Object value) {
        this.value = value;
    }

    public Object getValue() { return value; }

    public Piece getNext() {
        return next;
    }

    public void setNext(Piece next) {
        this.next = next;
    }

}
