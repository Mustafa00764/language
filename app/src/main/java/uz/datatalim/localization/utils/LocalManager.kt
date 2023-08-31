package uz.datatalim.localization.utils

import android.app.LocaleManager
import android.content.Context
import android.os.Build
import android.os.LocaleList
import androidx.annotation.RequiresApi
import java.util.Locale

object LocalManager {
    private var localeManager: LocaleManager? = null
    fun setLocale(context: Context, language: String) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                setLocal13(context, language)
        } else {
                setLocal12(context,language)
        }

    }

    private fun setLocal12(context: Context, language: String) {
        val locale = Locale(language)
        Locale.setDefault(locale)
        val config = context.resources.configuration
        config.locale = locale
        context.resources.updateConfiguration(config, context.resources.displayMetrics)
    }

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    fun setLocal13(context: Context, language: String) {
        localeManager = context.getSystemService(Context.LOCALE_SERVICE) as LocaleManager
        localeManager?.applicationLocales = LocaleList(Locale.forLanguageTag(language))
    }
}