package com.bootsample.DAO;
import org.springframework.data.repository.CrudRepository;

import com.bootsample.model.Task;

public interface TaskRepository extends CrudRepository<Task, Integer>{

}
