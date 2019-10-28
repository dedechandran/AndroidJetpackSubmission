package com.example.androidjetpacksubmission.testing

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.androidjetpacksubmission.R
import com.example.androidjetpacksubmission.base.BaseActivity

class SingleFragmentActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.single_fragment_activity)
    }

    fun setFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainer, fragment, "TEST")
            .commit()
    }

    fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainer, fragment)
            .commit()
    }
}