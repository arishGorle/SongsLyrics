package com.songsOf.Songs.service;

import com.songsOf.Songs.dto.SongsDto;
import com.songsOf.Songs.entity.Song;


import java.util.List;

public interface ISongsService {


      Song addSong(SongsDto songsDto);


      Song fetchSong(String songNumber);

     List<Song> getAllSongs( );


      List<Song> fetchAllSongs(); // Add this method


    Song getSongById(Long id);

}
