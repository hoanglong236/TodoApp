package org.swing.app.mappers;

import org.swing.app.dto.todolist.TodoListDTO;
import org.swing.app.dto.todolist.TodoListInsertDTO;
import org.swing.app.dto.todolist.TodoListUpdateDTO;
import org.swing.app.entity.TodoList;

public class TodoListMapper {

    public TodoList mapToTodoList(TodoListInsertDTO todoListInsertDTO) {
        final TodoList todoList = new TodoList();
        todoList.setName(todoListInsertDTO.getName());
        return todoList;
    }

    public TodoList mapToTodoList(TodoListUpdateDTO todoListUpdateDTO) {
        final TodoList todoList = new TodoList();

        todoList.setId(todoListUpdateDTO.getId());
        todoList.setName(todoListUpdateDTO.getName());
        todoList.setCompletedDateTime(todoListUpdateDTO.getCompletedDateTime());

        return todoList;
    }

    public TodoListDTO mapToTodoListDTO(TodoList todoList) {
        final TodoListDTO todoListDTO = new TodoListDTO();

        todoListDTO.setId(todoList.getId());
        todoListDTO.setName(todoList.getName());
        todoListDTO.setCompletedDateTime(todoList.getCompletedDateTime());
        todoListDTO.setCreatedAt(todoList.getCreatedAt());
        todoListDTO.setUpdatedAt(todoList.getUpdatedAt());

        return todoListDTO;
    }
}
