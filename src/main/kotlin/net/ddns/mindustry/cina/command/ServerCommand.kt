package net.ddns.mindustry.cina.command

import arc.util.CommandHandler

interface ServerCommand : Command {
    fun callback(args: Array<String>)

    override fun load(handler: CommandHandler) {
        handler.register(super.name, super.parameters, super.description, this::callback)
    }
}
