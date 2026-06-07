class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}    

    public class palindrom {
        Node head;

        public void add(int data){
                Node newNode = new Node(data);
                if (head==null) {
                head = newNode;
                return;
                }
                
                Node current = head;
                while (current.next!=null) {
                current=current.next;
                }
                current.next = newNode;
            }

        public static Node revesNode (Node head){
            Node element = head;
            int sum = 0;

            while (element!=null) {
                sum = element.data +(sum*10);
                element = element.next;
            }


            int digit;
            Node heads = null;
            Node current = null;
            
            while (sum > 0) {
            digit = sum % 10;

            Node newNode = new Node(digit); // create Node

            if (heads == null) {
                heads = newNode;        // first Node
                current = heads;
            } else {
                current.next = newNode; // link Node
                current = newNode;      // move pointer
            }

            sum = sum / 10;
        }

        return heads;
        }

        public static boolean ispalindrom(Node head){
            Node rev = revesNode(head);
            Node curr = head;

            while (rev!=null&&curr!=null) {

                if (rev.data!=curr.data) {
                    return false;
                }
                rev = rev.next;
                curr = curr.next;
            }

            return true;
        }


        public void printList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }

        System.out.println("null");

        }

        public static void main(String[] args) {

            palindrom list = new palindrom();

            list.add(1);
            list.add(0);
            list.add(0);
            list.add(1);
            list.printList();
            System.out.println("Is palindrom : "+ispalindrom(list.head) );
        }
    }   
