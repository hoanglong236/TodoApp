package org.swing.app.view.menu.components.feature;

import org.swing.app.view.common.ComponentSizeConstants;
import org.swing.app.view.common.LayoutGapConstants;
import org.swing.app.view.common.ReserveSizeConstants;
import org.swing.app.view.common.ViewConstants;
import org.swing.app.view.components.CustomPanel;
import org.swing.app.view.utils.ImageIconFactory;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class FeaturePanel extends CustomPanel {

    private static final byte HORIZONTAL_GAP = LayoutGapConstants.MEDIUM_H_GAP;
    private static final byte VERTICAL_GAP = LayoutGapConstants.MEDIUM_V_GAP;
    private final LayoutManager flowLayout = new FlowLayout(FlowLayout.CENTER, HORIZONTAL_GAP, VERTICAL_GAP);

    private static final Font LABEL_NAME_FONT = new Font(ViewConstants.PRIMARY_FONT_NAME, Font.BOLD,
            ViewConstants.MEDIUM_FONT_SIZE);

    private JLabel featureNameLabel;
    private JLabel featureIconLabel;

    public FeaturePanel(String featureName, String featureIconLocation) {
        super();
        setLayout(this.flowLayout);
        init(featureName, featureIconLocation);
    }

    private void initFeatureIconLabel(String featureIconLocation) {
        this.featureIconLabel = new JLabel();
        this.featureIconLabel.setIcon(ImageIconFactory.createImageIcon(featureIconLocation,
                ComponentSizeConstants.DOUBLE_EXTRA_LARGE_ICON_WIDTH, ComponentSizeConstants.DOUBLE_EXTRA_LARGE_ICON_HEIGHT));
        this.featureIconLabel.setHorizontalAlignment(SwingConstants.CENTER);
    }

    private void initFeatureNameLabel(String featureName) {
        this.featureNameLabel = new JLabel(featureName);
        this.featureNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        this.featureNameLabel.setFont(LABEL_NAME_FONT);
    }

    private void init(String featureName, String featureIconLocation) {
        initFeatureIconLabel(featureIconLocation);
        add(this.featureIconLabel);

        initFeatureNameLabel(featureName);
        add(this.featureNameLabel);
    }

    @Override
    protected Map<Component, Dimension> generateComponentSizeMap() {
        final Map<Component, Dimension> componentSizeMap = new HashMap<>();

        final int availableWidth = getPreferredSize().width - ReserveSizeConstants.MEDIUM_RESERVE_WIDTH;
        final int availableHeight = getPreferredSize().height - ReserveSizeConstants.MEDIUM_RESERVE_HEIGHT;

        final int maxComponentWidth = availableWidth - HORIZONTAL_GAP;

        final int featureIconLabelHeight = (int) ((float) 0.75 * availableHeight);
        componentSizeMap.put(this.featureIconLabel,
                new Dimension(maxComponentWidth, featureIconLabelHeight));

        final int featureNameLabelHeight = availableHeight - VERTICAL_GAP - featureIconLabelHeight - VERTICAL_GAP;
        componentSizeMap.put(this.featureNameLabel,
                new Dimension(maxComponentWidth, featureNameLabelHeight));

        return componentSizeMap;
    }
}
