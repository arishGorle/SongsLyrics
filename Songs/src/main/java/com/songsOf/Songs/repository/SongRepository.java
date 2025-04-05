package com.songsOf.Songs.repository;

import com.songsOf.Songs.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {
    Optional<Song> findBySongNumber(String songNumber);

    List<Song> findAllByOrderBySongNumberAsc();

    @Query("SELECT DISTINCT s.language FROM Song s WHERE s.language IS NOT NULL")
    List<String> findDistinctLanguages();


    @Query("SELECT s FROM Song s WHERE s.english IS NOT NULL AND s.english <> '' ORDER BY s.songNumber ASC")
    List<Song> findEnglishSongs();

    @Query("SELECT s FROM Song s WHERE s.hindi IS NOT NULL AND s.hindi <> '' ORDER BY s.songNumber ASC")
    List<Song> findHindiSongs();

    @Query("SELECT s FROM Song s WHERE s.oria IS NOT NULL AND s.oria <> '' ORDER BY s.songNumber ASC")
    List<Song> findOriaSongs();

    @Query("SELECT s FROM Song s WHERE s.telugu IS NOT NULL AND s.telugu <> '' ORDER BY s.songNumber ASC")
    List<Song> findTeluguSongs();
}
