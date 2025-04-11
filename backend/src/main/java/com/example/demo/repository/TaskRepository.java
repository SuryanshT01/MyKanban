package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    
    long countByAssignedToIdAndStatus(Long userId, String status);
	long countByAssignedToId(Long userId);
}
