package com.example.abhatripathi.iitline;

public class itemVideo  {
    public itemVideo(){

    }
    public itemVideo(String videourl) {
        this.videourl = videourl;
    }


    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl;
    }

    String videourl;

}
