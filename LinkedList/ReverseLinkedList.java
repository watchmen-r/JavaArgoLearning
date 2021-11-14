package LinkedList;

// 下記が入ってくる
// class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }

class ReverseLinkedList {
    public static void main(String[] args) {

    }

    static ListNode reverseLinkedList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode prev = head;
        ListNode nowNode = head.next;
        ListNode nextNode;
        prev.next = null;
        while(nowNode.next != null) {
            nextNode = nowNode.next;
            nowNode.next = prev;
            prev = nowNode;
            nowNode = nextNode;
        }
        nowNode.next = prev;
        return nowNode;
    }
}