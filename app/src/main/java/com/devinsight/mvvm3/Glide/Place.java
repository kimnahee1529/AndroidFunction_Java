package com.devinsight.mvvm3.Glide;

public class Place {
    private String imageUrl;
    private String title;
    private String address;

    public Place(String imageUrl, String title, String address) {
        this.imageUrl = imageUrl;
        this.title = title;
        this.address = address;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getAddress() {
        return address;
    }
}
