package com.prakriti.retrofittestapp;

import com.google.gson.annotations.SerializedName;

public class EmployeeData {

    @SerializedName("name")
    private String character;
    @SerializedName("real_name")
    private String realName;
    @SerializedName("team")
    private String team;
    @SerializedName("firstappearance")
    private String firstSeen;
    @SerializedName("createdby")
    private String creator;
    @SerializedName("publisher")
    private String publisher;
    @SerializedName("imageurl")
    private String image;
    @SerializedName("bio")
    private String info;

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getFirstSeen() {
        return firstSeen;
    }

    public void setFirstSeen(String firstSeen) {
        this.firstSeen = firstSeen;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
