package leetcode.onboarding.palindrome;

final class PalindromeLinkedList {

    private PalindromeLinkedList() {}

    public static boolean isPalindrome(ListNode headNode) {

        if(headNode == null) {
            throw new IllegalArgumentException("Head node can't be null");
        }

        ListNode currentNode = headNode;
        StringBuilder sb = new StringBuilder();
        while (currentNode != null) {
            int val = currentNode.getVal();
            if(val < 0 || val > 9) {
                throw new IllegalArgumentException("Node value must be between 0 and 9.");
            }
            sb.append(val);
            currentNode = currentNode.getNext();
        }

        return sb.toString().equals(sb.reverse().toString());
    }
}
