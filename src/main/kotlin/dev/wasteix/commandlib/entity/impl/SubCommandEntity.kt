package dev.wasteix.commandlib.entity.impl

import dev.wasteix.commandlib.entity.AbstractCommandEntity
import dev.wasteix.commandlib.entity.content.CommandContentData
import java.lang.reflect.Method

data class SubCommandEntity(
    override val method: Method,
    val commandNames: Array<out String>,
    override val commandContent: CommandContentData
) : AbstractCommandEntity(method, commandContent)