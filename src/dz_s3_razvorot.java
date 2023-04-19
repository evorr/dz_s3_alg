public class dz_s3_razvorot {
    static Node head;
    static Node tail;

    public static void main(String[] args) {
        Node first = new Node(3, null,null);
        Node second = new Node(5, null,first);
        Node third = new Node(7, null,second);
        first.next = second;
        second.next = third;

        printRel(first);

        revert(first);

        printRel(third);

    }

    public static void printRel(Node currentNode){
        while(currentNode != null){
            if(currentNode.next == null){
                System.out.println("null");
            }
            else{
                System.out.println(currentNode.next.value);
            }
            currentNode = currentNode.next;
        }

    }

    public static void revert(Node currentNode){
        while (currentNode != null){
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;
            if (previous == null){
                tail = currentNode;
            }
            if (next == null){
                head = currentNode;
            }
            currentNode = next;
        }
    }
}

