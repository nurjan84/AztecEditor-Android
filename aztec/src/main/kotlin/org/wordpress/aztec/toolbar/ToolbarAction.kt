package org.wordpress.aztec.toolbar

import org.wordpress.aztec.AztecTextFormat
import org.wordpress.aztec.ITextFormat
import org.wordpress.aztec.R
import java.util.ArrayList

/**
 * Describes what actions toolbar can perform and what buttons they are bound to
 */
enum class ToolbarAction constructor(
        override val buttonId: Int,
        override val buttonDrawableRes: Int,
        override val actionType: ToolbarActionType,
        override val textFormats: Set<ITextFormat> = setOf(),
        override val layout: Int? = null)
    : IToolbarAction, ToolbarItems.IToolbarItem {

    ADD_MEDIA_COLLAPSE(
            R.id.format_bar_button_media_collapsed,
            R.drawable.format_bar_button_media_expanded_selector,
            ToolbarActionType.OTHER,
            setOf(AztecTextFormat.FORMAT_NONE)),
    ADD_MEDIA_EXPAND(
            R.id.format_bar_button_media_expanded,
            R.drawable.format_bar_button_media_collapsed_selector,
            ToolbarActionType.OTHER,
            setOf(AztecTextFormat.FORMAT_NONE)),
    HEADING(R.id.format_bar_button_heading,
            R.drawable.format_bar_button_heading_selector,
            ToolbarActionType.LINE_BLOCK,
            setOf(AztecTextFormat.FORMAT_NONE),
            R.layout.format_bar_button_heading),
    LIST(
            R.id.format_bar_button_list,
            R.drawable.format_bar_button_ul_selector,
            ToolbarActionType.BLOCK_STYLE,
            setOf(AztecTextFormat.FORMAT_NONE),
            R.layout.format_bar_button_list),
    HIGHLIGHT(
            R.id.format_bar_button_highlight,
            R.drawable.format_bar_button_highlight_selector,
            ToolbarActionType.INLINE_STYLE,
            setOf(AztecTextFormat.FORMAT_HIGHLIGHT),
            R.layout.format_bar_button_highlight),
    UNORDERED_LIST(
            R.id.format_bar_button_list_unordered,
            R.drawable.format_bar_button_ul_selector,
            ToolbarActionType.BLOCK_STYLE,
            setOf(AztecTextFormat.FORMAT_UNORDERED_LIST),
            R.layout.format_bar_button_list_unordered),
    ORDERED_LIST(
            R.id.format_bar_button_list_ordered,
            R.drawable.format_bar_button_ol_selector,
            ToolbarActionType.BLOCK_STYLE,
            setOf(AztecTextFormat.FORMAT_ORDERED_LIST),
            R.layout.format_bar_button_list_ordered),
    TASK_LIST(
            R.id.format_bar_button_list_task,
            R.drawable.format_bar_button_tasklist_selector,
            ToolbarActionType.BLOCK_STYLE,
            setOf(AztecTextFormat.FORMAT_TASK_LIST),
            R.layout.format_bar_button_list_task),
    INDENT(
            R.id.format_bar_button_indent,
            R.drawable.format_bar_button_indent_selector,
            ToolbarActionType.OTHER,
            setOf(AztecTextFormat.FORMAT_NONE),
            R.layout.format_bar_button_indent),
    OUTDENT(
            R.id.format_bar_button_outdent,
            R.drawable.format_bar_button_outdent_selector,
            ToolbarActionType.OTHER,
            setOf(AztecTextFormat.FORMAT_NONE),
            R.layout.format_bar_button_outdent),
    BOLD(
            R.id.format_bar_button_bold,
            R.drawable.format_bar_button_bold_selector,
            ToolbarActionType.INLINE_STYLE,
            setOf(AztecTextFormat.FORMAT_STRONG, AztecTextFormat.FORMAT_BOLD),
            R.layout.format_bar_button_bold),
    ITALIC(
            R.id.format_bar_button_italic,
            R.drawable.format_bar_button_italic_selector,
            ToolbarActionType.INLINE_STYLE,
            setOf(AztecTextFormat.FORMAT_EMPHASIS, AztecTextFormat.FORMAT_ITALIC),
            R.layout.format_bar_button_italic),
    STRIKETHROUGH(
            R.id.format_bar_button_strikethrough,
            R.drawable.format_bar_button_strikethrough_selector,
            ToolbarActionType.INLINE_STYLE,
            setOf(AztecTextFormat.FORMAT_STRIKETHROUGH),
            R.layout.format_bar_button_strikethrough),
    ALIGN_LEFT(R.id.format_bar_button_align_left,
            R.drawable.format_bar_button_align_left_selector,
            ToolbarActionType.BLOCK_STYLE,
            setOf(AztecTextFormat.FORMAT_ALIGN_LEFT),
            R.layout.format_bar_button_align_left),
    ALIGN_CENTER(
            R.id.format_bar_button_align_center,
            R.drawable.format_bar_button_align_center_selector,
            ToolbarActionType.BLOCK_STYLE,
            setOf(AztecTextFormat.FORMAT_ALIGN_CENTER),
            R.layout.format_bar_button_align_center),
    ALIGN_RIGHT(
            R.id.format_bar_button_align_right,
            R.drawable.format_bar_button_align_right_selector,
            ToolbarActionType.BLOCK_STYLE,
            setOf(AztecTextFormat.FORMAT_ALIGN_RIGHT),
            R.layout.format_bar_button_align_right),
    UNDERLINE(
            R.id.format_bar_button_underline,
            R.drawable.format_bar_button_underline_selector,
            ToolbarActionType.INLINE_STYLE,
            setOf(AztecTextFormat.FORMAT_UNDERLINE),
            R.layout.format_bar_button_underline),
    QUOTE(
            R.id.format_bar_button_quote,
            R.drawable.format_bar_button_quote_selector,
            ToolbarActionType.BLOCK_STYLE,
            setOf(AztecTextFormat.FORMAT_QUOTE),
            R.layout.format_bar_button_quote),
    LINK(
            R.id.format_bar_button_link,
            R.drawable.format_bar_button_link_selector,
            ToolbarActionType.OTHER,
            setOf(AztecTextFormat.FORMAT_LINK),
            R.layout.format_bar_button_link),
    CODE(
            R.id.format_bar_button_code,
            R.drawable.format_bar_button_code_selector,
            ToolbarActionType.EXCLUSIVE_INLINE_STYLE,
            setOf(AztecTextFormat.FORMAT_CODE),
            R.layout.format_bar_button_code),
    PREFORMAT(
            R.id.format_bar_button_pre,
            R.drawable.format_bar_button_pre_selector,
            ToolbarActionType.BLOCK_STYLE,
            setOf(AztecTextFormat.FORMAT_PREFORMAT),
            R.layout.format_bar_button_pre),
    HORIZONTAL_RULE(
            R.id.format_bar_button_horizontal_rule,
            R.drawable.format_bar_button_horizontal_rule_selector,
            ToolbarActionType.LINE_BLOCK,
            setOf(AztecTextFormat.FORMAT_HORIZONTAL_RULE),
            R.layout.format_bar_button_horizontal_line),
    HTML(
            R.id.format_bar_button_html,
            R.drawable.format_bar_button_html_selector,
            ToolbarActionType.OTHER,
            setOf(AztecTextFormat.FORMAT_NONE),
            R.layout.format_bar_button_html),
    ELLIPSIS_COLLAPSE(
            R.id.format_bar_button_ellipsis_collapsed,
            R.drawable.format_bar_button_ellipsis_vertical_selector,
            ToolbarActionType.OTHER,
            setOf(AztecTextFormat.FORMAT_NONE)),
    ELLIPSIS_EXPAND(
            R.id.format_bar_button_ellipsis_expanded,
            R.drawable.format_bar_button_ellipsis_horizontal_selector,
            ToolbarActionType.OTHER,
            setOf(AztecTextFormat.FORMAT_NONE));

    companion object {
        fun getToolbarActionForStyle(style: ITextFormat): IToolbarAction? {
            ToolbarAction.values().forEach {
                if (it.textFormats.contains(style)) return it
            }
            return null
        }

        fun getToolbarActionsForStyles(styles: ArrayList<ITextFormat>): ArrayList<IToolbarAction> {
            val actions = ArrayList<IToolbarAction>()
            styles.forEach {
                val action = getToolbarActionForStyle(it)
                if (action != null) {
                    actions.add(action)
                }
            }
            return actions
        }
    }
}
