/*
    implement a function to check if a linked list is a palindrome
 */
public static boolean palindrome(Node head) {
    Stack<Integer> stack = new Stack<>();
    Node current = head;
    Node reversed_head = Utils.reverse_linked_list(head);
    while (current != null) {
        int data = current.data;
        stack.push(data);
        int reversed_data = reversed_head.data;
        if (stack.peek() == reversed_data) {
            stack.pop();
        } else {
            return false;
        }
        current = current.next;
        reversed_head = reversed_head.next;
    }
    return true;
}
