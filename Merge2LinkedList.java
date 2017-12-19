package com.csu;

public class Merge2LinkedList {
    public static class ListNode{
        int value;
        ListNode next;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }

    }

    public static ListNode merge2likedlist(ListNode head1,ListNode head2){
        //合并后新链表的头结点
        ListNode head = null;
        if(head1 == null){
            head = head2;
        }

        if(head2 == null){
            head = head1;
        }

        if(head1 != null  && head2 != null){
            //node1 node2用来分别遍历两个链表
            ListNode node1 = head1;
            ListNode node2 = head2;

            //比较第一个结点的value，谁小谁为新链表的头结点，然后递归的比较下去直到结束
            if(node1.getValue() < node2.getValue()){
                head = head1;
                head.setNext(merge2likedlist(node1.getNext(),node2));
            }else{
                head = node2;
                head.setNext(merge2likedlist(node1,node2.getNext()));
            }

        }


        return head;
    }

    public static void main(String[] args) {
	// write your code here
    }
}
