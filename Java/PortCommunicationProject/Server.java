import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {

        int port = 9500;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on port 9500");
            
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Client connected to port 9500");

                new ClientHandler(socket).start();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } 

    }
}

class ClientHandler extends Thread {
    private Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try(
            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
        ) {
            String response;
            while ((response = reader.readLine()) != null) {
                response = response.trim();

                if (response.equals( "Hi")) {
                    writer.println("Hello");
                } 
                else {
                    writer.println("Goodbye");
                }
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                System.out.println("Could not close socket");
            }
        }

    }
}
