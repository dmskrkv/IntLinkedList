import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IntLinkedListTest {

    IntLinkedList list = new IntLinkedList();

    @Test
    void getSize() {
        Assertions.assertEquals(0,list.getSize());
        list.addLastElement(10);
        list.addLastElement(20);
        list.addLastElement(30);
        Assertions.assertEquals(3,list.getSize());
        list.addLastElement(40);
        list.addLastElement(50);
        Assertions.assertEquals(5,list.getSize());
    }

    @Test
    void addLastElement() {
        list.addLastElement(10);
        list.addLastElement(20);
        list.addLastElement(30);
        Assertions.assertEquals(30, list.getElement(3));
    }

    @Test
    void addFirstElement() {
        list.addLastElement(10);
        list.addLastElement(20);
        list.addLastElement(30);
        list.addFirstElement(0);
        Assertions.assertEquals(0, list.getElement(1));
    }

    @Test
    void insertAtPos() {
        list.addLastElement(10);
        list.addLastElement(20);
        list.addLastElement(30);
        list.insertAtPos(50,2);
        Assertions.assertEquals(30, list.getElement(4));
        list.addFirstElement(100);
        Assertions.assertEquals(10, list.getElement(2));
    }

    @Test
    void deleteAtPos() {
        list.addLastElement(10);
        list.addLastElement(20);
        list.addLastElement(30);
        list.addLastElement(40);
        list.deleteAtPos(3);
        Assertions.assertEquals(40, list.getElement(3));
        Assertions.assertEquals(3, list.getSize());
    }

    @Test
    void getElement() {
        list.addLastElement(10);
        list.addLastElement(20);
        list.addLastElement(30);
        list.addLastElement(40);
        Assertions.assertEquals(30, list.getElement(3));
        Assertions.assertEquals(20, list.getElement(2));
        Assertions.assertEquals(40, list.getElement(4));
        Assertions.assertEquals(10, list.getElement(1));
    }
}