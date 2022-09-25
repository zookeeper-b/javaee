package com.bjsxt;

/*爆炸类*/
import java.awt.Graphics;
import java.awt.Image;

public class Explode {
    double x,y;

    static Image[] imgs=new Image[16];//同组图片重复使用，设置成静态变量防止重复加载
    static {//静态初始化
        for (int i = 0; i < 16; i++) {
            imgs[i]=GameUtil.getImage("images/explode/e"+(i+1)+"gif");
            imgs[i].getWidth(null);
        }
    }

    int count;

    public void draw(Graphics g) {
        if (count<=15) {
            g.drawImage(imgs[count], (int)x, (int)y, null);
            count++;
        }
    }

    public Explode(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }
    public Explode() {

    }


}
