package Week11.Sockets;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TelnetServer {
    public static void main(String[] args) {
        connectToServer();
    }

    public static void connectToServer() {
        // create Server- and ConnectionSocket
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            Socket connectionSocket = serverSocket.accept();

            // Input and output stream for server
            InputStream inputToServer = connectionSocket.getInputStream();
            OutputStream outputFromServer = connectionSocket.getOutputStream();

            // Input Scanner
            Scanner scanner = new Scanner(inputToServer, StandardCharsets.UTF_8);
            // Output printer
            PrintWriter serverPrintOut = new PrintWriter(new OutputStreamWriter(outputFromServer, StandardCharsets.UTF_8), true);

            while (true) {
                // read next line from client input
                String line = scanner.nextLine();
                // print modified version of input
                serverPrintOut.println(sarcasm(line));
                System.out.println("Client: " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String sarcasm(String line) {
        line = line.toLowerCase();
        String ret = "";
        for (int i = 0; i < line.length(); i++) {
            if (i % 2 == 0) {
                ret += Character.toUpperCase(line.charAt(i));
            } else {
                ret += line.charAt(i);
            }
        }
        return ret;
    }
}