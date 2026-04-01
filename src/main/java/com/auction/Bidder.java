package com.auction;

public class Bidder extends User {
    public Bidder(int id, String username) {
        // Kế thừa từ lớp cha User [cite: 120]
        super(id, username, "Bidder");
    }
}