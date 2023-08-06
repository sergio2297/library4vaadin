package es.sfernandez.libraries.library4vaadin.components.composite

import com.vaadin.flow.component.Component
import com.vaadin.flow.component.Composite
import com.vaadin.flow.component.HasSize
import com.vaadin.flow.component.Unit
import java.util.*

/**
 * HasSizeComposite is a [Composite] that implements [HasSize]
 *
 * It needs a [HasSize] component to work
 */
open class HasSizeComposite<HAS_SIZE> : Composite<HAS_SIZE>(), HasSize
    where HAS_SIZE : HasSize,
          HAS_SIZE : Component 
{

    override fun setWidth(width: String?) {
        content.width = width
    }

    override fun setWidth(width: Float, unit: Unit?) {
        content.setWidth(width, unit)
    }

    override fun setMinWidth(minWidth: String?) {
        content.minWidth = minWidth
    }

    override fun setMinWidth(minWidth: Float, unit: Unit?) {
        content.setMinWidth(minWidth, unit)
    }

    override fun setMaxWidth(maxWidth: String?) {
        content.maxWidth = maxWidth
    }

    override fun setMaxWidth(maxWidth: Float, unit: Unit?) {
        content.setMaxWidth(maxWidth, unit)
    }

    override fun getWidth(): String {
        return content.width
    }

    override fun getMinWidth(): String {
        return content.minWidth
    }

    override fun getMaxWidth(): String {
        return content.maxWidth
    }

    override fun getWidthUnit(): Optional<Unit> {
        return content.widthUnit
    }

    override fun setHeight(height: String?) {
        content.height = height
    }

    override fun setHeight(height: Float, unit: Unit?) {
        content.setHeight(height, unit)
    }

    override fun setMinHeight(minHeight: String?) {
        content.minHeight = minHeight
    }

    override fun setMinHeight(minHeight: Float, unit: Unit?) {
        content.setMinHeight(minHeight, unit)
    }

    override fun setMaxHeight(maxHeight: String?) {
        content.maxHeight = maxHeight
    }

    override fun setMaxHeight(maxHeight: Float, unit: Unit?) {
        content.setMaxHeight(maxHeight, unit)
    }

    override fun getHeight(): String {
        return content.height
    }

    override fun getMinHeight(): String {
        return content.minHeight
    }

    override fun getMaxHeight(): String {
        return content.maxHeight
    }

    override fun getHeightUnit(): Optional<Unit> {
        return content.heightUnit
    }

    override fun setSizeFull() {
        content.setSizeFull()
    }

    override fun setWidthFull() {
        content.setWidthFull()
    }

    override fun setHeightFull() {
        content.setHeightFull()
    }

    override fun setSizeUndefined() {
        content.setSizeUndefined()
    }
}