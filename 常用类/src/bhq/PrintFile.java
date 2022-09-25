package bhq;

import java.io.File;

public class PrintFile {
    public static void main(String[] args) {
        long l1 = System.currentTimeMillis();
        File f = new File("D:/environment");
        printFile(f, 0);
        long l2 = System.currentTimeMillis();
        System.out.println(l2-l1);

    }

    static void printFile(File file, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("-");

        }
        System.out.println(file.getName());
        if (file.isDirectory()) {
            File files[] = file.listFiles();
            for (File f : files
            ) {
                printFile(f, level + 1);
            }
        }

    }


}
