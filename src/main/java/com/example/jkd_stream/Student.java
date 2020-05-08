package com.example.jkd_stream;


import java.time.LocalDateTime;
import java.util.Date;

public class Student {


    public static void main(String[] args) {

        System.out.println("还是乱码吗" );

    }
    private String id;

    private String regionId;

    private LocalDateTime deviceTime;

    private Double noiseValue;

    private Double noiseStatus;

    @Override
    public String toString() {
        return "Student{" + "id='" + id + '\'' + ", regionId='" + regionId + '\'' + ", deviceTime=" + deviceTime + ", noiseValue=" + noiseValue + ", noiseStatus=" + noiseStatus + '}';
    }

    public LocalDateTime getDeviceTime() {
        return deviceTime;
    }

    public void setDeviceTime(LocalDateTime deviceTime) {
        this.deviceTime = deviceTime;
    }

    public String getId() {
        System.out.println( "id " + id);
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }



    public Double getNoiseValue() {
        return noiseValue;
    }

    public void setNoiseValue(Double noiseValue) {
        this.noiseValue = noiseValue;
    }

    public Double getNoiseStatus() {
        return noiseStatus;
    }

    public void setNoiseStatus(Double noiseStatus) {
        this.noiseStatus = noiseStatus;
    }
}
