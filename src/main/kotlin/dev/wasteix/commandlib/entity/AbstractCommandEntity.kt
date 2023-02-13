package dev.wasteix.commandlib.entity

import dev.wasteix.commandlib.annotation.DefaultDialogState
import dev.wasteix.commandlib.annotation.DialogState
import dev.wasteix.commandlib.entity.content.CommandContentData
import dev.wasteix.commandlib.utility.execute
import java.lang.reflect.Method

abstract class AbstractCommandEntity(
    open val method: Method,
    open val commandContent: CommandContentData
) : CommandContent(commandContent) {
    fun execute(vararg parameters: Any) = method.execute(*(mutableListOf(*parameters, this).toTypedArray()))

    fun isDialogState() = method.isAnnotationPresent(DialogState::class.java)
            || method.isAnnotationPresent(DefaultDialogState::class.java)
}