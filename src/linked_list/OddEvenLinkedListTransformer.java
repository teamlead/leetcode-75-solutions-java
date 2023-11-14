package linked_list;

public class OddEvenLinkedListTransformer {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head, even = head.next, evenHead = even;

        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
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
        OddEvenLinkedListTransformer transformer = new OddEvenLinkedListTransformer();

        ListNode head1 = arrayToList(new int[]{1,2,3,4,5});
        ListNode expected1 = arrayToList(new int[]{1,3,5,2,4});
        assert areListsEqual(transformer.oddEvenList(head1), expected1) : "Test case 1 failed";

        ListNode head2 = arrayToList(new int[]{2,1,3,5,6,4,7});
        ListNode expected2 = arrayToList(new int[]{2,3,6,7,1,5,4});
        assert areListsEqual(transformer.oddEvenList(head2), expected2) : "Test case 2 failed";

        System.out.println("All test cases passed!");
    }
}
