package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/8/25/0025.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    @SerializedName("cw")
    public CarWash carWash;
    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public Sport sport;
    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}