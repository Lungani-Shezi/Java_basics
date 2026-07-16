class Adding {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode L3 = new ListNode();
            ListNode dummyNode = new ListNode(0);
            ListNode Start1 = l1;
            ListNode Start2 = l2;
            ListNode Next1 = Start1;
            ListNode Next2 = Start2;
            ListNode Next3 = L3.next;
            int rem = 0;
            int sum = 0;

            while (Start1!=null&&Start2!=null){
                if (Next1.next==null&&Next2.next==null){
                    Next3 = L3.next;

                    if (Next1==null&&Next2!=null){
                        sum = Next2.val;
                    }else if (Next1!=null&&Next2==null) {
                        sum = Next1.val;
                    }else{
                        sum = Next1.val+Next2.val;
                    }

                    if (rem!=0){
                        sum += rem;
                        rem = 0;
                    }

                    if (sum>=10){
                        rem = sum/10;
                        sum = sum % 10;
                    }

                    while(Next3!=null){
                        Next3 = Next3.next;
                    }

                    Next3 = dummyNode;
                    dummyNode.val=sum;
                    sum = 0;
                    Next1 = null;
                    Next2 = null;
                }else{
                    while (Next1 != null){
                        Next1 = Next1.next;
                    }

                    while (Next2 != null){
                        Next2 = Next2.next;
                    }
                }
            }
        return L3;
    }

    public static void main(String[] args) {
        Adding app = new Adding();

        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode result = app.addTwoNumbers(l1, l2);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}