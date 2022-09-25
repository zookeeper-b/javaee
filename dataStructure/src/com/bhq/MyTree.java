package com.bhq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//自定义树结构
public class MyTree<E> {
    private Map<E, E> map = new HashMap<>();//String--------String
    private Map<E, List<E>> map2 = new HashMap<>();//String========List

    public void add(E parent, E item) {
        this.map.put(item, parent);

        List<E> list = this.map2.get(parent);
        if (list == null) {
            list = new ArrayList<>();
            this.map2.put(parent, list);

        }
        list.add(item);

    }

    public E getParent(E item) {
        return this.map.get(item);

    }

    public List<E> getChild(E item) {
        return this.map2.get(item);


    }

    public List<E> getBrother(E item) {
        E parent = this.getParent(item);
        List<E> list = this.getChild(parent);
        List<E> brother = new ArrayList<>();

        if (list != null) {
            brother.addAll(list);
            brother.remove(item);

        }


        return brother;
    }

    public List<E> getForefather(E item) {
        E parent = this.getParent(item);

        if (parent == null) {
            return new ArrayList<>();
        }
        List<E> list = this.getForefather(parent);
        list.add(parent);
//
//        if (parent != null) {
//        List<E> list=new ArrayList<>();
//            List<E> list = this.getForefather(parent);
//            list.add(parent);
//        }

        return list;
    }

    public List<E> getGrandChildren(E item) {
        List<E> list = new ArrayList<>();
        List<E> child = this.getChild(item);
        if (child==null) {
            return list;
        }
        for (int i=0;i<child.size();i++){
            E ele=child.get(i);


            List<E> temp=this.getGrandChildren(ele);
            list.add(ele);
            list.addAll(temp);
        }


        return list;
    }


    public static void main(String[] args) {

        MyTree<String> myTree=new MyTree<>();
        myTree.add("root","生物");
        myTree.add("生物","植物");
        myTree.add("生物","动物");
        myTree.add("生物","菌类");
        myTree.add("动物","脊椎动物");
        myTree.add("动物","脊索动物");
        myTree.add("动物","腔肠动物");
        myTree.add("脊椎动物","哺乳动物");
        myTree.add("脊椎动物","鱼类");
        myTree.add("哺乳动物","猫");
        myTree.add("哺乳动物","牛");
        myTree.add("哺乳动物","人");
        System.out.println("-----------");
        System.out.println(myTree.getParent("鱼类"));
        System.out.println("-----------");
        System.out.println(myTree.getChild("脊椎动物"));
        System.out.println(myTree.getChild("动物"));
        List<String> child= myTree.getChild("动物");
        for (int i=0;i<child.size();i++){
            System.out.println(child.get(i));
        }
        System.out.println("-----------");
        System.out.println(myTree.getBrother("脊椎动物"));
        System.out.println("-----------");
        System.out.println(myTree.getForefather("人"));
        System.out.println("-----------");
        System.out.println(myTree.getGrandChildren("root"));
    }


}
