package com.example.mydesignsolidprinciples.structural.adapter

fun main() {
    val audioPlayer = AudioPlayer()

    audioPlayer.play("mp3", "song.mp3")
    audioPlayer.play("mp4", "video.mp4")
    audioPlayer.play("vlc", "movie.vlc")
    audioPlayer.play("avi", "film.avi")
}
