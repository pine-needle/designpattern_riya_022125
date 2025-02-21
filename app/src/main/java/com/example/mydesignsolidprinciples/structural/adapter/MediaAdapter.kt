package com.example.mydesignsolidprinciples.structural.adapter

// Adapter Class
class MediaAdapter(audioType: String) : MediaPlayer {
    private var vlcPlayer: VlcPlayer? = null
    private var mp4Player: Mp4Player? = null

    init {
        when (audioType) {
            "vlc" -> vlcPlayer = VlcPlayer()
            "mp4" -> mp4Player = Mp4Player()
        }
    }

    override fun play(audioType: String, fileName: String) {
        when (audioType) {
            "vlc" -> vlcPlayer?.playVlc(fileName)
            "mp4" -> mp4Player?.playMp4(fileName)
        }
    }
}
