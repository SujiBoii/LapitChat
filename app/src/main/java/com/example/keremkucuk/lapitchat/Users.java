package com.example.keremkucuk.lapitchat;

/**
 * Created by keremkucuk on 21.11.17.
 */

public class Users {

    public String image, name, status;

    public String getThumb_image() {
        return thumb_image;
    }

    public void setThumb_image(String thumb_image) {
        this.thumb_image = thumb_image;
    }

    public String thumb_image;

    public Users(){

    }

    public Users(String image, String name, String status,String thumb_image) {
        this.image = image;
        this.name = name;
        this.status = status;
        this.thumb_image = thumb_image;
    }

    public String getImage() {

        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
