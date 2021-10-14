package com.l3ios.shopinglisttesting.repositories

import androidx.lifecycle.LiveData
import com.l3ios.shopinglisttesting.data.local.ShoppingItem
import com.l3ios.shopinglisttesting.data.remote.responses.ImageResponse
import com.l3ios.shopinglisttesting.other.Resource

interface ShoppingRepository {

    suspend fun insertShoppingItem(shoppingItem: ShoppingItem)

    suspend fun deleteShoppingItem(shoppingItem: ShoppingItem)

    fun observeAllShoppingItems(): LiveData<List<ShoppingItem>>

    fun observeTotalPrice(): LiveData<Float>

    suspend fun searchForImage(imageQuery: String): Resource<ImageResponse>
}