package linked_list;

public class MaxTwinSumCalculator {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public int pairSum(ListNode head) {
        ListNode slow = head, fast = head;
        int maxSum = 0;

        // Finding the middle of the list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reversing the second half of the list
        ListNode nextNode, prev = null;
        while (slow != null) {
            nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }

        // Calculating max twin sum
        while (prev != null) {
            maxSum = Math.max(maxSum, head.val + prev.val);
            head = head.next;
            prev = prev.next;
        }

        return maxSum;
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

    public static void main(String[] args) {
        MaxTwinSumCalculator calculator = new MaxTwinSumCalculator();

        ListNode head1 = arrayToList(new int[]{5,4,2,1});
        assert calculator.pairSum(head1) == 6 : "Test case 1 failed";

        ListNode head2 = arrayToList(new int[]{4,2,2,3});
        assert calculator.pairSum(head2) == 7 : "Test case 2 failed";

        ListNode head3 = arrayToList(new int[]{1,100000});
        assert calculator.pairSum(head3) == 100001 : "Test case 3 failed";

        System.out.println("All test cases passed!");
    }
}
