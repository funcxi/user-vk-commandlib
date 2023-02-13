package dev.wasteix.commandlib.entity

import dev.wasteix.commandlib.entity.content.CommandContentData

abstract class CommandContent() {
    lateinit var commandContentData: CommandContentData

    constructor(commandContent: CommandContentData) : this() {
        this.commandContentData = commandContent
    }
}