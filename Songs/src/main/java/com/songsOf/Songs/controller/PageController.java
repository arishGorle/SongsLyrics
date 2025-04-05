//package com.songsOf.Songs.controller;
//
//import com.songsOf.Songs.entity.Song;
//import com.songsOf.Songs.repository.SongRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@Controller
//public class PageController {
//
//    @Autowired
//    private SongRepository songRepository;
//
//    @GetMapping("/songs")
//    public String showSongsPage(Model model) {
//        return "songs"; // Just the HTML page
//    }
//    @GetMapping("/upload")
//    public String showUploadPage() {
//        return "upload"; // loads upload.html
//    }
//
//    @PostMapping("/uploadSong")
//    public String handleUpload(@RequestParam("id") String id,
//                               @RequestParam("songNumber") int songNumber,
//                               @RequestParam("songName") String songName,
//                               Model model) {
//
//        // For now, just show success or log it
//        System.out.println("Uploaded song - ID: " + id + ", No: " + songNumber + ", Name: " + songName);
//
//        model.addAttribute("message", "Song uploaded successfully!");
//        return "redirect:/songs"; // redirect to song list page
//    }
//
//}
//
