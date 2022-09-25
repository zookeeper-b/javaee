/**
 * @author bhq
 * @date 2022/7/31--12:07
 */
import javax.annotation.Generated;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        //标准输入
        Scanner scanner=new Scanner(System.in);
        //高度
        float h=scanner.nextFloat();
        //落地次数
        int n =scanner.nextInt();

        //第n次反弹后经过的总距离
        float distance=0;
        for(int i=1;i<=n;i++){
            //高度减半
            h/=2;
            //记录距离相应的变化
            distance+=h*3;
        }
        //由于要计算第n次落地时经过的距离，所以要减去最后一次反弹的高度，即distance-h
        System.out.println(String.format("%.3f", h)+" "+String.format("%.3f", distance-h));

    }
}

