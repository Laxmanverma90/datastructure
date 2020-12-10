package com.ds.linkedlist;

import com.ds.util.LinkNode;

public class MySimpleLinkList {

	private LinkNode head;
	public static void main(String[] args) {

		MySimpleLinkList link = new MySimpleLinkList();
		link.addElement(10);
		link.addElement(20);
		link.printElememt();
		link.addElement(40);
		link.printElememt();
		link.addFirstElement(70);
		link.addFirstElement(600);
		link.printElememt();
	}

	private void addElement(final int element) {
		
		LinkNode tempNode = head;
		if(tempNode==null) {
			tempNode = new LinkNode(element, null);
			head = tempNode;
		} else {
			while(tempNode.getNode()!=null) {
				tempNode = tempNode.getNode();
			}
			tempNode.setNode(new LinkNode(element, null));
		}
	}
	
	private void printElememt() {
	
		LinkNode tempNode = head;
		while(tempNode!=null) {
			System.out.print(tempNode.getData()+" ");
			tempNode = tempNode.getNode();
		}
		System.out.println();
	}
	private void addFirstElement(final int element) {
		
		head = new LinkNode(element, head);
	}
}
