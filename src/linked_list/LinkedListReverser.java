package linked_list;


public class LinkedListReverser {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    private static ListNode arrayToList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        for (int num : arr) {
            tail.next = new ListNode(num);
            tail = tail.next;
        }
        return dummy.next;
    }

    private static boolean areListsEqual(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) {
            if (l1.val != l2.val) return false;
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1 == null && l2 == null;
    }

    public static void main(String[] args) {
        LinkedListReverser reverser = new LinkedListReverser();

        ListNode head1 = arrayToList(new int[]{1,2,3,4,5});
        ListNode expected1 = arrayToList(new int[]{5,4,3,2,1});
        assert areListsEqual(reverser.reverseList(head1), expected1) : "Test case 1 failed";

        ListNode head2 = arrayToList(new int[]{1,2});
        ListNode expected2 = arrayToList(new int[]{2,1});
        assert areListsEqual(reverser.reverseList(head2), expected2) : "Test case 2 failed";

        ListNode head3 = arrayToList(new int[]{});
        ListNode expected3 = arrayToList(new int[]{});
        assert areListsEqual(reverser.reverseList(head3), expected3) : "Test case 3 failed";

        System.out.println("All test cases passed!");
    }
}
