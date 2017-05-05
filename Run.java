/**
 * Created by A.S.MMehediHasan on 5/6/2017.
 */
public class Run {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.append(5);
        linkedList.append(10);
        linkedList.append(20);
        linkedList.append(30);
        linkedList.append(40);
        linkedList.display();
        System.out.println("Removing Last Item");
        linkedList.removeLast();
        linkedList.display();
        System.out.println("Conditional");

        linkedList.removeGraterThan(5);
        linkedList.display();

    }
}
