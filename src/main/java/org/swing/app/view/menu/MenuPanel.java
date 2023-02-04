package org.swing.app.view.menu;

import org.swing.app.common.FeatureConstants;
import org.swing.app.utils.MessageLoader;
import org.swing.app.view.common.ComponentSizeConstants;
import org.swing.app.view.common.IconLocationConstants;
import org.swing.app.view.common.LayoutGapConstants;
import org.swing.app.view.common.ViewConstants;
import org.swing.app.view.components.CustomPanel;
import org.swing.app.view.handlers.feature.SelectFeatureHandler;
import org.swing.app.view.menu.components.feature.FeaturePanel;


import javax.swing.BorderFactory;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Map;

public class MenuPanel extends CustomPanel implements MouseListener {

    private static final byte HORIZONTAL_GAP = LayoutGapConstants.LARGE_H_GAP;
    private static final byte VERTICAL_GAP = LayoutGapConstants.LARGE_V_GAP;
    private final LayoutManager flowLayout = new FlowLayout(FlowLayout.LEFT, HORIZONTAL_GAP, VERTICAL_GAP);

    private CustomPanel todoFeaturePanel;
    private CustomPanel statisticsFeaturePanel;

    private final SelectFeatureHandler selectFeatureHandler;

    public MenuPanel(SelectFeatureHandler selectFeatureHandler) {
        super();
        this.selectFeatureHandler = selectFeatureHandler;

        setLayout(this.flowLayout);
        init();
    }

    private void initTodoFeaturePanel() {
        final MessageLoader messageLoader = MessageLoader.getInstance();
        this.todoFeaturePanel = new FeaturePanel(messageLoader.getMessage("todo.feature.label"),
                IconLocationConstants.TODO_LIST_ICON);

        this.todoFeaturePanel.setOpaque(true);
        this.todoFeaturePanel.setBackground(ViewConstants.FEATURE_PANEL_BACKGROUND_COLOR);
        this.todoFeaturePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        this.todoFeaturePanel.addMouseListener(this);
    }

    private void initStatisticsFeaturePanel() {
        final MessageLoader messageLoader = MessageLoader.getInstance();
        this.statisticsFeaturePanel = new FeaturePanel(messageLoader.getMessage("statistics.feature.label"),
                IconLocationConstants.STATISTICS_ICON);

        this.statisticsFeaturePanel.setOpaque(true);
        this.statisticsFeaturePanel.setBackground(ViewConstants.FEATURE_PANEL_BACKGROUND_COLOR);
        this.statisticsFeaturePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        this.statisticsFeaturePanel.addMouseListener(this);
    }

    private void init() {
        initTodoFeaturePanel();
        add(this.todoFeaturePanel);

        initStatisticsFeaturePanel();
        add(this.statisticsFeaturePanel);
    }

    @Override
    protected Map<Component, Dimension> generateComponentSizeMap() {
        final Map<Component, Dimension> componentSizeMap = new HashMap<>();

        final int featurePanelWidth = ComponentSizeConstants.DEFAULT_FEATURE_PANEL_WIDTH;
        final int featurePanelHeight = ComponentSizeConstants.DEFAULT_FEATURE_PANEL_HEIGHT;

        componentSizeMap.put(this.todoFeaturePanel, new Dimension(featurePanelWidth, featurePanelHeight));
        componentSizeMap.put(this.statisticsFeaturePanel,
                new Dimension(featurePanelWidth, featurePanelHeight));

        return componentSizeMap;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        final Object eventSource = e.getSource();

        if (eventSource == this.todoFeaturePanel) {
            this.selectFeatureHandler.selectFeature(FeatureConstants.FEATURE_TODO);
            return;
        }
        if (eventSource == this.statisticsFeaturePanel) {
            this.selectFeatureHandler.selectFeature(FeatureConstants.FEATURE_STATISTICS);
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        final Object eventSource = e.getSource();

        if (eventSource == this.todoFeaturePanel) {
            this.todoFeaturePanel.setBackground(ViewConstants.FEATURE_PANEL_HOVER_COLOR);
            return;
        }
        if (eventSource == this.statisticsFeaturePanel) {
            this.statisticsFeaturePanel.setBackground(ViewConstants.FEATURE_PANEL_HOVER_COLOR);
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        final Object eventSource = e.getSource();

        if (eventSource == this.todoFeaturePanel) {
            this.todoFeaturePanel.setBackground(ViewConstants.FEATURE_PANEL_BACKGROUND_COLOR);
            return;
        }
        if (eventSource == this.statisticsFeaturePanel) {
            this.statisticsFeaturePanel.setBackground(ViewConstants.FEATURE_PANEL_BACKGROUND_COLOR);
            return;
        }
        throw new UnsupportedOperationException();
    }
}
