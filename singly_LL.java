package LinkedList;

import java.util.Scanner;

class Node{
	Node next;
	int data;
	public Node(int data) {
		this.next = null;
		this.data = data;
	}
}
class singly_LL {

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
        
        System.out.println("---deleteAtHead--");
        
        head = deleteAtHead(head);
        printList(head);
        
        System.out.println("--deleteAtTail---");
        
        head = deleteAtTail(head);
        printList(head);
        
        System.out.println("--deleteAtIndex---");
        
        int index = in.nextInt();
        
        head=deleteAtIndex(head,index);
        printList(head);
        System.out.println("--insertAtIndex---");
        
        int index1 = in.nextInt();
        int data = in.nextInt();
        head=insertAtIndex(head,data,index1);
        printList(head);

	}


	private static Node insertAtHead(Node head, int temp) {
		
		  if(head == null) return new Node(temp);
	        
	        Node newNode = new Node(temp);
	        newNode.next = head;
	        return newNode;
	}
	

	private static Node insertAtTail(Node head, int temp) {
		
		
		Node ans= head;
		if(head == null) {
			return new Node(temp);
		}
		while(ans.next != null) {
			ans= ans.next;
						
		}
		ans.next = new Node(temp);
		return head;		
	}
	

	private static Node deleteAtTail(Node head) {	
		if(head == null) {
			return head;
		}
		Node ans = head;
		if(head.next == null) {
			return null;
		}
		while(ans.next.next != null) {
			ans= ans.next;
						
		}
		ans.next=null;
		
		return head;
	}

	private static Node deleteAtHead(Node head) {
		if(head == null) return null;
        return head.next;
	}
	
	private static void printList(Node head) {
		while(head != null) {
			System.out.println(head.data);
			head=head.next;
		}
	}
	
	//print reverse of linked list
    public static void printInReverse(Node head) {
        if(head == null) return;
        printInReverse(head.next);
        System.out.print(head.data + " -> ");
    }
	
    //Middle Element Deletion in linked list

    public static Node deleteMiddleElement(Node head) {
            if(head == null || head.next == null) return null;
            Node slow = head;
            Node fast = head;
            Node prev = null;
            
            while(fast != null && fast.next != null && fast.next.next != null) {
                prev = slow;
                slow = slow.next;
                fast = fast.next.next;
            }
            
            System.out.println("Middle: " + slow.data);
            
            
            if(prev == null) {
                return null;
            } else {
                prev.next = slow.next;
            }
            
            
            return head;
        }
	
	//zero based index
    public static Node insertAtIndex(Node head, int data, int index) {
       
    	Node node = new Node(data);
    	int count=0;
    	Node pre=null;
    	Node ans = head;
    	while(count < index && ans != null) {
    		pre=ans;
    		ans= ans.next;
    		count++;
    	}
    	pre.next=node;
    	node.next=ans;
    	       
        return head;
    }
    
    public static Node deleteAtIndex(Node head, int index) {
    	
    	int count=0;
    	Node pre=null;
    	Node ans = head;
    	while(count < index && ans != null) {
    		pre=ans;
    		ans= ans.next;
    		count++;
    	}
    	pre.next=ans.next;
    	       
        return head;
    }
    
    

}
