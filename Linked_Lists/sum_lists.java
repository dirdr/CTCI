 public static Node helper(Node h1, Node h2, int carry) {
        if (h1 == null && h2 == null && carry == 0) return null;
        Node res = new Node(0);
        int val = carry;
        if (h1 != null) {
            val += h1.data;
        }
        if (h2 != null) {
            val += h2.data;
        }
        res.data = val % 10; // grab the second digit of the number 

        if (h1 != null || h2 != null) {
            Node m = helper( h1 == null ? null: h1.next, h2 == null ? null: h2.next, val >= 10 ? 1 : 0);
            res.append(m);
        }
        return res;
    }
