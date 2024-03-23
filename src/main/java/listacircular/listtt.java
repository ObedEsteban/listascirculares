package listacircular;

class listt{
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }

    public static void main(String[] args) {
        listt solution = new listt();


        ListNode head1 = new ListNode(3);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(-4);
        head1.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node1;

        System.out.println("resultado 1: " + solution.hasCycle(head1));


        ListNode head2 = new ListNode(1);
        ListNode node4 = new ListNode(2);
        head2.next = node4;
        node4.next = head2;

        System.out.println("resultado 2: " + solution.hasCycle(head2));


        ListNode head3 = new ListNode(1);
        System.out.println("resultado 3: " + solution.hasCycle(head3));
    }
}
