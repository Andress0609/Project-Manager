/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comments;

import Users.User;

/**
 *
 * @author Student
 */
public class Comment {
    private int id;
    private User users;
    private String comment;

    public int getId() {
        return id;
    }

    public User getUsers() {
        return users;
    }

    public String getComment() {
        return comment;
    }

    public Comment(int id, User users, String comment) {
        this.id = id;
        this.users = users;
        this.comment = comment;
    }

    public Comment() {
        this(0, new User(), "");
    }

   
    
    
    
}
