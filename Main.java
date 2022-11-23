class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    //testing github
    int[] l1 = { 1, 3, 8, 10};
    int[] l2 = { 1, 4, 5, 6};
    mergeTwoLists(ListNode l1, ListNode l2);
  }

  static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        var node = new ListNode(0);
        var head = node;

        while (l1 != null || l2 != null) {
            // Take node for L1 List
            if (l2 == null || (l1 != null && l1.val < l2.val)) {
            node.next = l1;
            l1 = l1.next;
            }
            // Take node for L2 List
            else {
            node.next = l2;
            l2 = l2.next;
            }
            node = node.next;
        }

        return head.next;  
    }
}