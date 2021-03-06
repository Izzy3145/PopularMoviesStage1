package com.example.android.popularmoviesstage1.movies;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by izzystannett on 25/02/2018.
 */

public class MovieItem implements Parcelable {

    public static final Creator CREATOR = new Creator() {
        @Override
        public MovieItem createFromParcel(Parcel parcel) {
            return new MovieItem(parcel);
        }

        @Override
        public MovieItem[] newArray(int i) {
            return new MovieItem[i];
        }
    };

    private String mOriginalTitle;
    private String mImageUrl;
    private String mPlotSynopsis;
    private int mUserRating;
    private String mReleaseDate;
    private int mTag;
    private String mUriString;
    private int mID;

    public MovieItem(String originalTitle, String imageUrl, String plotSynopsis,
                     int userRating, String releaseDate, int id) {
        mOriginalTitle = originalTitle;
        mImageUrl = imageUrl;
        mPlotSynopsis = plotSynopsis;
        mUserRating = userRating;
        mReleaseDate = releaseDate;
        mID = id;
    }

    public MovieItem(String originalTitle, String imageUrl, String plotSynopsis,
                     int userRating, String releaseDate, int id, Uri uri) {
        mOriginalTitle = originalTitle;
        mImageUrl = imageUrl;
        mPlotSynopsis = plotSynopsis;
        mUserRating = userRating;
        mReleaseDate = releaseDate;
        mID = id;
        mUriString = uri.toString();
    }

    //override Parcelable methods
    protected MovieItem(Parcel in) {
        mOriginalTitle = in.readString();
        mImageUrl = in.readString();
        mPlotSynopsis = in.readString();
        mUserRating = in.readInt();
        mReleaseDate = in.readString();
        mUriString = in.readString();
        mTag = in.readInt();
        mID = in.readInt();
    }

    //set getter methods
    public String getmOriginalTitle() {
        return mOriginalTitle;
    }

    public String getmImageUrl() {
        return mImageUrl;
    }

    public String getmPlotSynopsis() {
        return mPlotSynopsis;
    }

    public int getmUserRating() {
        return mUserRating;
    }

    public String getmReleaseDate() {
        return mReleaseDate;
    }

    public String getmUriString() {
        return mUriString;
    }

    public int getTag() {
        return mTag;
    }

    public void setTag(final int tag) {
        mTag = tag;
    }

    public int getID() {
        return mID;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mOriginalTitle);
        parcel.writeString(mImageUrl);
        parcel.writeString(mPlotSynopsis);
        parcel.writeInt(mUserRating);
        parcel.writeString(mReleaseDate);
        parcel.writeString(mUriString);
        parcel.writeInt(mTag);
        parcel.writeInt(mID);
    }
}
