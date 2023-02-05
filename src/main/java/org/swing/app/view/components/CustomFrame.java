package org.swing.app.view.components;

import org.swing.app.view.common.LayoutGapConstants;
import org.swing.app.view.common.ReserveSizeConstants;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;


public class CustomFrame extends JFrame implements WrapperComponent {

    private static final byte HORIZONTAL_GAP = LayoutGapConstants.EXTRA_LARGE_H_GAP;
    private static final byte VERTICAL_GAP = LayoutGapConstants.EXTRA_LARGE_V_GAP;
    private final LayoutManager flowLayout = new FlowLayout(FlowLayout.CENTER, HORIZONTAL_GAP, VERTICAL_GAP);

    private CustomPanel mainContentPanel;

    public CustomFrame() {
        super();
        setLayout(this.flowLayout);
    }

    public void setMainContent(CustomPanel mainContentPanel) {
        this.mainContentPanel = mainContentPanel;
        add(this.mainContentPanel);
    }

    @Override
    public void resizingComponents() {
        if (this.mainContentPanel == null) {
            return;
        }

        final int availableWidth = getPreferredSize().width - ReserveSizeConstants.FRAME_RESERVE_WIDTH;
        final int availableHeight = getPreferredSize().height - ReserveSizeConstants.FRAME_RESERVE_HEIGHT;

        final int mainContentPanelWidth = availableWidth - HORIZONTAL_GAP;
        final int mainContentPanelHeight = availableHeight - VERTICAL_GAP;

        this.mainContentPanel.resizeWrapperAndItsComponents(
                new Dimension(mainContentPanelWidth, mainContentPanelHeight));
    }

    @Override
    public void resizeWrapperAndItsComponents(Dimension wrapperSize) {
        setPreferredSize(wrapperSize);
        resizingComponents();
    }
}
