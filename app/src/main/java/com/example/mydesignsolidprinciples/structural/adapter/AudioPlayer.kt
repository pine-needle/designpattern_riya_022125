package com.example.mydesignsolidprinciples.structural.adapter

// Client Class
class AudioPlayer : MediaPlayer {
    private var mediaAdapter: MediaAdapter? = null

    override fun play(audioType: String, fileName: String) {
        when (audioType) {
            "mp3" -> println("Playing mp3 file. Name: $fileName")
            "vlc", "mp4" -> {
                mediaAdapter = MediaAdapter(audioType)
                mediaAdapter?.play(audioType, fileName)
            }
            else -> println("Invalid media. $audioType format not supported")
        }
    }
}
