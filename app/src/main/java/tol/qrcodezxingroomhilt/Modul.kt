package tol.qrcodezxingroomhilt

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import tol.qrcodezxingroomhilt.data.MainDb
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object Modul {

    @Provides
    @Singleton
    fun provideMainDb(app: Application) : MainDb{
        return Room.databaseBuilder(
            app,
            MainDb::class.java,
            "products.db"
        ).build()
    }

}