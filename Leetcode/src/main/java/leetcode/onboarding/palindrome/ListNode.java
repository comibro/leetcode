package leetcode.onboarding.palindrome;

class ListNode {
    private final int val;
    private final ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode getNext() {
        return next;
    }

    public int getVal() {
        return val;
    }
}
