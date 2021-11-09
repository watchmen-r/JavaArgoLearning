package LinkedList;

// 下記が入ってくる
// class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }

class PalindromeLinkedList {
    public static void main(String[] args) {

    }

    static ListNode frontPointer;

    // 難しい 公式の簡単なやつだとListとか使っているがListの問題でListを使うのは避けたい
    static boolean isPalindrome(ListNode head) {
        frontPointer = head;
        return recursiveCheck(head);
    }

    private static boolean recursiveCheck(ListNode currentNode) {
        if(currentNode != null) {
            if(!recursiveCheck(currentNode.next)) return false;
            if(currentNode.val != frontPointer.val) return false;
            frontPointer = frontPointer.next;
        }
        return true;
    }
}