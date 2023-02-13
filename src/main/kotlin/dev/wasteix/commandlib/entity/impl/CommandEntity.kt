package dev.wasteix.commandlib.entity.impl

import dev.wasteix.commandlib.entity.AbstractCommandEntity
import dev.wasteix.commandlib.entity.content.CommandContentData
import java.lang.reflect.Method

data class CommandEntity(
    override val method: Method,
    override val commandContent: CommandContentData
) : AbstractCommandEntity(method, commandContent)