package com.songsOf.Songs.service.Impl;

import com.songsOf.Songs.dto.SongsDto;
import com.songsOf.Songs.entity.Song;
import com.songsOf.Songs.repository.SongRepository;
import com.songsOf.Songs.service.ISongsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SongsService implements ISongsService {

    private final SongRepository songRepository;
    @Autowired
    public SongsService(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    @Override
    public Song addSong(SongsDto songsDto) {

        return null;
    }

    @Override
    public Song fetchSong(String songNumber) {
        return songRepository.findBySongNumber(songNumber)
                .orElseThrow(() -> new RuntimeException("Song not found with number: " + songNumber));
    }

    public List<Song> getAllSongs() {
        return songRepository.findAll();
    }

    @Override
    public List<Song> fetchAllSongs() {
        return songRepository.findAll();
    }

    @Override
    public Song getSongById(Long id) {
        return songRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Song not found with id: " + id));
    }

}