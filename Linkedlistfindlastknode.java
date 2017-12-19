package com.ibm.test;

public class Linkedlistfindlastknode {
	//链表类
	public static class LinkedNode{
		int value;
		LinkedNode next;
		public LinkedNode() {
		}
		
		public LinkedNode(int value,LinkedNode next) {
			this.next = next;
			this.value = value;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public LinkedNode getNext() {
			return next;
		}

		public void setNext(LinkedNode next) {
			this.next = next;
		}
		
		
	}
	public static LinkedNode findlastknode(LinkedNode head,int k) {
		if(head == null || k<= 0) {
			return null;
		}
		
		LinkedNode firstPoint = head;
		LinkedNode secondPoint = head;
		//让第一个指针移到第k个节点处
		for(int i =0; i< k-1;i++) {
			if(firstPoint.getNext() != null) {
				firstPoint = firstPoint.getNext();
			}else {
				return null;
			}
			
		}
		/**
		 * 两个指针相距k个节点，两个指针都向后链表的尾部移动，当第一个指针走到尾部时，
		 * 那么第二个指针走到倒数第k个节点，即我们所需要的节点
		 */
		while (firstPoint.getNext() != null) {
			firstPoint = firstPoint.getNext();
			secondPoint = secondPoint.getNext();
		}

		return secondPoint;
	}
	
	
	public static void main(String[] args) {
		
	}
	
}
