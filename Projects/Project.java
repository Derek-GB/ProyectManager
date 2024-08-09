/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projects;

import Tasks.Task;
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
    
    public void findTask(){
        
    }
    

     
     public int howMany(){
         return tasks.size();
     }
     
     public int howComplete(){
         int cant=0;
         for (Task task : tasks){
             if (task.isComplete()){
                 cant++;
                 
             }
         }
         return cant;
     }
     
     public int howPercentage(){
       return howComplete()/howMany();
     }
            
            
    public void addTask(Task project){
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
