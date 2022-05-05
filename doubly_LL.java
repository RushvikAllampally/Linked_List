package DoubleLinkedList;

import java.util.Scanner;


class Node {
    public int data;
    public Node next;
    public Node prev;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class doubly_LL {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        Node head = null;
        int i, n, temp;
        n = in.nextInt();
        for(i=0; i<n; i++) {
            temp = in.nextInt();
            head = insertAtHead(head, temp);
           
        }
        printList(head);
       
        head =reverseListIterative(head);
        printList(head);
	}
	
	public static void printList(Node head) {
        while(head!=null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }    
        System.out.println(" X ");
    }
    
    public static Node insertAtHead(Node head, int data) {
        if(head == null) return new Node(data);
        Node newNode = new Node(data);
        newNode.next = head;
        head.prev = newNode;
        return newNode;
    } 
    
    public static Node insertAtTail(Node head, int data) {
        if(head == null) return new Node(data);
        Node newNode = new Node(data);
        Node curr  = head;
        while(curr != null && curr.next!=null) {
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.prev = curr; 
        return head;
    }
    public static Node reverseListIterative(Node head) {
        if(head == null) return null;
        Node curr = head;
        Node next = null;
        Node prev = null;
        
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        head = prev;
        return head;
    }
 	
}
