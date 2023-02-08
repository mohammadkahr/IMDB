package com.example.imdb_deadlygray.data

import androidx.databinding.Bindable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class signup (val repository: UserRepository) : ViewModel() {
    val users = repository.users


    var inputUsername = MutableLiveData<String>()

    var inputPass = MutableLiveData<String>()
}