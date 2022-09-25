import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileUtilsDemo1 {
    public static void main(String[] args) throws IOException {
        String content = FileUtils.readFileToString(new File("d:/a.txt"), "UTF-8");
        System.out.println(content);


    }
}
