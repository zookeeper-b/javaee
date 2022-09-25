import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOUtilsDemo {
    public static void main(String[] args) throws IOException {
        String content = IOUtils.toString(new FileInputStream("d:/a.txt"), "utf-8");
        System.out.println(content);

    }


}
