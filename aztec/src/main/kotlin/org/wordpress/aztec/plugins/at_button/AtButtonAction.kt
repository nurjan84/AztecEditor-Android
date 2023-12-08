package org.wordpress.aztec.plugins.at_button

import org.wordpress.aztec.AztecTextFormat
import org.wordpress.aztec.ITextFormat
import org.wordpress.aztec.R
import org.wordpress.aztec.toolbar.IToolbarAction
import org.wordpress.aztec.toolbar.ToolbarActionType

enum class AtButtonAction constructor(
        override val buttonId: Int,
        override val buttonDrawableRes: Int,
        override val actionType: ToolbarActionType,
        override val textFormats: Set<ITextFormat> = setOf()
) : IToolbarAction {

    AT_SYMBOL(
            R.id.format_bar_button_at,
            R.drawable.format_bar_button_at_selector,
            ToolbarActionType.OTHER,
            setOf(AztecTextFormat.FORMAT_NONE)
    )

}