package com.github.kieran1494.autohotkey

import com.intellij.openapi.fileTypes.LanguageFileType

import javax.swing.*

class AutoHotkeyFileType private constructor() : LanguageFileType(AutoHotkeyLanguage.INSTANCE) {

    override fun getName(): String {
        return "AutoHotkey"
    }

    override fun getDescription(): String {
        return "Framework for autohotkey file"
    }

    override fun getDefaultExtension(): String {
        return "ahk"
    }

    override fun getIcon(): Icon {
        return AutoHotkeyIcon.FILE
    }

    companion object {
        val INSTANCE = AutoHotkeyFileType()
    }
}