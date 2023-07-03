package com.example.chatapp;

public class messages {
    String senderID;
    String receiverID;
    String timestamp;
    String type;
    String text ;
    String uname;

    public messages(){}

    public messages( String senderID,String receiverID,String timestamp,String type,String text,String uname){
        this.senderID = senderID;
        this.receiverID = receiverID;
        this.timestamp = timestamp;
        this.type = type;
        this.uname = uname;
        this.text = text;
    }

    public String getText(){
        return this.text;
    }
    public void setText(String text){
        this.text = text;
    }

    public String getSenderID(){
        return this.senderID;
    }
    public void setSenderID(String senderID){
        this.senderID = senderID;
    }

    public String getReceiverID(){
        return this.receiverID;
    }

    public void setReceiverID(String receiverID){
        this.receiverID = receiverID;
    }

    messages message_1 = new messages("1","2","1001","text","Hey", "Master")
            messages messages_2 new messages();
}
