package com.github.kieran1494.autohotkey

import com.intellij.lang.Language

class AutoHotkeyLanguage private constructor() : Language("AutoHotkey") {
    companion object {
        val INSTANCE = AutoHotkeyLanguage()
    }
}