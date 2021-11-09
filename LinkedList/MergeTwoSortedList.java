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

    // 解きなおし
    static ListNode mergeTwoSortedList(ListNode l1, ListNode l2) {
        ListNode fakeHead = new ListNode(0);
        ListNode answer = fakeHead;
        while(l1 != null || l2 != null) {
            if(l1 == null) {
                answer.next = l2;
                l2 = l2.next;
                answer = answer.next;
                continue;
            }
            if(l2 == null) {
                answer.next = l1;
                l1 = l1.next;
                answer = answer.next;
                continue;
            }

            if(l1.val <= l2.val) {
                answer.next = l1;
                l1 = l1.next;
            } else {
                answer.next = l2;
                l2 = l2.next;
            }
            answer = answer.next;
        }
        return fakeHead.next;
    }
}