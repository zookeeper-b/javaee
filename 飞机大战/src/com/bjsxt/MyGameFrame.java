package com.bjsxt;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static com.bjsxt.GameUtil.*;

public class MyGameFrame extends Frame {
    //初始化窗口
    Image bgImg = GameUtil.getImage("Images/bg.png");
    Image planeImg = GameUtil.getImage("Images/plane.png");

    Plane plane = new Plane(planeImg, 200, 200, 10);
    Shell shells[] = new Shell[50];

    @Override
    public void paint(Graphics g) {
        g.drawImage(bgImg, 0, 0, FRAME_WIDTH, FRAME_HEIGHT, null);
        plane.drawMySelf(g);

        for (int i = 0; i < shells.length; i++) {
            shells[i].drawMySelf(g);
            boolean peng =shells[i].getRec().intersects(plane.getRec());


            if(peng){
                System.out.println("飞机死了");
                plane.live=false;
            }
        }


    }

    //初始化窗口
    public void launchFrame() {
        this.setTitle("飞机大战");
        this.setVisible(true);
        this.setSize(500, 500);
        this.setLocation(300, 300);


        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        //启动窗口绘制线程
        new PaintThread().start();
        //启动键盘监听
        this.addKeyListener(new KeyMonitor());

        //初始化50发炮弹
        for (int i = 0; i < shells.length; i++) {
            if (shells[i] != null) {
                shells[i] = new Shell();
            }


        }

    }


    //        Color old =g.getColor();
//        g.setColor(Color.blue);
//        //g就是一个画笔
//        g.drawLine(100,50,400,200);
//        g.drawRect(100,50,400,400);
//        g.drawOval(100,50,400,400);
//        g.drawString("SXT",100,100);
//        g.setColor(old);
    class KeyMonitor extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            plane.addDirection(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            plane.minusDirection(e);
        }
    }

    //重画线程
    class PaintThread extends Thread {
        @Override
        public void run() {
            while (true) {
                repaint();
                try {
                    Thread.sleep(40);//1s=1000ms
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }


    public static void main(String[] args) {
        MyGameFrame frame = new MyGameFrame();
        frame.launchFrame();


    }

    private Image offScreenImage = null;

    public void update(Graphics g) {
        if (offScreenImage == null) {
            offScreenImage = this.createImage(FRAME_WIDTH, FRAME_WIDTH);//这是游戏的窗口
        }
        Graphics gOff = offScreenImage.getGraphics();
        paint(gOff);
        g.drawImage(offScreenImage, 0, 0, null);


    }

}
