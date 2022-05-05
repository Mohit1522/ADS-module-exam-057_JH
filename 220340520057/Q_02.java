import java.util.*;
class linkedlist{
	node head;
	static class node{
		node next;
		int data;
		node(int d){
			this.data=d;
			next=null;
		}
	}
	void inseAtend(int new_data){
		node new_node=new node(new_data);
		if(head==null){
			head=new_node;
			return;
		}
		new_node.next=null;
		node n=head;
		while(n.next!=null){
			n=n.next;
		}
		n.next=new_node;
		return;
	}
	void disply(node n){
		
		if(head==null){
			System.out.println("list is empty");
		}
		{
			while(n!=null){
				System.out.print(n.data+" ");
				n=n.next;
			}
		}
	}
	node reverse(node n2){
		node prev=null;
		node current=n2;
		node next=null;
		while(current!=null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		n2=prev;
		return n2;
	}

public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	linkedlist list=new linkedlist();
	for(int i=0;i<8;i++){
		list.inseAtend(sc.nextInt());
	}
	//list.head=new node();
	//list.inseAtend(1);
	//list.inseAtend(2);
	//list.inseAtend(4);
	//list.disply(list.head);
	list.head=list.reverse(list.head);
	list.disply(list.head);
}
}
