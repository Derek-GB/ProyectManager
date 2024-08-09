/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tasks;

import Coments.Coment;
import Users.User;
import java.util.ArrayList;

/**
 *
 * @author d2tod
 */
public class Task {
    private int id;
    private String description;
    private boolean complete;
    private User user;
    private ArrayList<Coment> comentList;

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isComplete() {
        return complete;
    }

    public User getUser() {
        return user;
    }

    public ArrayList<Coment> getComentList() {
        return comentList;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public void addComent(Coment coment) {
        this.comentList.add(coment);
    }
    
    public void removeComent(Coment coment) {
        this.comentList.remove(coment);
    }
    
    public Task(int id, User user, String description) {
        this.id = id;
        this.description = description;
        this.complete = false;
        this.user = user;
        this.comentList = new ArrayList<>();
    }
    
    public Task(){
        this(-1,new User(),"");
    }
    
}
