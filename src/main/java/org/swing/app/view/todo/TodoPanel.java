package org.swing.app.view.todo;

import org.swing.app.view.common.LayoutGapConstants;
import org.swing.app.view.components.CustomPanel;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.util.Map;

public class TodoPanel extends CustomPanel {

    private static final byte HORIZONTAL_GAP = LayoutGapConstants.LARGE_H_GAP;
    private static final byte VERTICAL_GAP = LayoutGapConstants.LARGE_V_GAP;
    private final LayoutManager flowLayout = new FlowLayout(FlowLayout.LEFT, HORIZONTAL_GAP, VERTICAL_GAP);

    @Override
    protected Map<Component, Dimension> generateComponentSizeMap() {
        return null;
    }
}
