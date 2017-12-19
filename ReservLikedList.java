package com.csu;

public class ReservLikedList {

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

    /**
     * 递归反转，思路：从头结点开始，层层深入指直到尾节点才开始反转指针域的方向
     * 简单的说就是从尾节点开始，逆向反转各个节点的指针域方向
     * @param head
     * @return
     */
    public static ListNode reservLinkedList1(ListNode head){
        //为了理解方便，我们把head看作前一个结点，head.getnext()看作当前结点
        if(head == null || head.getNext() == null){
            return head;
        }
        //递归反转
        ListNode reHead = reservLinkedList1(head.getNext());

        head.getNext().setNext(head);
        //前一结点的指针域为空
        head.setNext(null);



        return reHead;
    }

    /**
     * 遍历反转，从前往后地依次转换各个结点的指针转向，具体做法就是，将当前结点cur的下一节点cur.getnext()缓存到
     * temp后，然后更改当前结点指针的指向上一节点，也就是说在反转当前指针之前，先把当前结点的下一节点用temp临时保存，
     * 以便下一次使用
     * @param head
     * @return
     */
    public  static ListNode reservLinkedList2(ListNode head){
        if(head == null){
            return  head;
        }

        ListNode pre = head;
        ListNode cur = head.getNext();
        ListNode temp = null;
        if(cur != null ){//如果当前结点为null,则说明该节点为尾节点
            temp = cur.getNext();
            if(temp == null){
                return cur;
            }
            cur.setNext(head);

            //指针向后移动
            pre = cur;
            cur = temp;

        }
        head.setNext(null);
        return pre;
    }

    public static void main(String[] args) {
	// write your code here
    }
}
