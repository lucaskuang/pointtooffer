package com.csu;


public class delNodeInLinkedListO1 {
    class ListNode{
        int value;
        ListNode next;

        public ListNode(){

        }
        public ListNode(int value){
            this.value  =value;
        }
        public ListNode(int value,ListNode next){
            this.next =next;
            this.value = value;
        }
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

    public static void deleteNode(ListNode head,ListNode tobeDeleted){
        if(head == null || tobeDeleted ==null){
            return;
        }
        /**
         * 如果要被删除的节点的下一节点不是尾节点，则把被删除节点下一节点的value复制给要被删除的节点，同时删除被删除节点的下一节点,这样就完成了
         * 删除节点的操作
         */
        if (tobeDeleted.getNext() != null){
            ListNode  p = tobeDeleted.getNext();//p为被删除节点的下一节点
            //把p的value复制给被删除的节点
            tobeDeleted.setValue(p.getValue());
            //删除p节点
            tobeDeleted.setNext(p.getNext());
        }else if(head == tobeDeleted){//如果头结点就是要被删除的节点，则直接删除头结点
            head =null;
        }else{
            //此时该节点恰好为链表的尾节点，则从头结点开始，遍历得到该节点的前序节点，再删除该节点
            ListNode currentNode = head;
            while (currentNode.getNext() != tobeDeleted){
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(null);
        }


    }

    public static void main(String[] args) {
	// write your code here
    }
}
