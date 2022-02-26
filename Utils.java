package com.company;

import java.util.HashMap;

public class Utils {
    /*
        create a random linked list
     */
    public static Node random_linked_list(int size, int start, int end) {
        int count = 1;
        Node head = new Node((int) (Math.random() * (end - start)));
        Node current = head;
        while (count < size) {
            current.next = new Node ((int) (Math.random() * (end - start)));
            current = current.next;
            count++;
        }
        return head;
    }

    public static Node one_numbered_linked_list(int size, int number) {
        Node head = new Node(number);
        Node current = head;
        int count = 1;
        while (count != size) {
            current.next = new Node(number);
            count++;
            current = current.next;
        }
        return head;
    }


    public static Node get_linked_list_from_number(boolean reverse, int number) {
        StringBuilder helper = new StringBuilder(String.valueOf(number));
        String num = reverse ? helper.reverse().toString(): helper.toString();
        Node answer = new Node(0);
        Node current = answer;
        for (int i = 0; i < num.length(); i++) {
            current.data = Character.getNumericValue(num.charAt(i));
            if (i == num.length()-1) {
                return answer;
            } else {
                current.next = new Node(0);
                current = current.next;
            }
        }
        return answer;
    }

    /*
        return true if two linked list are balanced
        ( i.e. they have the same amount of data, not necessarily at the same position)
     */
    public static boolean balanced(Node head1, Node head2) {
        HashMap<Integer, Integer> map  = new HashMap<>();
        Node current = head1;
        while (current != null) {
            map.put(current.data, map.getOrDefault(current.data, 0) + 1);
            current = current.next;
        }
        Node current2 = head2;
        while (current2 != null) {
            if (map.get(current2.data) == null || map.get(current2.data) == 0) return false;
            map.put(current2.data, map.get(current2.data)-1);
            current2 = current2.next;
        }
        for (int key: map.keySet()) {
            if (map.get(key) != 0) return false;
        }
        return true;
    }

    public static int get_size(Node head) {
        Node current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static Node reverse_linked_list(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

}
