package src.com.cts.network35;
import java.io.*;
import java.net.*;
import java.util.*;
/* 35. TCP Client-Server Chat - Server Side
• Objective: Use Java sockets for TCP communication.
• Task: Implement a simple TCP chat system.
• Instructions:
o Create a ServerSocket that listens for connections.
o Accept client connections and use InputStream and OutputStream for two-way
communication.
o Run server and client in different terminals.
*/
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket =
                    new ServerSocket(5000);
            System.out.println("Server started...");
            System.out.println("Waiting for client...");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");
            BufferedReader input =
                    new BufferedReader(
                            new InputStreamReader(
                                    socket.getInputStream()));
            PrintWriter output =
                    new PrintWriter(
                            socket.getOutputStream(),
                            true);
            Scanner sc = new Scanner(System.in);
            while (true) {
                String clientMessage = input.readLine();
                if (clientMessage == null) {
                    break;
                }
                System.out.println("\nClient: " + clientMessage);
                if (clientMessage.equalsIgnoreCase("exit")) {
                    break;
                }
                System.out.print("Server: ");
                String serverMessage = sc.nextLine();
                output.println(serverMessage);
            }
            socket.close();
            serverSocket.close();
        } catch (Exception e) {
            System.out.println(
                    "Server Error: " + e.getMessage());
        }
    }
}
