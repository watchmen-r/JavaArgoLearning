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

    // 解きなおし
    static ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        while(head != null) {
            ListNode n = head.next;
            head.next = prev;
            prev = head;
            head = n;
        }
        return prev;
    }
}