package es.sfernandez.library4vaadin.components

import com.vaadin.flow.component.Component
import com.vaadin.flow.component.Composite
import com.vaadin.flow.component.HasText
import com.vaadin.flow.component.HasValue
import com.vaadin.flow.component.HasValue.ValueChangeEvent
import com.vaadin.flow.shared.Registration

sealed class BindableHasText<COMPONENT>
    : Composite<COMPONENT>, HasValue<ValueChangeEvent<String>, String>
    where COMPONENT : HasText,
          COMPONENT : Component
{

    //---- Constructor ----
    constructor() : this("")

    constructor(text: String) : super() {
        value = text
    }

    //---- Methods ----
    override fun setValue(value: String?) {
        content.text = value
    }

    override fun getValue(): String {
        return content.text
    }

    /**
     * This method doesn't make anything cause a [BindableHasText] can't be modified by client
     */
    override fun setReadOnly(readOnly: Boolean) {}

    /**
     * @return true. A [BindableHasText] is always a read only component
     */
    override fun isReadOnly(): Boolean {
        return true
    }

    /**
     * This method doesn't make anything cause a [BindableHasText] can't hold a required indicator.
     */
    override fun setRequiredIndicatorVisible(requiredIndicatorVisible: Boolean) {}

    /**
     * @return false. A [BindableHasText] can't have a required indicator
     */
    override fun isRequiredIndicatorVisible(): Boolean {
        return false
    }

    /**
     * @return empty [Registration]
     */
    override fun addValueChangeListener(listener: HasValue.ValueChangeListener<in ValueChangeEvent<String>>?): Registration {
        return Registration {}
    }
}