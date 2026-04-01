package com.auction;

public class AuctionManager {
    // Biến static duy nhất của lớp
    private static AuctionManager instance;

    // Private constructor để ngăn việc tạo đối tượng từ bên ngoài
    private AuctionManager() {}

    // Phương thức static để lấy instance duy nhất
    public static AuctionManager getInstance() {
        if (instance == null) {
            instance = new AuctionManager();
        }
        return instance;
    }

    // Logic xử lý đấu giá cơ bản (Sẽ mở rộng sau)
    public boolean placeBid(Item item, double amount) {
        if (amount > item.getCurrentBid()) { // Kiểm tra tính hợp lệ của giá đấu [cite: 49]
            item.setCurrentBid(amount); // Cập nhật người dẫn đầu [cite: 50]
            return true;
        }
        return false;
    }
}