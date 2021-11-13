package LinkedList;

// 下記が入ってくる
// class ListNode {
//   int val;
//   ListNode next;
//   ListNode(int x) { val = x; }
// }

class DeleteNode {
    public static void main(String[] args) {

    }

    static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}