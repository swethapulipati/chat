package com.example.chatapp;

public class userprofile {
    String uname;
    String display_picture;
    String bio;
    String uid;
    long phn_num;
    String dob;

    userprofile(){}
    userprofile(String uname, String display_picture, String bio, String uid, long phn_num, String dob){
        this.uname = uname;
        this.display_picture = display_picture;
        this.bio = bio;
        this.uid = uid;
        this.phn_num = phn_num;
        this.dob = dob;
    }
    public String getUname(){return this.uname;}
    public void setUname(String uname){this.uname = uname;}

    public String getDisplay_picture(){return this.display_picture;}
    public void setDisplay_picture(String display_picture){this.uname = display_picture;}

    public String getBio(){return this.bio;}
    public void setBio(String bio){this.uname = bio;}

    public String getUid(){return this.uid;}
    public void setUid(String uid){this.uid = uid;}

    public long getPhn_num(){return this.phn_num;}
    public void setPhn_num(long phn_num){this.phn_num = phn_num;}

    public String getDob(){return this.dob;}
    public void setDob(String dob){this.dob = dob;}

    userprofile user1 = new userprofile("Harry", "abc", "xyz", "123", 1000, "22/06");
    userprofile user 2 = new userprofile();

}
