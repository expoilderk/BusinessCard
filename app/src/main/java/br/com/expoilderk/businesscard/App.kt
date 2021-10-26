package br.com.expoilderk.businesscard

import android.app.Application
import br.com.expoilderk.businesscard.data.AppDataBase
import br.com.expoilderk.businesscard.data.BusinessCardRepository

class App : Application() {
    val dataBase by lazy { AppDataBase.getDataBase(this) }
    val repository by lazy { BusinessCardRepository(dataBase.businessDao()) }
}