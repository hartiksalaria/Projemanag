package com.example.projemanag.activities

import android.content.Intent
import android.os.Bundle
import com.example.projemanag.databinding.ActivityIntroBinding

class IntroActivity : BaseActivity() {

    private var binding : ActivityIntroBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.btnSignUp?.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }

        binding?.btnSignIn?.setOnClickListener {
            startActivity(Intent(this, SignInActivity::class.java))
        }

    }
}