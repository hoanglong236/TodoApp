package org.swing.app.view.components;

import java.awt.Dimension;

public interface WrapperComponent {

    void resizingComponents();

    void resizeItselfAndItsComponents(Dimension wrapperSize);
}
