package com.auction;

// Lớp trừu tượng User theo yêu cầu thiết kế OOP
public abstract class User {
    protected int id;
    protected String username;
    protected String password;
    protected String role; // Ví dụ: Bidder, Seller, Admin [cite: 34, 115]

    public User(int id, String username, String role) {
        this.id = id;
        this.username = username;
        this.role = role;
    }

    // Encapsulation: Dùng Getter để bảo vệ dữ liệu [cite: 119]
    public String getUsername() { return username; }
    public String getRole() { return role; }
}