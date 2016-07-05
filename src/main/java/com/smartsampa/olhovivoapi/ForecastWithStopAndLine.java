package com.smartsampa.olhovivoapi;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by ruan0408 on 12/02/2016.
 */
public class ForecastWithStopAndLine {

    public String currentTime;
    public BusStopWithLines busStopWithLines;

    @JsonCreator
    protected ForecastWithStopAndLine(@JsonProperty("hr") String currentTime,
                                      @JsonProperty("p") BusStopWithLines busStopWithLines) {

        this.currentTime = currentTime;
        this.busStopWithLines = busStopWithLines;
    }

    public BusNow[] getBuses() {
        if (busStopWithLines == null) return null;
        return busStopWithLines.getBuses();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("currentTime", currentTime)
                .append("busStopWithLines", busStopWithLines)
                .toString();
    }
}