package com.example.demo.Entity;

import javax.persistence.*;
import java.util.List;
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;
    private String userName;
    private String userEmail;
    private String userSubscription;


    //private List playHistory;

    public User() {
    }

    public User(int userID, String userName, String userEmail, String userSubscription, List playHistory) {
        this.userID = userID;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userSubscription = userSubscription;
       // this.playHistory = playHistory;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserSubscription() {
        return userSubscription;
    }

    public void setUserSubscription(String userSubscription) {
        this.userSubscription = userSubscription;
    }




}
