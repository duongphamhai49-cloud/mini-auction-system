package com.auction;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AuctionUI extends Application {

    @Override
    public void start(Stage stage) {
        // Tạo một nhãn hiển thị đơn giản để kiểm tra
        Label label = new Label("Chào mừng bạn đến với Hệ thống Đấu giá!");

        StackPane root = new StackPane(label);
        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("Mini Auction System - Lite Version");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}