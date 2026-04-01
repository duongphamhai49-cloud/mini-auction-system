package com.auction;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        try {
            // Thử lấy kết nối
            Connection conn = DatabaseConnection.getConnection();
            if (conn != null) {
                System.out.println("Chúc mừng! Ứng dụng đã thông với Database.");
            }
        } catch (Exception e) {
            System.out.println("Lỗi kết nối: " + e.getMessage());
            e.printStackTrace();
        }
    }
}