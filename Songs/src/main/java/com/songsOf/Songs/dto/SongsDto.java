package com.songsOf.Songs.dto;


import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class SongsDto {

    @NotEmpty(message = "songNumber can not be a null or empty")
    @Column(nullable = false)
    private String songNumber;

    @NotEmpty(message = "songName can not be a null or empty")
    @Column(nullable = false)
    private String songName;
    @Lob
    private String fullSong;
    @Lob
    private String english;
    @Lob
    private String hindi;
    @Lob
    private String oria;
    @Lob
    private String telugu;
    @Lob
    private String  language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSongNumber() {
        return songNumber;
    }

    public void setSongNumber(String songNumber) {
        this.songNumber = songNumber;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getFullSong() {
        return fullSong;
    }

    public void setFullSong(String fullSong) {
        this.fullSong = fullSong;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getHindi() {
        return hindi;
    }

    public void setHindi(String hindi) {
        this.hindi = hindi;
    }

    public String getOria() {
        return oria;
    }

    public void setOria(String oria) {
        this.oria = oria;
    }

    public String getTelugu() {
        return telugu;
    }

    public void setTelugu(String telugu) {
        this.telugu = telugu;
    }
}