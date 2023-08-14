package es.sfernandez.libraries.library4vaadin.components.progressbar

import com.vaadin.flow.component.HasValue
import com.vaadin.flow.component.progressbar.ProgressBar
import com.vaadin.flow.shared.Registration

class BindableProgressBar : ProgressBar(), HasValue<HasValue.ValueChangeEvent<Number>, Number> {

    override fun setValue(value: Number?) {
        super.setValue(value?.toDouble() ?: 0.0)
    }

    override fun addValueChangeListener(listener: HasValue.ValueChangeListener<in HasValue.ValueChangeEvent<Number>>?): Registration {
        return Registration {}
    }

    override fun setReadOnly(readOnly: Boolean) {}

    override fun isReadOnly(): Boolean {
        return true
    }

    override fun setRequiredIndicatorVisible(requiredIndicatorVisible: Boolean) {}

    override fun isRequiredIndicatorVisible(): Boolean {
        return false
    }

}