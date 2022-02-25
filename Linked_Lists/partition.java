/*
    Write code to partition a singly linked list around the value 'partition'
 */
public static Node partition(Node head, int partition) {
    // left side < partition
    // right side >= partition
    Node start = head;
    Node current = head;
    while (current != null && start != null) {
        if (current.data < partition) {
            if (start.data >= partition) {
                int temp = start.data;
                start.data = current.data;
                current.data = temp;
                start = start.next;
                current = current.next;
            } else {
                start = start.next;
            }
        } else {
            current = current.next;
        }
    }
    return head;
}
