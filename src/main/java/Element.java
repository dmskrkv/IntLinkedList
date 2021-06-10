public class Element {
    private int data;
    private Element next;
    private Element prev;

    public Element(int data) {
        this.data = data;
        next = null;
        prev = null;
    }

    public int getData() {
        return data;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public Element getPrev() {
        return prev;
    }

    public void setPrev(Element prev) {
        this.prev = prev;
    }
}
