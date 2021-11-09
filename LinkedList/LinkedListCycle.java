package LinkedList;

// 下記が入ってくる
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

class LinkedListCycle {
    public static void main(String[] args) {

    }

    // 発想はめちゃくちゃ難しい
    static boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode walker = head;
        ListNode runner = head;

        while(runner.next != null && runner.next.next != null) {
            walker = walker.next;
            runner = runner.next.next;
            if(walker == runner) return true;
        }
        return false;
    }
}