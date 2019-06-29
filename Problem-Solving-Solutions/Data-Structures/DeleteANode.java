/**
* @Author: Joakim Olsson
* @Date:   2019-06-30T00:52:04+02:00
 * @Last modified by:   Joakim Olsson
 * @Last modified time: 2019-06-30T00:52:20+02:00
*/

// Complete the deleteNode function below.

/*
* For your reference:
*
* SinglyLinkedListNode {
*     int data;
*     SinglyLinkedListNode next;
* }
*
*/
static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
    if (position == 0)
        return head.next;
    head.next = deleteNode(head.next, position-1);
    return head;
}
