package com.codepath.bestsellerlistapp

/**
 * This interface is used by the [BestSellerBooksRecyclerViewAdapter] to ensre
 * it has an appropriate Listener.
 *
 * In this app, it's implemented by [BestSellerBooksFragment]
 */
interface OnListFragmentInteractionListener {
    fun onItemClick(item: BestSellerBook)
}
