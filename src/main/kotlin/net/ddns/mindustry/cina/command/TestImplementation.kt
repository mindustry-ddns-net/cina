package net.ddns.mindustry.cina.command

import arc.util.Log

class TestImplementation(
    override val name: String = "lorem",
    override val parameters: String,
    override val description: String = "ipsum"
) : ServerCommand {

    override fun callback(args: Array<String>) {
        Log.info("ipsum!")
    }
}