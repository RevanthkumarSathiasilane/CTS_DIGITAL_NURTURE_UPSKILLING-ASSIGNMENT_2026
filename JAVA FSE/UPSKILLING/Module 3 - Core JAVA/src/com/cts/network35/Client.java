package src.com.cts.network35;
import java.io.*;
import java.net.*;
import java.util.*;
/* 35. TCP Client-Server Chat - ClientSide
• Objective: Use Java sockets for TCP communication.
• Task: Implement a simple TCP chat system.
• Instructions:
o Create a ServerSocket that listens for connections.
o Accept client connections and use InputStream and OutputStream for two-way
communication.
o Run server and client in different terminals.
*/
public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);
            System.out.println("Connected to server!");
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
                System.out.print("Client: ");
                String clientMessage = sc.nextLine();
                output.println(clientMessage);
                if (clientMessage.equalsIgnoreCase("exit")) {
                    break;
                }
                String serverMessage = input.readLine();
                System.out.println("Server: " + serverMessage);
            }
            socket.close();
        } catch (Exception e) {
            System.out.println("Client Error: " + e.getMessage());
        }
    }
}
