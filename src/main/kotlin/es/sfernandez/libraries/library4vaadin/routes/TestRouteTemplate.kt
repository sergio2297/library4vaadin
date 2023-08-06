package es.sfernandez.libraries.library4vaadin.routes

import com.vaadin.flow.component.orderedlayout.VerticalLayout

/**
 * Template for routes used to testing components adhoc
 */
open class TestRouteTemplate(
    val content: TestRouteContent
) : VerticalLayout() {

    interface TestRouteContent {
        fun buildView(lyt: VerticalLayout)
        fun addListeners() {}
        fun start() {}
    }

    //---- Constructor ----
    init {
        setSizeFull()

        content.buildView(this)
        content.addListeners()
        content.start()
    }

    final override fun setSizeFull() {
        super.setSizeFull()
    }
}