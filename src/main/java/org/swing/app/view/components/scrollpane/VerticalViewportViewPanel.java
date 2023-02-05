package org.swing.app.view.components.scrollpane;

import org.swing.app.view.common.LayoutGapConstants;
import org.swing.app.view.common.ReserveSizeConstants;

import javax.swing.JPanel;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

class VerticalViewportViewPanel extends JPanel {

    private static final byte HORIZONTAL_GAP = LayoutGapConstants.SMALL_H_GAP;
    private static final byte VERTICAL_GAP = LayoutGapConstants.SMALL_V_GAP;
    private final LayoutManager layoutManager = new FlowLayout(FlowLayout.LEFT, HORIZONTAL_GAP, VERTICAL_GAP);

    public VerticalViewportViewPanel() {
        super();
        setLayout(this.layoutManager);
        initContainerSize();
    }

    private void initContainerSize() {
        final Dimension initSize = new Dimension(0, ReserveSizeConstants.SMALL_RESERVE_HEIGHT);
        setPreferredSize(initSize);
    }

    public void addComponentAndExpandSize(Component component, int index) {
        add(component, index);

        final Dimension componentSize = component.getPreferredSize();
        final Dimension currentContainerSize = getPreferredSize();

        final int newContainerHeight = currentContainerSize.height + VERTICAL_GAP + componentSize.height;
        setPreferredSize(new Dimension(currentContainerSize.width, newContainerHeight));
    }

    public void removeComponentAndCollapseSize(Component component) {
        remove(component);

        final Dimension componentSize = component.getPreferredSize();
        final Dimension currentContainerSize = getPreferredSize();

        final int newContainerHeight = currentContainerSize.height - VERTICAL_GAP - componentSize.height;
        setPreferredSize(new Dimension(currentContainerSize.width, newContainerHeight));
    }

    public void resizeWidth(int width) {
        setPreferredSize(new Dimension(width, getPreferredSize().height));
    }

    public int getPreferComponentWidth() {
        final int availableWidth = getPreferredSize().width - ReserveSizeConstants.SMALL_RESERVE_WIDTH;
        final int maxComponentWidth = availableWidth - HORIZONTAL_GAP;

        return maxComponentWidth;
    }
}
