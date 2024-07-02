package com.example.my_to_do

import java.util.Date
import java.time.Instant

data class Todo(
    var id : Int,
    var title : String,
    var CreatedAt : Date
)

fun getFakeTodo() : List<Todo>{
    return listOf<Todo>(
        Todo(1,"Todo item 1", Date.from(Instant.now())),
        Todo(2,"Todo item 2", Date.from(Instant.now())),
        Todo(3,"Todo item 3", Date.from(Instant.now())),
    );
}
