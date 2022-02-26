/*
    Given two singly linked list, determine if they intersect
    return the intersection Node (reference)
 */
public static Node intersection(Node h1, Node h2) {

    if (h1 == null || h2 == null) return null;
    int h1_size = 0;
    Node temp1 = h1;
    while (temp1 != null) {
        temp1 = temp1.next;
        h1_size++;
    }
    int h2_size = 0;
    Node temp2 = h2;
    while (temp2 != null) {
        temp2 = temp2.next;
        h2_size++;
    }

    Node longest = h1_size < h2_size ? h2: h1;
    Node shortest = h1_size < h2_size ? h1: h2;

    int diff = Math.abs(h1_size-h2_size);
    int count  = 0;

    // advance the pointer till linked list have the same length
    // se we can check for reference intersection by moving along the two pointer
    while (count < diff ) {
        longest = longest.next;
        count++;
    }

    while (longest != shortest) {
        longest = longest.next;
        shortest = shortest.next;
    }
    return shortest;

}
