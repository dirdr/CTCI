/*
    write code to removes duplicates from an unsorted linked list
 */
public static Node remove_dups(Node head) {
    Node current = head;
    while (current != null && current.next != null) {
        // data we are looking to delete
        int data = current.data;
        // temp node to iterate through the list
        Node temp = current;
        while (temp.next != null) {
            if (temp.next.data == data) {
                // if the data has been found, delete it by skipping the next pointer
                temp.next = temp.next.next;
            } else {
                // else iterate
                temp = temp.next;
            }
        }
        current = current.next;
    }
    return head;
}
