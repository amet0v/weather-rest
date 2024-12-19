package com.ametov.weather_rest.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Condition {
    private String text;
    private String icon;
    private Integer code;

    @Override
    public String toString() {
        return "Condition{" +
                "text='" + text + '\'' +
                ", icon='" + icon + '\'' +
                ", code=" + code +
                '}';
    }
}
