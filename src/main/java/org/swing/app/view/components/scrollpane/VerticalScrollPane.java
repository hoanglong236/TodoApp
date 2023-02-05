package org.swing.app.view.components.scrollpane;

import org.swing.app.view.common.ComponentSizeConstants;
import org.swing.app.view.common.ReserveSizeConstants;
import org.swing.app.view.components.CustomWrapperComponent;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.Component;
import java.awt.Dimension;

public class VerticalScrollPane extends JScrollPane implements CustomWrapperComponent {

    private VerticalViewportViewPanel viewportViewPanel;

    public VerticalScrollPane() {
        super();
        init();
    }

    private void customVerticalScrollBar() {
        final JScrollBar verticalScrollBar = getVerticalScrollBar();
        final int scrollBarHeight = verticalScrollBar.getPreferredSize().height;

        verticalScrollBar.setPreferredSize(new Dimension(ComponentSizeConstants.VERTICAL_SCROLL_BAR_WIDTH,
                scrollBarHeight));
    }

    private void initViewportViewPanel() {
        this.viewportViewPanel = new VerticalViewportViewPanel();
    }

    private void init() {
        setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        customVerticalScrollBar();

        initViewportViewPanel();
        setViewportView(this.viewportViewPanel);
    }

    @Override
    public void resizingComponents() {
        final int viewportViewPanelWidth = getPreferredSize().width - ComponentSizeConstants.VERTICAL_SCROLL_BAR_WIDTH
                - ReserveSizeConstants.SMALL_RESERVE_WIDTH;
        this.viewportViewPanel.resizeWidth(viewportViewPanelWidth);
    }

    @Override
    public void resizeItselfAndItsComponents(Dimension dimension) {
        setPreferredSize(dimension);
        resizingComponents();
    }

    public void addToViewport(Component component) {
        final byte lastedComponentIndex = -1;
        addToViewport(component, lastedComponentIndex);
    }

    public void addToViewport(Component component, int index) {
        this.viewportViewPanel.addComponentAndExpandSize(component, index);
    }

    public void removeFromViewport(Component component) {
        this.viewportViewPanel.removeComponentAndCollapseSize(component);
    }

    public int getPreferComponentWidthInViewport() {
        return this.viewportViewPanel.getPreferComponentWidth();
    }
}
