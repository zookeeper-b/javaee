import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class FileUtilsDemo2 {
    public static void main(String[] args) throws IOException {
        FileUtils.copyDirectory(new File("d:/a"), new File("d:/b"), new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory() || pathname.getName().endsWith("html")) {
                    return true;
                }
                return false;
            }
        });


    }
}
