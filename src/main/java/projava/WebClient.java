package projava;

import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import java.io.*;
import java.net.Socket;

public class WebClient {
    public static void main(String[] args) throws IOException {
        String domain = "www.google.com";
        SocketFactory factory = SSLSocketFactory.getDefault();
        try(Socket soc = factory.createSocket(domain, 443);
            PrintWriter pw = new PrintWriter(soc.getOutputStream());
            InputStreamReader isr = new InputStreamReader(soc.getInputStream());
            BufferedReader bur = new BufferedReader(isr);)
        {
            pw.println("GET /index.html HTTP/1.1");
            pw.println("Host: " + domain);
            pw.println();
            pw.flush();
            bur.lines()
                    .limit(18)
                    .forEach(System.out::println);

        }
    }
}
