package _35_deque;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class MyDeque {
    public static void main(String[] args) {
        /*
        implementation của Deque như sau:
            LinkedList
            ArrayDeque
         */
        Deque<Integer> myDeque = new LinkedList<>();
//      add(), addLast(), offerLast(): thêm ở cuối danh sách.
        myDeque.add(1);
        myDeque.addLast(2);
        myDeque.offerLast(3);
//      push(), addFirst(), offerFirst(): thêm ở đầu danh sách.
        myDeque.push(4);
        myDeque.addFirst(5);
        myDeque.offerFirst(6);
//      peek(), peekFirst(), getFirst(): truy xuất phần tử đầu danh sách.
        System.out.println(myDeque.peek());
        System.out.println(myDeque.peekFirst());
        System.out.println(myDeque.getFirst());
//      peekLast(), getLast(): truy xuất phần tử cuối danh sách.
        System.out.println(myDeque.peekLast());
        System.out.println(myDeque.getLast());
//      remove(), poll(), removeFirst(), pollFirst(): xóa phần tử đầu danh sách.
        System.out.println(myDeque.remove());
//      removeLast(), pollLast(): xóa phần tử cuối danh sách.
        System.out.println(myDeque.pollLast());
//      contains(): kiểm tra phần tử có trong danh sách.
        System.out.println(myDeque.contains(1));
//      duyệt qua các phần tử.
        Iterator<Integer> iterator = myDeque.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + "\t");
        }
    }
}
