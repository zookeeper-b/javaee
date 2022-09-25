public class TestIf04 {
    public static void main(String[] args) {
        int month = (int) (Math.random() * 12 + 1);
        /** if (month==1||month==2||month==3||month==4||month==5||month==6){
         System.out.println("上半年"+month+"月");
         }
         else{
         System.out.println("下半年"+month+"月");
         }
         */
        switch (month) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("上半年" + month + "月");
                break;
            default:
                System.out.println("下半年" + month + "月");

        }
        String computer = "联想";
        switch (computer) {
            case "联想":
                System.out.println("人类没有联想，会怎么样？？？");
                break;
            case "华为":
                System.out.println("支持华为");
                break;
            default:
                System.out.println("其他品牌");
                break;
        }

    }


}
