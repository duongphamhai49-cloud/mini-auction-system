package com.auction;

public class Item {
    private int id;
    private String name;
    private double startingPrice; // Giá khởi điểm [cite: 42]
    private double currentBid;    // Giá hiện tại cao nhất [cite: 44]

    public Item(int id, String name, double startingPrice) {
        this.id = id;
        this.name = name;
        this.startingPrice = startingPrice;
        this.currentBid = startingPrice; // Mặc định giá hiện tại bằng giá khởi điểm
    }

    // Getter và Setter theo nguyên tắc đóng gói [cite: 119]
    public String getName() { return name; }
    public double getCurrentBid() { return currentBid; }
    public void setCurrentBid(double currentBid) { this.currentBid = currentBid; }
}