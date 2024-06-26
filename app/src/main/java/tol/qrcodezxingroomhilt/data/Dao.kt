package tol.qrcodezxingroomhilt.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface Dao {
    @Insert
    suspend fun insertProduct(product: Product)
    @Update
    suspend fun updateProduct(product: Product)
    @Query("SELECT * FROM products")
    fun getAllProducts() : Flow<List<Product>>
    @Query("SELECT * FROM products WHERE numberQR = :qr")
    fun getProductByQr(qr: String) : Product?
}