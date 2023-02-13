package dev.wasteix.commandlib.entity.dialog

import dev.wasteix.commandlib.entity.sender.CommandSender

data class UserDialogStateEntity(
    var commandSender: CommandSender,
    var state: String,
    var value: Any?,
    val timeout: Long
)