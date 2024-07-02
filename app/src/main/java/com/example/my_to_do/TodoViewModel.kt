package com.example.my_to_do

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TodoViewModel : ViewModel() {

    private var _todoList = MutableLiveData<List<Todo>>()
    val todoList : LiveData<List<Todo>> = _todoList

    fun getAllTodo() {
        _todoList.value = TodoManager.getAllTodo().reversed()
    }

    fun AddTodo(title : String){
        TodoManager.AddTodo(title)
        getAllTodo()
    }

    fun DeleteTodo(id : Int){
        TodoManager.DeleteTodo(id)
        getAllTodo()
    }
}