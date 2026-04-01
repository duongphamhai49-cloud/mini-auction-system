package com.auction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // Thông tin kết nối (Địa chỉ, tên Database, tài khoản)
    private static final String URL = "jdbc:mysql://localhost:3306/auction_db";
    private static final String USER = "root";
    private static final String PASSWORD = "123456"; // THAY MẬT KHẨU CỦA BẠN VÀO ĐÂY

    private static Connection connection;

    // Singleton: Hàm lấy kết nối duy nhất
    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            try {
                // Đăng ký Driver (giúp Java hiểu cách nói chuyện với MySQL)
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Kết nối Database thành công!");
            } catch (ClassNotFoundException e) {
                System.out.println("Không tìm thấy Driver MySQL!");
                e.printStackTrace();
            }
        }
        return connection;
    }
}