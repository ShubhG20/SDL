package com.example.climatenews;


import android.os.Parcel;
import android.os.Parcelable;

import com.google.firebase.database.IgnoreExtraProperties;

import java.io.Serializable;

public class Data implements Parcelable {

    private String src;

    private String summary;


    public Data(String src, String summary) {
        this.src = src;
        this.summary = summary;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }


    public Data(Parcel in) {

        String[] data = new String[2];
        in.readStringArray(data);

        this.src = data[0];
        this.summary = data[1];

    }


    @Override

    public int describeContents() {


        //TODO Auto-generated method stub

        return 0;

    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        //TODO Auto-generated method stub

        dest.writeStringArray(new String[]{
                this.src, this.summary
        });
    }
        public static final Parcelable.Creator<Data> CREATOR = new Parcelable.Creator<Data>() {

            @Override
            public Data createFromParcel(Parcel source) {

                //TODO Auto-generated method stub

                return new Data(source);
            }


            @Override

            public Data[] newArray(int size) {

                //TODO Auto-generated method stub
                return new Data[size];
            }
        };



}
