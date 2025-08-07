import java.util.*;

public class P1{
	public static void main(String args[]){
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("Item 1");
		linkedlist.add("Item 5");
		linkedlist.add("Item 3");
		linkedlist.add("Item 6");
		linkedlist.add("Item 2");
		System.out.println("Linked List content: " + linkedlist);
		linkedlist.addFirst("First item");
		linkedlist.addLast("Last item");
		System.out.println("linkedlist content after addition: " + linkedlist);
		
		Object firstvar = linkedlist.get(0);
		System.out.println("First element: " + firstvar);
		
		linkedlist.set(0, "Changed first item");
		Object firstvar2 = linkedlist.get(0);
		
		System.out.println("First element after update by set method: " + firstvar2);
		
		linkedlist.removeFirst();
		linkedlist.removeLast();
		
		System.out.println("linkedlist after deletion: " + linkedlist);
		
		linkedlist.add(0, "Newly added item");
		linkedlist.remove(2);
		
		System.out.println("Final content: " + linkedlist);
	}
}
