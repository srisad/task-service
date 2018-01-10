package com.srisad.ems.taskservice.model;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name="tasks")
public class Task {
   
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   @Column(name="task_id")
   private Integer taskId;
   
   @Column(name="task_desc")
   private String taskDescription;
   
   @Column(name="story_id")
   private Integer storyId;
   
   @Column(name = "user_id")
   private Integer userId;
}
