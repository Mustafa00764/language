package uz.datatalim.localization.utils

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity

class SharedPrefManager(context: Context) {
   private val pref: SharedPreferences = context.getSharedPreferences("MySharedPref", AppCompatActivity.MODE_PRIVATE)

    fun saveLanguage(language: String) {
        val editor = pref.edit()
        editor.putString("myLangugae", language)
        editor.apply()
    }

    fun getMyLanguage(): String {
        val language = pref.getString("myLangugae", "ar")
        return language!!
    }

}