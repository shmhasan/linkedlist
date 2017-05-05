/**
 * Created by A.S.MMehediHasan on 5/6/2017.
 */
public class LinkedList {

    private Node start;
    private Node last;
    private int size;

    public LinkedList() {
       start =null;
       last = null;
       size = 0;
    }

    public void append(int number) {

        Node tempNode = new Node(number);
        if (start == null) {
            start =tempNode;
            last = start;
        }else {

            last.setNext(tempNode);
            last =tempNode;
        }
    }


    public void display () {
        if(start != null) {
            Node writeStart = start;

            while (writeStart != null) {
                System.out.println(writeStart.getData());
                writeStart = writeStart.getNext();
            }
        }
    }

    public void removeLast() {

        Node ptr = start;
        while (ptr.getNext().getNext() != null ) {
            ptr =ptr.getNext();
        }

        ptr.setNext(null);

    }

    public void removeGraterThan(int value) {
       Node ptr =start;
        Node previous = ptr;
        while (ptr != null) {
            if(ptr.getData() > value) {
               previous.setNext(ptr.getNext());
            }else {
                previous = ptr;
            }
            ptr = ptr.getNext();
        }
    }



}
