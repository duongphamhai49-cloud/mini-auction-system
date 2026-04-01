package com.auction;

import java.io.*;
import java.net.*;

public class AuctionServer {
    private static final int PORT = 1234; // Cổng kết nối theo thiết kế Networking

    public void startServer() {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server đấu giá đang chạy tại cổng " + PORT + "...");

            while (true) {
                // Chấp nhận kết nối từ một người dùng (Client)
                Socket clientSocket = serverSocket.accept();
                System.out.println("Có người dùng mới kết nối: " + clientSocket.getInetAddress());

                // Trong dự án thực tế, chúng ta sẽ dùng Thread để xử lý nhiều người cùng lúc [cite: 83]
                // Hiện tại, chúng ta tạm thời thông báo kết nối thành công.
                handleClient(clientSocket);
            }
        } catch (IOException e) {
            System.out.println("Lỗi Server: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void handleClient(Socket socket) {
        try (PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {
            out.println("Chào mừng bạn đến với hệ thống đấu giá trực tuyến!");
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        AuctionServer server = new AuctionServer();
        server.startServer();
    }
}