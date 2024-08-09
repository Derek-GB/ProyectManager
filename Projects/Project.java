/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projects;

import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class Project {
    private int id;
    private String name;
    private ArrayList<Task> tasks;
    private int count=1;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }
    
    public void addProjects(Project project){
        tasks.add(project);
        count+=1;
    }
    
    public void deleteProjects(int index){
        tasks.remove(index);
    }
    
    public ArrayList<Task> listTasks(){
        return tasks;
    }

    public Project(int id, String name) {
        this.id = count;
        this.name = name;
        this.tasks = new ArrayList<>();
    }
    
    public Project() {
        this(-1,"");
    }
    
    
}
