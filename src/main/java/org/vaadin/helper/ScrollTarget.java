package org.vaadin.helper;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;

/**
 * Wrapper for &lt;scroll-target&gt; web component.
 */
@Tag("scroll-target")
@HtmlImport("bower_components/scroll-target/scroll-target.html")
public class ScrollTarget extends Component implements HasComponents, HasElement {

    /**
     * Constructs a new ScrollTarget
     *
     * @param components components to wrap
     */
    public ScrollTarget(Component... components) {
        add(components);
    }

    /**
     * Constructs a new ScrollTarget
     *
     * @param topOffset space that should be reserved for fixed top menu when scrolling
     * @param components components to wrap
     *
     * @see ScrollTarget#setTopOffset(int)
     */
    public ScrollTarget(int topOffset, Component... components) {
        this(components);
        getElement().setAttribute("top-offset", Integer.toString(topOffset));
    }

    /**
     * Set top offset for scrolling
     *
     * @param offset space that should be reserved for fixed top menu when scrolling
     *
     * @see ScrollTarget#ScrollTarget(int, Component...)
     */
    public void setTopOffset(int offset) {
        getElement().callFunction("setTopOffset", offset);
    }

    /**
     * Ensure content visibility by scrolling.
     *
     * @see ScrollTarget#ensureVisibility(int)
     */
    public void ensureVisibility() {
        getElement().callFunction("ensureVisibility");
    }

    /**
     * Ensure content visibility by delayed scrolling.
     *
     * @param delay scrolling delay in milliseconds
     *
     * @see ScrollTarget#ensureVisibility()
     */
    public void ensureVisibility(int delay) {
        getElement().callFunction("ensureVisibility", delay);
    }
}
