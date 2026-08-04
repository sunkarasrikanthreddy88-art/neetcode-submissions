class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        while (l1 != null) {
            s1.append(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            s2.append(l2.val);
            l2 = l2.next;
        }

        s1.reverse();
        s2.reverse();

        java.math.BigInteger num1 = new java.math.BigInteger(s1.toString());
        java.math.BigInteger num2 = new java.math.BigInteger(s2.toString());
        java.math.BigInteger sum = num1.add(num2);

        String sumStr = new StringBuilder(sum.toString()).reverse().toString();

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for (char c : sumStr.toCharArray()) {
            curr.next = new ListNode(c - '0');
            curr = curr.next;
        }

        return dummy.next;
    }
}