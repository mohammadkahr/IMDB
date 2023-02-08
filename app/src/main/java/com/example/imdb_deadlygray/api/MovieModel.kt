package com.example.imdb_deadlygray.api

import android.os.Parcel
import android.os.Parcelable
import android.os.Parcelable.Creator


class MovieModel : Parcelable {
    var title: String? = null
    var posterPath: String? = null
    var releaseDate: String? = null
    var movieID = 0
    var voteAverage = 0f
    var movieOverview: String? = null



    protected constructor(`in`: Parcel) {
        title = `in`.readString()
        posterPath = `in`.readString()
        releaseDate = `in`.readString()
        movieID = `in`.readInt()
        voteAverage = `in`.readFloat()
        movieOverview = `in`.readString()
    }

    constructor(
        title: String?,
        posterPath: String?,
        releaseDate: String?,
        movieID: Int,
        voteAverage: Float,
        movieOverview: String?
    ) {
        this.title = title
        this.posterPath = posterPath
        this.releaseDate = releaseDate
        this.movieID = movieID
        this.voteAverage = voteAverage
        this.movieOverview = movieOverview
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(title)
        dest.writeString(posterPath)
        dest.writeString(releaseDate)
        dest.writeInt(movieID)
        dest.writeFloat(voteAverage)
        dest.writeString(movieOverview)
    }

    companion object {
        @JvmField
        val CREATOR: Creator<MovieModel?> = object : Creator<MovieModel?> {
            override fun createFromParcel(`in`: Parcel): MovieModel? {
                return MovieModel(`in`)
            }

            override fun newArray(size: Int): Array<MovieModel?> {
                return arrayOfNulls(size)
            }
        }
    }
}
