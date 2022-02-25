/*
    Implement an algorithm to delete a node in the middle
    of a singly linked list, given only access to that node
 */
public static boolean delete_middle_node(Node middle) {
    if (middle == null || middle.next == null) return false;
    middle.data = middle.next.data;
    middle.next = middle.next.next;
    return true;
}
