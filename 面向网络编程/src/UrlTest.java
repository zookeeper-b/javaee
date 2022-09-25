import java.net.MalformedURLException;
import java.net.URL;

public class UrlTest {
    public static void main(String[] args) throws MalformedURLException {
        URL url=new URL("http://cn.bing.com/search?q=itbz");
        System.out.println(url.getDefaultPort());
        System.out.println("资源"+url.getFile());
        System.out.println(url.getHost());
        System.out.println(url.getPath());
        System.out.println(url.getProtocol());
        System.out.println(url.getQuery());


    }
}
