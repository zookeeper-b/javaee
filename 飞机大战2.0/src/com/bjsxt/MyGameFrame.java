package com.bjsxt;


import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
import javax.swing.JFrame;

public class MyGameFrame extends Frame{

    Image beijing = GameUtil.getImage("images/bg.jpg");
    Image feiji = GameUtil.getImage("images/plane.png");

    Plane plane = new Plane(feiji,250,250);//创建飞机对象
    Shell[] shells = new Shell[50];//创建炮弹对象

    Explode bao;//创建爆炸对象
    Date startTime = new Date();//游戏开始时间
    Date endTime;//游戏结束时间
    int period;

    @Override
    public void paint(Graphics g) {  //自动被调用，g相当于一个画笔
        // TODO Auto-generated method stub
        super.paint(g); //不能省略
        Color c = g.getColor();
        g.drawImage(beijing, 0, 0, null);//画背景
        plane.drawSelf(g); //画飞机
        //shell.draw(g); //画炮弹

        //画出所有的炮弹
        for (int i = 0; i < shells.length; i++) {
            shells[i].draw(g);

            //飞机和炮弹的碰撞检测
            boolean peng = shells[i].getRect().intersects(plane.getRect());
            if (peng) {
                plane.live = false;//飞机死了

                if(bao==null){
                    bao = new Explode(plane.x,plane.y);
                    endTime = new Date();
                    period = (int)((endTime.getTime() - startTime.getTime())/1000);
                }

                bao.draw(g);
            }

            //计时功能，给出提示
            if(!plane.live) {
                g.setColor(Color.red);
                Font f = new Font("宋体",Font.BOLD,50);
                g.setFont(f);
                g.drawString("时间："+period+"秒",(int)plane.x,(int)plane.y);
            }
        }

        g.setColor(c);

    }
    //帮助我们反复重画窗口
    class PaintThread extends Thread{
        @Override
        public void run() {
            //super.run();
            while(true) {
                //System.out.println("窗口画一次！");
                repaint();//重画
                try {
                    Thread.sleep(40); //1s=1000ms,停顿40毫秒，相当于1s25张左右的图片
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    //定义键盘监听内部类
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

    /**
     * 初始化窗口
     */
    public void launchFrame() {
        this.setTitle("尚学堂JAVA300集实战小项目");
        this.setVisible(true);
        this.setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
        this.setLocation(300, 300);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        new PaintThread().start();//启动重画窗口的线程
        addKeyListener(new KeyMonitor());//给窗口增加键盘监听

        //初始化50个炮弹
        for (int i = 0; i < shells.length; i++) {
            shells[i] = new Shell();
        }

    }
    public static void main(String[] args) {
        MyGameFrame f = new MyGameFrame();
        f.launchFrame();
    }

    //添加双缓冲技术，解决闪屏问题
    private Image offScreenImage = null;

    public void update(Graphics g) {
        if(offScreenImage == null)
            offScreenImage = this.createImage(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);//这是游戏窗口的宽度和高度

        Graphics gOff = offScreenImage.getGraphics();
        paint(gOff);
        g.drawImage(offScreenImage, 0, 0, null);
    }

}
