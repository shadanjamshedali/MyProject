package com.dsv.task.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dsv.task.model.Task;

@RestController
@RequestMapping("api")
public class TaskController {
	
	@GetMapping("/tasks")
	public ResponseEntity<Task> getAll(){
		return new ResponseEntity.ok(taskService.getTasks);	
		
	}
	
	@PostMapping("/tasks")
	public ResponseEntity<Task> addTasks(@RequestBody Task task){
		Task task=taskService.saveTask();
		return new ResponseEntity<>(task, HttpStatus.CREATED);
	}
	
	@GetMapping("/tasks/{id}")
	public ResponseEntity<Task> getTaskById(@PathVariable Long id){
		
		Task task= taskService.findByid(id);
		
		if(task!=null) {
			
			return ResponseEntity.ok(task);
		}
		return ResponseEntity.notFound().build();
	}
	
	@PutMapping("/tasks/{id}")
	public ResponseEntity<task> updateTask(@PathVariable Long id,@RequestBody Task task){
		
		Task task= taskService.update(id,updatedTask);
			if(task!=null) {
			
			return ResponseEntity.ok(task);
		}
		return ResponseEntity.notFound().build();
		
	}
	
	
	@DeleteMapping("tasks/{id}")
	public ResponseEntity<Void> deleteTaskById(@PathVariable Long id){
		
		boolean deleted= taskService.delete(id);
		
		if(deleted) {
			
			return ResponseEntity.noContent().build();
			
		}
		return ResponseEntity.notFound().build();
		
		
		
		
	}

}
