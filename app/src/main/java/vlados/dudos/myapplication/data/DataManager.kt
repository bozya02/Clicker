package vlados.dudos.myapplication.data

import android.content.Context
import android.content.SharedPreferences

class DataManager(private val baseContext: Context) {
    private val shared: SharedPreferences

    init {
        shared = baseContext.getSharedPreferences("cum", Context.MODE_PRIVATE)
    }

    fun getCPS() : Int = shared.getInt("cps", 0)
    fun getCPC() : Int = shared.getInt("cpc", 1)
    fun getCurrentCum() : Int = shared.getInt("current", 0)
    fun getPriceCPC() : Int = shared.getInt("cpc_price", 120)

    fun setCPS(num: Int) = shared.edit().putInt("cps", num).apply()
    fun setCPC(num: Int) = shared.edit().putInt("cpc", num).apply()
    fun setCurrentCum(num: Int) = shared.edit().putInt("current", num).apply()

    fun setPriceCPC(num: Int) = shared.edit().putInt("cpc_price", num).apply()
}