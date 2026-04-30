package net.ddns.mindustry.cina

open class EventType {
    companion object Cina : mindustry.game.EventType() {
        class Dispose : EventType()
        class Exit : EventType()
    }
}