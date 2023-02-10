package mongo.repository;

import mongo.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface TaskRepository extends MongoRepository <Task,String>{

    List<Object> findBySeverity(int severity);

    @Query(value = "{assignee: 0?}")
    List<Task> getTaskByAssignee(String assignee);
}
