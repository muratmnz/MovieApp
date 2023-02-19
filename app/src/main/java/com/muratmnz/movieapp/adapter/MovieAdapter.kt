package com.muratmnz.movieapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muratmnz.movieapp.R
import kotlinx.android.synthetic.main.item_movie.view.*

class MovieAdapter(val movieList: ArrayList<com.muratmnz.movieapp.model.Movie>) :
    RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    class MovieViewHolder(var view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_movie, parent, false)
        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.view.name.text = movieList[position].id.toString()
        holder.view.status.text = movieList[position].page.toString()
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    //will continue.
    fun updateMovieList(newCountryList: List<com.muratmnz.movieapp.model.Movie>) {
        movieList.clear()
        movieList.addAll(newCountryList)
        notifyDataSetChanged()
    }
}