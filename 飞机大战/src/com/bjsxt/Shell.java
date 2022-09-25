package com.bjsxt;

import java.awt.*;

public class Shell extends GameObject{
    double degree;

    @Override
    public void drawMySelf(Graphics g) {
        Color c=g.getColor();

        g.setColor(Color.yellow);
        g.fillOval(x,y,width,height);

        //炮弹沿着任意角度去飞
        x+=speed*Math.cos(degree);
        y+=speed*Math.sin(degree);

        //实现边界碰撞回弹
        if(y>GameUtil.FRAME_HEIGHT||y<30){
            degree=-degree;
        }

        if (x>GameUtil.FRAME_WIDTH-10||x<0){
            degree=Math.PI-degree;
        }





        g.setColor(c);
    }

    public Shell() {
        x = 200;
        y = 200;
        width = 10;
        height = 10;
        speed = 3;
        degree = Math.random()*Math.PI*2;
    }
}
