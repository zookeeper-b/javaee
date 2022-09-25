package com.bhq;

public class MyDoubleLinkedList<E> implements MyList<E> {
    class Node<E> {
        E item;
        Node<E> prev;
        Node<E> next;

        Node(Node<E> prev, E item, Node<E> next) {
            this.prev = prev;
            this.item = item;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;


    @Override
    public void add(E element) {
        this.linkLast(element);

    }

    private void linkLast(E element) {
        //获取尾节点
        Node t = this.tail;
        //创建节点对象
        Node<E> node = new Node<>(t, element, null);

        //将新节点定义为尾节点
        this.tail = node;
        if (t == null) {
            this.head = node;

        } else {
            t.next = node;

        }
        this.size++;


    }


    @Override
    public E get(int index) {
        this.checkIndex(index);

        Node<E> node = this.getNode(index);

        return node.item;
    }

    private void checkIndex(int index) {
        if (!(index >= 0 && index < this.size)) {
            throw new IndexOutOfBoundsException("Index" + index + "size" + size);
        }

    }

    private Node getNode(int index) {
        Node node;
        if (index < (this.size >> 1)) {
            node = this.head;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        } else {
            node = this.tail;
            for (int i = this.size - 1; i > index; i--) {
                node = node.prev;
            }
        }
        return node;

    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E remove(int index) {
        this.checkIndex(index);

        Node<E> node = this.getNode(index);
        E item = node.item;


        if (node.prev == null) {
            this.head = node.next;
        } else {
            node.prev.next = node.next;
        }
        if (node.next == null) {
            this.tail = node.prev;
        } else {
            node.next.prev = node.prev;
        }

        node.prev = null;
        node.next = null;
        node.item = null;
        this.size--;

        return item;
    }

    public void addFirst(E element) {
        this.linkFirst(element);


    }

    private void linkFirst(E element) {
        Node head = this.head;
        Node<E> node = new Node(null, element, head);
        this.head = node;

        if (head == null) {
            this.tail = node;
        } else {
            head.prev = node;

        }
        this.size++;

    }

    public void addLast(E element) {
        this.linkLast(element);

    }


    public static void main(String[] args) {
//        MyList<String> myList = new MyDoubleLinkedList<>();
//        myList.add("a");
//        myList.add("b");
//        myList.add("c");
//        myList.add("d");
//        System.out.println(myList.remove(2));
//        System.out.println(myList.size());
//        for (int i = 0; i < myList.size(); i++) {
//            System.out.println(myList.get(i));
        MyDoubleLinkedList<String> list = new MyDoubleLinkedList<>();
        list.add("a");
        list.addFirst("A");
        list.addLast("B");
        list.addFirst("C");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }

}


