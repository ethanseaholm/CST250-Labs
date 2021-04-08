package com.mycompany.tweet.lab07;

import java.time.Instant;

public class Tweet {
    
    private String text;
    private String datetime;
    private User author;

    public Tweet(String text, String datetime, User author) {
        this.text = text;
        this.datetime = datetime;
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
    
    public Tweet(String text, User author){
        
        this.text = text;
        this.author = author;
        this.datetime = Instant.now().toString();
        
    }
    
    public void display(){
        
        System.out.println("--------------------");
        
        if (this.author.isLocationSet()){
            
            System.out.println(this.author.getName() + " from " + this.author.getLocation() + ":");
            
        }
        
        else {
            
            System.out.println(this.author.getName() + ":");
        
        }
        
        System.out.println(this.text);
        System.out.println("--------------------");
        
    }
    
}
