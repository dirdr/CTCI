/*
    implement an algorithm to find the Kth to last element of singly linked list
 */
public static int return_kth_to_last(Node head, int k) {
    Node current = head;
    int size = 0;
    while (current != null) {
        size++;
        current = current.next;
    }
    current = head;
    int count = 0;
    while (current != null) {
        if ((size - count) == k) {
            return current.data;
        }
        current = current.next;
        count++;
    }
    return -1;
}
