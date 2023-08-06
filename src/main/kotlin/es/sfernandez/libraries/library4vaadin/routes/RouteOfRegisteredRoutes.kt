package es.sfernandez.libraries.library4vaadin.routes

import com.vaadin.flow.component.Component
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.router.RouteConfiguration
import com.vaadin.flow.router.RouteData
import com.vaadin.flow.router.RouterLink

open class RouteOfRegisteredRoutes : VerticalLayout() {

    //---- Constructor ----
    init {
        add(createRouterLinksOf(registeredRoutes()).toList())
    }

    //---- Methods ----
    private fun registeredRoutes() : Sequence<Class<out Component>> {
        return sequenceOf(*RouteConfiguration.forSessionScope().availableRoutes.toTypedArray())
            .map(RouteData::getNavigationTarget)
    }

    private fun createRouterLinksOf(registeredRoutes: Sequence<Class<out Component>>) : Sequence<RouterLink> {
        return registeredRoutes.map { target -> RouterLink(target.simpleName, target) }
    }

}