package es.sfernandez.libraries.library4vaadin.routes

import com.vaadin.flow.component.Component
import com.vaadin.flow.component.Composite
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.router.HasUrlParameter
import com.vaadin.flow.router.RouteConfiguration
import com.vaadin.flow.router.RouteData
import com.vaadin.flow.router.RouterLink

/**
 * LayoutOfRegisteredRoutes shows all registered routes in current VaadinSession as [RouterLink]
 */
open class LayoutOfRegisteredRoutes : Composite<VerticalLayout>() {

    //---- Constructor ----
    init {
        addRouterLinksToLyt()
    }

    private fun addRouterLinksToLyt() {
        content.add(createRouterLinksOf(registeredRoutes()).toList())
    }

    //---- Methods ----
    private fun registeredRoutes() : Sequence<Class<out Component>> {
        return sequenceOf(*RouteConfiguration.forSessionScope().availableRoutes.toTypedArray())
            .map(RouteData::getNavigationTarget)
    }

    private fun createRouterLinksOf(registeredRoutes: Sequence<Class<out Component>>) : Sequence<RouterLink> {
        return registeredRoutes
            .filter(this::routeDoesNotNeedUrlParameters)
            .map { target -> RouterLink(target.simpleName, target) }
    }

    private fun routeDoesNotNeedUrlParameters(route: Class<out Component>) : Boolean {
        return !HasUrlParameter::class.java.isAssignableFrom(route)
    }

}