package net.ddns.mindustry.cina.command

import arc.util.CommandHandler
import mindustry.gen.Player

interface ClientCommand : Command {
    fun callback(args: Array<String>, player: Player)

    override fun load(handler: CommandHandler) {
        handler.register(super.name, super.parameters, super.description, this::callback)
    }
}
