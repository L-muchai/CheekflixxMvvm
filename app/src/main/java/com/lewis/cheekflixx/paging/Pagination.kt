package com.lewis.cheekflixx.paging

interface Pagination<Key, Item> {
    suspend fun loadNextPage()
    fun reset()
}