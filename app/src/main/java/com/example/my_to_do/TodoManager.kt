package com.example.my_to_do

import java.time.Instant
import java.util.Date

object TodoManager {
    private val todoList = mutableListOf<Todo>()

    fun getAllTodo() : List<Todo> {
        return  todoList
    }

    fun AddTodo(title : String) {
        todoList.add(Todo(System.currentTimeMillis().toInt(), title, Date.from(Instant.now())))
    }

    fun DeleteTodo(id : Int){
        todoList.removeIf{
            it.id == id
        }
    }
}