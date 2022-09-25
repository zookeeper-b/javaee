package com.bhq;
//二叉树的中序遍历
public class BinaryTreeSort<E extends Integer> {
    class Node<E extends Integer> {
        private E item;
        private Node left;
        private Node right;

        Node(E item) {
            this.item = item;
        }


        public void addNode(Node node) {
            if (node.item.intValue() < this.item.intValue()) {
                if (this.left == null) {
                    this.left = node;
                } else {
                    this.left.addNode(node);
                }
            } else {
                if (this.right == null) {
                    this.right = node;
                } else {
                    this.right.addNode(node);
                }
            }
        }

        public void inorderTraversal() {
            if (this.left != null) {
                this.left.inorderTraversal();
            }

            System.out.println(this.item);

            if (this.right != null) {
                this.right.inorderTraversal();
            }

        }


    }

    private Node root;

    public void add(E element) {
        Node<E> node = new Node<>(element);
        if (this.root == null) {
            this.root = node;
        } else {
            this.root.addNode(node);
        }


    }

    public void sort() {
        if (this.root == null) {
            return;

        } else {
            this.root.inorderTraversal();

        }


    }

    public static void main(String[] args) {
        BinaryTreeSort<Integer> sort = new BinaryTreeSort<>();
        //12,10,5,7,3,1;
        sort.add(1);
        sort.add(8);
        sort.add(6);
        sort.add(3);
        sort.add(5);
        sort.add(2);
        System.out.println();
        System.out.println("-----");
        sort.sort();


    }
}
