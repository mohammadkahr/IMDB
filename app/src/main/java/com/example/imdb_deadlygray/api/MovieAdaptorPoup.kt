package com.example.imdb_deadlygray.api

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.imdb_deadlygray.R

class MovieAdaptorPoup(val context: Context, var movies: MutableList<Result2>) :
    RecyclerView.Adapter<MovieAdaptorPoup.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName = itemView.findViewById<TextView>(R.id.textViewName)
        val tvRate = itemView.findViewById<TextView>(R.id.textViewRate)
        val tvImageView = itemView.findViewById<ImageView>(R.id.imageViewPicture)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v: View = LayoutInflater.from(parent.context).inflate(R.layout.populermovie, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvName.text = movies[position].title
        holder.tvRate.text = movies[position].vote_average.toString()
        val str ="https://image.tmdb.org/t/p/w342${movies[position].poster_path}"
        //val uri = Uri.parse(str)
        //holder.tvImageView.setImageURI(uri)
        Log.d("onBindViewHolder", "onBindViewHolder: " + str)
//        ImageView(this@Requests).setImageURI(Uri.parse(""))
//        movies.results[position].poster_path

        Glide
            .with(context)
            .load(str)
            .centerCrop()
            .placeholder(R.drawable.ic_baseline_downloading_24)
            .into(holder.tvImageView)

    }

    override fun getItemCount(): Int {
        return movies.size
    }
}