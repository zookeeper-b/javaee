package com.bhq;

public class MySinglyLinkedList<E> implements MyList<E> {
    class Node<E> {
        private E item;
        private Node next;

        Node(E item, Node next) {
            this.item = item;
            this.next = next;
        }

    }

    private Node head;
    private int size;

    @Override
    public void add(E element) {
        //创建节点
        Node<E> node = new Node<>(element, null);
        //找到尾节点
        Node tail = getTail();
        //节点的连接
        if (tail == null) {
            this.head = node;
        } else {
            tail.next = node;
        }
        this.size++;

    }

    private Node getTail() {
        //头结点是否存在
        if (this.head == null) {
            return null;
        }
        //查找尾节点
        Node node = this.head;
        while (true) {
            if (node.next == null) break;
            node = node.next;
        }
        return node;
    }

    @Override
    public E get(int index) {
        //检验index的合法性
        this.checkIndex(index);
        //根据位置获取指定节点
        Node<E> node = this.getNode(index);
        //将该节点中的元素返回
        return node.item;
    }

    private void checkIndex(int index) {
        if (!(index >= 0 && index < this.size)) {
            throw new IndexOutOfBoundsException("Index" + index + "size" + this.size);
        }

    }


    private Node getNode(int index) {
        Node<E> node = this.head;
        for (int i = 0; i < index; i++) {
            node = node.next;
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
        if (this.head == node) {
            this.head = node.next;
        } else {
            Node<E> temp = this.head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = node.next;
        }
        node.next = null;
        node.item = null;
        this.size--;
        return item;
    }


    public static void main(String[] args) {
        MySinglyLinkedList<String> mySinglyLinkedList = new MySinglyLinkedList<>();
        mySinglyLinkedList.add("a");
        mySinglyLinkedList.add("b");
        mySinglyLinkedList.add("c");
        mySinglyLinkedList.add("d");
        System.out.println(mySinglyLinkedList.size);
        System.out.println(mySinglyLinkedList.remove(3));
        System.out.println("-----------");
        for (int i = 0; i < mySinglyLinkedList.size; i++) {
            System.out.println(mySinglyLinkedList.get(i));
        }
        System.out.println(mySinglyLinkedList.size);

    }
}
