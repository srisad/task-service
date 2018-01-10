package com.srisad.ems.taskservice.resource;

import com.srisad.ems.taskservice.model.Task;
import com.srisad.ems.taskservice.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/tasks")
public class TaskResource {
   
   @Autowired
   private TaskRepository taskRepository;
   
   @GetMapping(value="/{storyId}")
   public List<Task> getTasksByStory(@PathVariable Integer storyId) {
      return taskRepository.findByStoryId(storyId);
   }
}
