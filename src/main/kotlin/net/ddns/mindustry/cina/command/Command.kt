package net.ddns.mindustry.cina.command

import arc.util.CommandHandler

interface Command {
    val name: String
    val parameters: String
    val description: String

    fun load(handler: CommandHandler)
}