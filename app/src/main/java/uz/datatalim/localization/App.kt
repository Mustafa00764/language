package uz.datatalim.localization

import android.app.Application
import uz.datatalim.localization.utils.LocalManager
import uz.datatalim.localization.utils.SharedPrefManager

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        setMyLanguage()
    }

    private fun setMyLanguage() {
        val mylang = SharedPrefManager(this).getMyLanguage()
        LocalManager.setLocale(this, mylang)
    }

}