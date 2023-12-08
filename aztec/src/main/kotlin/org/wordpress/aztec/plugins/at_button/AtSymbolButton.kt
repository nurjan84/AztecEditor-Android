package org.wordpress.aztec.plugins.at_button

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ToggleButton
import org.wordpress.aztec.AztecText
import org.wordpress.aztec.R
import org.wordpress.aztec.plugins.IToolbarButton
import org.wordpress.aztec.toolbar.AztecToolbar
import org.wordpress.aztec.toolbar.IToolbarAction
import org.wordpress.aztec.util.convertToButtonAccessibilityProperties

class AtSymbolButton(val visualEditor: AztecText): IToolbarButton {
    override val action: IToolbarAction = AtButtonAction.AT_SYMBOL
    override val context = visualEditor.context!!

    override fun toggle() {
        val start = visualEditor.selectionStart
        visualEditor.editableText.replace(start, visualEditor.selectionEnd, "@")
    }

    override fun inflateButton(parent: ViewGroup) {
        val rootView = LayoutInflater.from(context).inflate(R.layout.format_bar_button_at, parent)
        val button = rootView.findViewById<ToggleButton>(R.id.format_bar_button_at)
        button.convertToButtonAccessibilityProperties()
    }

    override fun toolbarStateAboutToChange(toolbar: AztecToolbar, enable: Boolean) {
        toolbar.findViewById<ToggleButton>(R.id.format_bar_button_at).isEnabled = enable
    }
}