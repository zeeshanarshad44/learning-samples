class ServerDemo {
    
    public void start() throws IOException{
        
        ServerSocket ss = new ServerSocket(5678);
        
        ss.bind(local);
        
        while (true) {
            Socket socket = ss.accept();
            System.out.println("connection established");
            
            BufferedReader reader = getReader(socket);
            System.out.println("from client: " + reader.readLine());
            
            BufferedWriter writer = getWriter(socket);
            writer.write("hello client\n");
            writer.flush();
        }
    }
    public static BufferedReader getReader(Socket socket) throws IOException {
        InputStream in = socket.getInputStream();
        return new BufferedReader(new InputStreamReader(in));
    }

    public static BufferedWriter getWriter(Socket socket) throws IOException {
        OutputStream out = socket.getOutputStream();
        return new BufferedWriter(new OutputStreamWriter(out));
    }
}

class ClientDemo {

    public void start(String host, int port) {

        // 初始化 socket
        Socket socket = new Socket();

        try {
            // 设置 socket 连接
            SocketAddress remote = new InetSocketAddress(host, port);
            socket.setSoTimeout(5000);
            socket.connect(remote);

            // 发起请求
            BufferedWriter writer = ServerDemo.getWriter(socket);
            System.out.println("Send to " + host);
            writer.write("hello server\n");
            writer.flush();

            // 读取响应
            BufferedReader reader = ServerDemo.getReader(socket);
            System.out.println("from server: " + reader.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

public class SimpleSocket {
    public static void main(String[] args) {
        ServerDemo server = new ServerDemo();
        ServerDemo.start();
    }
}
