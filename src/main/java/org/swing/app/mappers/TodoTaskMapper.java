package org.swing.app.mappers;

import org.swing.app.dto.todotask.TodoTaskDTO;
import org.swing.app.dto.todotask.TodoTaskInsertDTO;
import org.swing.app.dto.todotask.TodoTaskUpdateDTO;
import org.swing.app.entity.TodoTask;

public class TodoTaskMapper {

    public TodoTask mapToTodoTask(TodoTaskInsertDTO todoTaskInsertDTO) {
        final TodoTask todoTask = new TodoTask();

        todoTask.setName(todoTaskInsertDTO.getName());
        todoTask.setTodoListId(todoTaskInsertDTO.getTodoListId());
        todoTask.setImportantFlag(todoTaskInsertDTO.getImportantFlag());
        todoTask.setDeadline(todoTaskInsertDTO.getDeadline());
        todoTask.setNote(todoTaskInsertDTO.getNote());

        return todoTask;
    }

    public TodoTask mapToTodoTask(TodoTaskUpdateDTO todoTaskUpdateDTO) {
        final TodoTask todoTask = new TodoTask();

        todoTask.setId(todoTaskUpdateDTO.getId());
        todoTask.setName(todoTaskUpdateDTO.getName());
        todoTask.setImportantFlag(todoTaskUpdateDTO.getImportantFlag());
        todoTask.setDeadline(todoTaskUpdateDTO.getDeadline());
        todoTask.setNote(todoTaskUpdateDTO.getNote());
        todoTask.setCompletePercent(todoTaskUpdateDTO.getCompletePercent());
        todoTask.setCompletedDateTime(todoTaskUpdateDTO.getCompletedDateTime());

        return todoTask;
    }

    public TodoTaskDTO mapToTodoTaskDTO(TodoTask todoTask) {
        final TodoTaskDTO todoTaskDTO = new TodoTaskDTO();

        todoTaskDTO.setId(todoTask.getId());
        todoTaskDTO.setTodoListId(todoTask.getTodoListId());
        todoTaskDTO.setName(todoTask.getName());
        todoTaskDTO.setImportantFlag(todoTask.getImportantFlag());
        todoTaskDTO.setDeadline(todoTask.getDeadline());
        todoTaskDTO.setCompletePercent(todoTask.getCompletePercent());
        todoTaskDTO.setCompletedDateTime(todoTask.getCompletedDateTime());
        todoTaskDTO.setNote(todoTask.getNote());
        todoTaskDTO.setCreatedAt(todoTask.getCreatedAt());
        todoTaskDTO.setUpdatedAt(todoTask.getUpdatedAt());

        return todoTaskDTO;
    }
}
