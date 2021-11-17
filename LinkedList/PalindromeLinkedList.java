package LinkedList;

import java.util.ArrayList;
import java.util.List;

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

    static boolean isPalindrome(ListNode head) {
        List<Integer> array = new ArrayList<>();

        ListNode current = head;
        while(current != null) {
            array.add(current.val);
            current = current.next;
        }

        int front = 0;
        int back = array.size() - 1;
        while(front < back) {
            if(!array.get(front).equals(array.get(back))) return false;

            front++;
            back--;
        }
        return true;
    }

}