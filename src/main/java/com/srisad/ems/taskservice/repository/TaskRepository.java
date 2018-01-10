package com.srisad.ems.taskservice.repository;

import com.srisad.ems.taskservice.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
   
   List<Task> findByStoryId(Integer storyId);
   
}
