package com.example.videostreaming;

public class video_component {
    private int channelName;
    private String title;
    private String videoInfo;
    private int thumbnail;

    public int getChannelName() {
        return channelName;
    }
    public int getThumbnail() {
        return thumbnail;
    }
    public String getTitle() {
        return title;
    }
    public String getVideoInfo() {
        return videoInfo;
    }
    public void setChannelName(int channelName) {
        this.channelName = channelName;
    }
    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setVideoInfo(String videoInfo) {
        this.videoInfo = videoInfo;
    }

    public video_component(int cName , String title , String vInfo , int thumbnail){
        this.channelName = cName;
        this.thumbnail = thumbnail;
        this.videoInfo = vInfo;
        this.title = title;
    }
}
