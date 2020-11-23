package com.ds.linkedlist;

public class SimpleLinkList {

	private static LinkList head =null;
	
	public static void main(String[] args) {
		/*
		 * LinkList linklist5 = new LinkList(50, null); LinkList linklist4 = new
		 * LinkList(40, linklist5); LinkList linklist3 = new LinkList(30, linklist4);
		 * LinkList linklist2 = new LinkList(20, linklist3); LinkList linklist1 = new
		 * LinkList(10, linklist2); SimpleLinkList simpleLinkList = new
		 * SimpleLinkList(); simpleLinkList.printLinkList(linklist1);
		 * 
		 * head = linklist1;
		 */
		SimpleLinkList simpleLinkList = new SimpleLinkList();
		
		simpleLinkList.printLinkList();
		
		simpleLinkList.addElement(10);
		simpleLinkList.addElement(20);
		simpleLinkList.addElement(30);
		simpleLinkList.addElement(40);
		simpleLinkList.addElement(50);
		simpleLinkList.addElement(60);
		
		simpleLinkList.printLinkList();
		
		System.out.print("\nEND");
	}
	
	public void printLinkList() {
		
		LinkList tempHead = head;
		
		if(tempHead == null) {
			System.out.println("::::: list is empty :::::");
		}
		
		while(tempHead!=null) {
			System.out.print(tempHead.getElement()+" ");
			tempHead=tempHead.getNextNode();
		}
	}
	
	public void addElement(int element) {
		
		LinkList tempHead = head;
		if(head == null) {
			head = new LinkList(element, null);
		} else {
			while(tempHead.getNextNode()!=null) {
				tempHead = tempHead.getNextNode(); 
			}
			tempHead.setNextNode( new LinkList(element, null));
		}
	}
}
