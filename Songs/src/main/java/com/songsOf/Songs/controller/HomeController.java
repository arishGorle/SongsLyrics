package com.songsOf.Songs.controller;



import com.songsOf.Songs.entity.Song;

import com.songsOf.Songs.repository.SongRepository;
import com.songsOf.Songs.service.ISongsService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@Controller  // ✅ Correct annotation for MVC
@RequestMapping("/lyrics")
public class HomeController {

    private final ISongsService iSongsService;

    private final SongRepository songRepository;

    public HomeController(ISongsService iSongsService, SongRepository songRepository) {
        this.iSongsService = iSongsService;
        this.songRepository = songRepository;
    }

    @GetMapping("/")
    public String showRootPage() {
        return "home"; // or "index" if your file is index.html
    }

    @GetMapping("/songs")
    public String showSongsPage(Model model) {
        model.addAttribute("songs", iSongsService.getAllSongs());
        return "songs"; // will render songs.html from templates folder
    }

    @GetMapping("/{songNumber}")
    public String getSongByNumber(@PathVariable Long songNumber, Model model) {
        Song song = songRepository.findById(songNumber)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Song not found"));

        model.addAttribute("song", song);
        return "song-details"; // Thymeleaf HTML file for the detailed lyrics
    }


    @GetMapping("/home")
    public String displayHomepage() {
        return "home"; // maps to src/main/resources/templates/home.html
    }

    @GetMapping("/about")
    public String showAboutPage() {
        return "about"; // maps to about.html
    }

    @GetMapping("/history")
    public String showHistoryPage() {
        return "history"; // maps to history.html
    }

    @GetMapping("/upload")
    public String showUploadPage() {
        return "upload"; // loads upload.html
    }

    @GetMapping("/song-details")
    public String songDetailPage() {
        return "song-details"; // loads upload.html
    }

    /*
    Languages
     */
    @GetMapping("/songs/explore")
    public String exploreSongs() {
        return "explore";
    }

    @GetMapping("/explore")
    public String explorePage() {
        return "explore"; // looks for explore.html in templates
    }

    //    @GetMapping("/english-songs")
//    public String englishSongsPage() {
//        return "english-songs"; // maps to templates/english-songs.html
//    }
//    @GetMapping("/english-songs")
//    public String listSongs(Model model) {
//        List<Song> songs = songRepository.findAllByOrderBySongNumberAsc();
//        model.addAttribute("songs", songs);
//        return "english-songs"; // Thymeleaf template
//    }
    @GetMapping("/songs/{songNumber}")
    public String getSongDetails(@PathVariable String songNumber, Model model) {
        Song song = songRepository.findBySongNumber(songNumber)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Song not found with number: " + songNumber));
        model.addAttribute("song", song);
        return "song-details";
    }


//    @GetMapping("/hindi-songs")
//    public String hindiSongsPage() {
//        return "hindi-songs";
//    }
//
//    @GetMapping("/hindi-songs")
//    public String listHindiSongs(Model model) {
//        List<Song> songs = songRepository.findByHindiIgnoreCaseOrderBySongNumberAsc();
//        model.addAttribute("songs", songs);
//        return "hindi-songs"; // Thymeleaf template
//    }

//    @GetMapping("/oria-songs")
//    public String oriaSongsPage() {
//        return "oria-songs";
//    }
//
//    @GetMapping("/telugu-songs")
//    public String teluguSongsPage() {
//        return "telugu-songs";
//    }


    @GetMapping("/english-songs")
    public String listEnglishSongs(Model model) {
        model.addAttribute("songs", songRepository.findEnglishSongs());
        return "english-songs"; // maps to templates/english-songs.html
    }

    @GetMapping("/hindi-songs")
    public String listHindiSongs(Model model) {
        model.addAttribute("songs", songRepository.findHindiSongs());
        return "hindi-songs"; // maps to templates/hindi-songs.html
    }

    @GetMapping("/oria-songs")
    public String listOriaSongs(Model model) {
        model.addAttribute("songs", songRepository.findOriaSongs());
        return "oria-songs"; // maps to templates/oria-songs.html
    }

    @GetMapping("/telugu-songs")
    public String listTeluguSongs(Model model) {
        model.addAttribute("songs", songRepository.findTeluguSongs());
        return "telugu-songs"; // maps to templates/telugu-songs.html
    }

}
