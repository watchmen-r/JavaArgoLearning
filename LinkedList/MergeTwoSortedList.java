package LinkedList;

// 下記が入ってくる
// class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }

class MergeTwoSortedList {
    public static void main(String[] args) {

    }

    static ListNode mergeTwoSortedList(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode(0);
        ListNode start = answer;

        while (l1 != null || l2 != null) {
            int l1num = Integer.MAX_VALUE;
            int l2num = Integer.MAX_VALUE;
            if(l1 != null) l1num = l1.val;
            if(l2 != null) l2num = l2.val;

            if(l1num < l2num) {
                answer.next = l1;
                l1 = l1.next;
            } else {
                answer.next = l2;
                l2 = l2.next;
            }
            answer = answer.next;
        }
        return start.next;
    }
}