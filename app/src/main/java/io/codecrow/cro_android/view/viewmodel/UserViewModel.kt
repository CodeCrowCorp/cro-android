package io.codecrow.cro_android.view.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import io.codecrow.cro_android.model.User
import io.codecrow.cro_android.service.repository.UserRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(
    private val userRepository: UserRepository
) : ViewModel() {

    private val _user = MutableLiveData<User>()
    val user: LiveData<User> = _user

    fun loadUser() {
        viewModelScope.launch {
            try {
                _user.value = userRepository.getUser()
            } catch (e: Exception) {
                // Retrofit error
                e.printStackTrace()
            }
        }
    }
}