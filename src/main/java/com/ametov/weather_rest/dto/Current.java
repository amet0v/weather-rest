package com.ametov.weather_rest.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Current {
    private Integer last_updated_epoch;
    private String last_updated;
    private Double temp_c;
    private Double temp_f;
    private Integer is_day;
    private Condition condition;
    private Double wind_mph;
    private Double wind_kph;
    private Double wind_degree;
    private String wind_dir;
    private Double pressure_mb;
    private Double pressure_in;
    private Double precip_mm;
    private Double precip_in;
    private Double humidity;
    private Double cloud;
    private Double feelslike_c;
    private Double feelslike_f;
    private Double windchill_c;
    private Double windchill_f;
    private Double heatindex_c;
    private Double heatindex_f;
    private Double dewpoint_c;
    private Double dewpoint_f;
    private Double vis_km;
    private Double vis_miles;
    private Double uv;
    private Double gust_mph;
    private Double gust_kph;

    @Override
    public String toString() {
        return "Current{" +
                "last_updated_epoch=" + last_updated_epoch +
                ", last_updated='" + last_updated + '\'' +
                ", temp_c=" + temp_c +
                ", temp_f=" + temp_f +
                ", is_day=" + is_day +
                ", condition=" + condition +
                ", wind_mph=" + wind_mph +
                ", wind_kph=" + wind_kph +
                ", wind_degree=" + wind_degree +
                ", wind_dir='" + wind_dir + '\'' +
                ", pressure_mb=" + pressure_mb +
                ", pressure_in=" + pressure_in +
                ", precip_mm=" + precip_mm +
                ", precip_in=" + precip_in +
                ", humidity=" + humidity +
                ", cloud=" + cloud +
                ", feelslike_c=" + feelslike_c +
                ", feelslike_f=" + feelslike_f +
                ", windchill_c=" + windchill_c +
                ", windchill_f=" + windchill_f +
                ", heatindex_c=" + heatindex_c +
                ", heatindex_f=" + heatindex_f +
                ", dewpoint_c=" + dewpoint_c +
                ", dewpoint_f=" + dewpoint_f +
                ", vis_km=" + vis_km +
                ", vis_miles=" + vis_miles +
                ", uv=" + uv +
                ", gust_mph=" + gust_mph +
                ", gust_kph=" + gust_kph +
                '}';
    }

}
