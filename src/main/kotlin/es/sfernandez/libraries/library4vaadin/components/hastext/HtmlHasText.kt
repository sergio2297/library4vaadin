package es.sfernandez.libraries.library4vaadin.components.hastext

import com.vaadin.flow.component.HasText

/**
 * Makes a [HasText] work with HTML.
 */
interface HtmlHasText : HasText {

    override fun setText(text: String?) {
        element.setProperty("innerHTML", text)
    }

    override fun getText(): String {
        return element.getProperty("innerHTML")
    }

}