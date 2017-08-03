package com.binary.api.models.responses;

import com.google.gson.annotations.SerializedName;
import io.reactivex.annotations.Nullable;

import java.util.List;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/3/2017
 */
public class Underlying {

    @SerializedName("name")
    private String name;

    @SerializedName("settlement")
    private String settlement;

    @SerializedName("symbol")
    private String symbol;

    @SerializedName("events")
    @Nullable
    private List<UnderlyingEvent> events;

    @SerializedName("times")
    private UnderlyingTimes times;

    public class UnderlyingEvent {

        @SerializedName("dates")
        private String dates;

        @SerializedName("descrip")
        private String description;

        public String getDates() {
            return dates;
        }

        public String getDescription() {
            return description;
        }
    }

    public class UnderlyingTimes {

        @SerializedName("close")
        private List<String> close;

        @SerializedName("open")
        private List<String> open;

        @SerializedName("settlement")
        private String settlement;
    }
}
