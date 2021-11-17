package LinkedList;

import java.util.HashSet;
import java.util.Set;

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

    static boolean hasCycle(ListNode head) {
        Set<ListNode> nodeSet = new HashSet<>();
        while(head != null) {
            if(nodeSet.contains(head)) return true;
            nodeSet.add(head);
            head = head.next;
        }
        return false;
    }
}