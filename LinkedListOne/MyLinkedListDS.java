// making the linked list data strcture

class Node{ // user defined data type
    int data;
    Node next;
    Node(int data) { this.data = data; }
}
public class MyLinkedListDS {// user defined data Structure
    Node head; // by default is null
    Node tail;
    int size; // by default is 0
    // My Member Functions
    void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    int getElement(int idx){
        if(idx>=size || idx<0) return -1;
        Node temp = head;
        while(idx-- > 0){
            temp = temp.next;
        }
        return temp.data;
    }

    void size(){
        System.out.println("Length of LinkedList is: "+size);
    }

    void deleteElement(int idx){
        if(idx>=size || idx<0 ) {
            System.out.println("Invalid Idx");
            return;
        }

        if(size==0) {
            System.out.println("LIST ALRDY EMPTY");
            return;
        }

        Node temp = head;
        while(idx-->1){
            temp = temp.next;
        }

        if(temp.next==tail) tail = temp;
        //  agar kabhi tail wala index delete ho ra ho toh tail update karni pdegi

        Node container = temp.next.next;
        temp.next = container;
        // temp.next = temp.next.next;
        size--;

    }

    void addAtLast(int val){
        Node temp = new Node(val);
        if(head==null) {
            head = temp;
            tail = temp;
        }else{
            tail.next = temp;
            // temp ka next is alrdy null 
            //temp.next = null;
            // but ab imp thing tail ko last pe leke jana hai 
            tail = temp;
        }
        size++;
    }

    void addAtStart(int val){
        Node temp = new Node(val);
        if(head == null){
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void insertAt(int index, int data){
        if(index==0) { // to make sure start me insert ho head var  maintain rkhne ke liye
            addAtStart(data);
            return;
        }
        if(index==size){ // even tho iski zarurat nhi thi, lekin phir tail var nhi maintain hogi 
            addAtLast(data);
            return;
        }
        if(index>size || index<0){
            System.out.println("Invalid Index Given!!!");
            return;
        }
        Node temp = new Node(data);
        Node tracker = head;
        for(int i=0;i<index-1;i++){
            tracker = tracker.next;
        }
        temp.next = tracker.next;
        tracker.next = temp;
        size++;
    }
}

