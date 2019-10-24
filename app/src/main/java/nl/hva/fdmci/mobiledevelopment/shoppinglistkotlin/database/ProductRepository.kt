package nl.hva.fdmci.mobiledevelopment.shoppinglistkotlin.database

import android.content.Context
import nl.hva.fdmci.mobiledevelopment.shoppinglistkotlin.model.Product

class ProductRepository(context: Context) {

    private val productDAO: ProductDAO

    init {
        val database =
            ShoppingListRoomDatabase.getDatabase(
                context
            )
        productDAO = database!!.productDAO()
    }

    suspend fun getAllProducts(): List<Product> {
        return productDAO.getAllProducts()
    }

    suspend fun insertProduct(product: Product) {
        productDAO.insertProduct(product)
    }

    suspend fun deleteProduct(product: Product) {
        productDAO.deleteProduct(product)
    }

    suspend fun deleteAllProducts() {
        productDAO.deleteAllProducts()
    }

}
