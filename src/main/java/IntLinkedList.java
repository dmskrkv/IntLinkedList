public class IntLinkedList {
    private Element first;
    private Element last;
    private int size;

    public IntLinkedList() {
        first = last = null;
        size = 0;
    }

    public int getSize() {
        return this.size;
    }

    public void addLastElement(int data) {
        Element newElement = new Element(data);
        if (first == null) {
            first = last = newElement;
        } else {
            last.setNext(newElement);
            newElement.setPrev(last);
            last = newElement;
            last.setNext(null);
        }
        size++;
    }

    public void addFirstElement(int data) {
        Element newElement = new Element(data);
        if (first == null) {
            first = newElement;
            last = first;
        } else {
            first.setPrev(newElement);
            newElement.setNext(first);
            first = newElement;
        }
        size++;
    }

    public void insertAtPos(int data, int pos) {
        Element newElement = new Element(data);
        if (pos == 1) {
            addFirstElement(data);
        } else if (pos > size) {
            throw new IllegalArgumentException();
        } else {
            Element elementAtPos = first;
            for (int i = 2; i <= size; i++) {
                if (i == pos) {
                    Element tmp = elementAtPos.getNext();
                    elementAtPos.setNext(newElement);
                    newElement.setPrev(elementAtPos);
                    newElement.setNext(tmp);
                    tmp.setPrev(newElement);
                } else {
                    elementAtPos = elementAtPos.getNext();
                }
            }
            size++;
        }
    }

    public void deleteAtPos(int pos) {
        if (pos == 1) {
            if (size == 1) {
                first = null;
                last = null;
                size = 0;
            } else {
                first = first.getNext();
                first.setPrev(null);
                size--;
            }
        } else if (pos == size) {
            last = last.getPrev();
            last.setNext(null);
            size--;
        } else if (pos > size) {
            throw new IllegalArgumentException();
        } else {
            Element elementAtPos = first.getNext();
            for (int i = 2; i <= size; i++) {
                if (i == pos) {
                    Element p = elementAtPos.getPrev();
                    Element n = elementAtPos.getNext();
                    p.setNext(n);
                    n.setPrev(p);
                    size--;
                    return;
                }
                elementAtPos = elementAtPos.getNext();
            }
        }
    }

    public int getElement(int pos) {
        if (pos == 1) {
            return first.getData();
        } else if (pos == size) {
            return last.getData();
        } else if (pos > size) {
            throw new IllegalArgumentException();
        } else {
            Element elementAtPos = first.getNext();
            for (int i = 2; i <= size; i++) {
                if (i == pos) {
                    break;
                } else {
                    elementAtPos = elementAtPos.getNext();
                }
            }
            return elementAtPos.getData();
        }
    }
}
