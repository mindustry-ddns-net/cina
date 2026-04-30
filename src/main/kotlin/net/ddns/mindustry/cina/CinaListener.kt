package net.ddns.mindustry.cina

import arc.ApplicationListener
import arc.Events

// TODO: add full spectrum of arc hooks
@Suppress("Unused") // not meant to be used directly.
class CinaListener : ApplicationListener {
    override fun dispose() {
        Events.fire(EventType.Cina.Dispose::class)
    }

    override fun exit() {
        Events.fire(EventType.Cina.Exit::class)
    }
}