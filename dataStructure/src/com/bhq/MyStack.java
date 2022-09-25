package com.bhq;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStack<E> {
    private Object[] arr;//存放元素的物理结构

    private int stackLength = 4;//数组的默认长度

    private int size;//记录的栈容器的元素个数

    private int index = -1;//控制数组下标位置的指针


    public boolean empty() {
        return this.size == 0;
    }

    public E pop() {
        //如果栈容器中没有元素则抛出异常
        if (this.index == -1) {
            throw new EmptyStackException();
        }
        //记录元素个数
        this.size--;
        //返回栈顶的元素
        return (E) this.arr[index--];

    }

    public E push(E item) {
        //初始化数组
        this.capacity();
        //向数组中添加元素
        this.arr[++index] = item;
        //记录元素个数
        this.size++;

        return item;
    }

    private void capacity() {
        if (this.arr == null) {
            this.arr = new Object[this.stackLength];
        }
        if (this.size - (this.stackLength - 1) >= 0) {
            this.stackLength = this.stackLength + (this.stackLength >> 1);
            this.arr = Arrays.copyOf(this.arr, this.stackLength);


        }


    }


    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();
        myStack.push("a");
        myStack.push("b");
        myStack.push("c");
        myStack.push("d");
        myStack.push("e");
        myStack.push("f");
        System.out.println(myStack.size);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.empty());


    }
}
