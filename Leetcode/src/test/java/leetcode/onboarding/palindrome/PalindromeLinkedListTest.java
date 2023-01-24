package leetcode.onboarding.palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeLinkedListTest {

    @Test
    void palindromeTest() {
        ListNode head = new ListNode(5, new ListNode(6, new ListNode(5)));
        assertTrue(PalindromeLinkedList.isPalindrome(head));
    }

    @Test
    void notPalindromeTest() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        assertFalse(PalindromeLinkedList.isPalindrome(head));
    }

    @Test
    void invalidNodeValueTest() {
        ListNode head = new ListNode(11, new ListNode(2, new ListNode(3)));
        assertThrows(IllegalArgumentException.class, () -> PalindromeLinkedList.isPalindrome(head));
        assertThrows(IllegalArgumentException.class, () -> PalindromeLinkedList.isPalindrome(null));
    }
}