package com.songsOf.Songs.mapper;

import com.songsOf.Songs.dto.SongsDto;
import com.songsOf.Songs.entity.Song;

public class SongMapper {

    public static Song toEntity(SongsDto songsDto) {
        if (songsDto == null) {
            return null;
        }

        Song song = new Song();
        song.setSongNumber(songsDto.getSongNumber());
        song.setSongName(songsDto.getSongName());
        song.setFullSong(songsDto.getFullSong());
        song.setEnglish(songsDto.getEnglish());
        song.setHindi(songsDto.getHindi());
        song.setOria(songsDto.getOria());
        song.setTelugu(songsDto.getTelugu());

        return song;
    }

    public static SongsDto toDto(Song song) {
        if (song == null) {
            return null;
        }

        SongsDto songsDto = new SongsDto();
        songsDto.setSongNumber(song.getSongNumber());
        songsDto.setSongName(song.getSongName());
        songsDto.setFullSong(song.getFullSong());
        songsDto.setEnglish(song.getEnglish());
        songsDto.setHindi(song.getHindi());
        songsDto.setOria(song.getOria());
        songsDto.setTelugu(song.getTelugu());

        return songsDto;
    }
}
