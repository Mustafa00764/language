package uz.datatalim.localization.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import uz.datatalim.localization.R
import uz.datatalim.localization.utils.LocalManager
import uz.datatalim.localization.utils.SharedPrefManager
import java.util.Locale

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        val bArab = findViewById<Button>(R.id.bArab)
        val bFrans = findViewById<Button>(R.id.bFrans)
        val bGerman = findViewById<Button>(R.id.bGerman)
        val bKor = findViewById<Button>(R.id.bkor)
        val bJapan = findViewById<Button>(R.id.bjapan)
        bArab.setOnClickListener {
            LocalManager.setLocale(this,"ar")
            SharedPrefManager(this).saveLanguage("ar")
            openSecondActivity()
        }
        bFrans.setOnClickListener {
            LocalManager.setLocale(this,"fr")
            SharedPrefManager(this).saveLanguage("fr")
            openSecondActivity()
        }
        bGerman.setOnClickListener {
            LocalManager.setLocale(this,"ge")
            SharedPrefManager(this).saveLanguage("ge")
            openSecondActivity()
        }
        bKor.setOnClickListener {
            LocalManager.setLocale(this,"ko")
            SharedPrefManager(this).saveLanguage("ko")
            openSecondActivity()
        }
        bJapan.setOnClickListener {
            LocalManager.setLocale(this,"ja")
            SharedPrefManager(this).saveLanguage("ja")
            openSecondActivity()
        }

    }



    private fun openSecondActivity() {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }



}