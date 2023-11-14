package linked_list;

public class LinkedListProcessor {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode fast = head, slow = head, prev = null;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        prev.next = slow.next;

        return head;
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
        LinkedListProcessor processor = new LinkedListProcessor();

        ListNode head1 = arrayToList(new int[]{1,3,4,7,1,2,6});
        ListNode expected1 = arrayToList(new int[]{1,3,4,1,2,6});
        assert areListsEqual(processor.deleteMiddle(head1), expected1) : "Test case 1 failed";

        ListNode head2 = arrayToList(new int[]{1,2,3,4});
        ListNode expected2 = arrayToList(new int[]{1,2,4});
        assert areListsEqual(processor.deleteMiddle(head2), expected2) : "Test case 2 failed";

        ListNode head3 = arrayToList(new int[]{2,1});
        ListNode expected3 = arrayToList(new int[]{2});
        assert areListsEqual(processor.deleteMiddle(head3), expected3) : "Test case 3 failed";

        System.out.println("All test cases passed!");
    }
}
