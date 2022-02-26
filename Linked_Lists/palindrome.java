/*
    implement a function to check if a linked list is a palindrome
 */
public static boolean palindrome(Node head) {
    Stack<Integer> stack = new Stack<>();
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
        stack.push(slow.data);
        slow = slow.next;
        fast = fast.next.next;
    }
    if (fast != null) {
        slow = slow.next;
    }
    while (slow != null) {
        if (stack.peek() == slow.data) {
            stack.pop();
        } else {
            return false;
        }
        slow = slow.next;
    }
    return true;
}
