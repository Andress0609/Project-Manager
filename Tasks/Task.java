/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tasks;

import Comments.Comment;
import Users.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class Task {
    private int id;
    private String descripcion;
    private User Users;
    private boolean completado;
    private ArrayList<Comment> commentList;

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public User getUsers() {
        return Users;
    }

    public boolean isCompletado() {
        return completado;
    }

    public List getCommentList() {
        return commentList;
    }
    
    public void addcomment(Comment comment) {
        commentList.add(comment);
    }
    
     public void removecomment(Comment comment) {
        commentList.remove(comment);
    }

    public Task(int id, String descripcion, User Users, boolean completado) {
        this.id = id;
        this.descripcion = descripcion;
        this.Users = Users;
        this.completado = completado;
        this.commentList = new ArrayList();
    }

    public Task() {
        this(0,"",new User(),false);
    }

    @Override
    public String toString() {
        return "Task{" + "id=" + id + ", descripcion=" + descripcion + ", Users=" + Users + ", completado=" + completado + ", commentList=" + commentList + '}';
    }
   
    

}
