/**
 * Created by gunee on 3/5/2016.
 */
public class Circularlists {

    final int MAX_HOPS = 100;

    public static boolean isCircular(Node node){
        Node slowWalker = node;
        Node fastWalker = node;
        int hops = 0;
        while (++hops < 100){
            slowWalker=slowWalker.next;
            fastWalker=fastWalker.next.next;
            if (slowWalker == fastWalker){
                System.out.println("List is Circular");
                return true;
            }


        }
        return false;
    }
    public static void main(String[] args){
        Node first = new Node(4);
        Node second = new Node (3);
        first.next = second;
        Node third = new Node (7);
        second.next = third;
        Node fourth = new Node(9);
        third.next = fourth;
        Node fifth = new Node (10);
        fourth.next = fifth;
        fifth.next = first;

        System.out.println("List is Circular: " + isCircular(first));

    }
}


class Node {
    Integer value;
    public Node next;


    public Node(Integer value){
        this.value = value;

    }
}