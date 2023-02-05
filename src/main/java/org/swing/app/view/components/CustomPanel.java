package org.swing.app.view.components;

import javax.swing.JPanel;
import java.awt.Component;
import java.awt.Dimension;
import java.util.Map;

public abstract class CustomPanel extends JPanel implements WrapperComponent {

    protected abstract Map<Component, Dimension> generateComponentSizeMap();

    @Override
    public void resizingComponents() {
        final Map<Component, Dimension> componentSizeMap = generateComponentSizeMap();

        for (final Component component : getComponents()) {
            final Dimension componentSize = componentSizeMap.get(component);

            if (component instanceof WrapperComponent) {
                ((WrapperComponent) component).resizeItselfAndItsComponents(componentSize);
            } else {
                component.setPreferredSize(componentSizeMap.get(component));
            }
        }
    }

    @Override
    public void resizeItselfAndItsComponents(Dimension wrapperSize) {
        setPreferredSize(wrapperSize);
        resizingComponents();
    }
}
