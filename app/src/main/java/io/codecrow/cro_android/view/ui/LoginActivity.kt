package io.codecrow.cro_android.view.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import dagger.hilt.android.AndroidEntryPoint
import io.codecrow.cro_android.databinding.ActivityLoginBinding
import io.codecrow.cro_android.model.User
import io.codecrow.cro_android.view.viewmodel.UserViewModel

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {

    private val userViewModel: UserViewModel by viewModels()

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Setup load new fact button
//        binding.btnCatFactLoadNew.setOnClickListener {
//            catFactViewModel.loadCatFact()
//        }

        // Setup view model cat fact observer
        val userObserver = Observer<User> { newUser ->
            // New cat fact received from API
//            binding.txtViewCatFact.text = newUser.displayName
        }
        userViewModel.user.observe(this, userObserver)

        // Load data at start
        userViewModel.loadUser()
    }
}