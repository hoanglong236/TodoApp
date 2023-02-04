package org.swing.app.view.todo.components.todolist;

import org.swing.app.dto.CompletionRate;
import org.swing.app.dto.TodoListDto;
import org.swing.app.view.common.*;
import org.swing.app.view.components.CustomPanel;
import org.swing.app.view.utils.ImageIconFactory;

import javax.swing.JLabel;
import javax.swing.SpringLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.util.HashMap;
import java.util.Map;

public class TodoListPanel extends CustomPanel {

    private static final byte HORIZONTAL_GAP = LayoutGapConstants.SMALL_H_GAP;
    private static final byte VERTICAL_GAP = LayoutGapConstants.SMALL_V_GAP;
    private final LayoutManager springLayout = new SpringLayout();

    private JLabel activeLabel;
    private JLabel listNameLabel;
    private JLabel completionRateLabel;

    private TodoListDto todoListDto;

    public TodoListPanel(TodoListDto todoListDto) {
        super();
        this.todoListDto = todoListDto;

        setLayout(this.springLayout);
        init();
    }

    private void initActiveLabel() {
        this.activeLabel = new JLabel();
        this.activeLabel.setBackground(ViewConstants.ACTIVE_LABEL_BACKGROUD_COLOR);
    }

    private void initListNameLabel() {
        this.listNameLabel = new JLabel(this.todoListDto.getName());
    }

    private void initCompletionRateLabel() {
        final CompletionRate completionRate = this.todoListDto.getTaskCompletionRate();

        this.completionRateLabel = new JLabel(completionRate.toString());
        this.completionRateLabel.setIcon(ImageIconFactory.createImageIcon(IconLocationConstants.PLAN_ICON,
                ComponentSizeConstants.SMALL_ICON_WIDTH, ComponentSizeConstants.SMALL_ICON_HEIGHT));
    }

    private void initLayoutConstraint() {
        final SpringLayout springLayoutInstance = (SpringLayout) this.springLayout;

        springLayoutInstance.putConstraint(SpringLayout.WEST, this.activeLabel, HORIZONTAL_GAP,
                SpringLayout.WEST, this);
        springLayoutInstance.putConstraint(SpringLayout.SOUTH, this.activeLabel, VERTICAL_GAP,
                SpringLayout.SOUTH, this);

        springLayoutInstance.putConstraint(SpringLayout.WEST, this.listNameLabel, HORIZONTAL_GAP,
                SpringLayout.EAST, this.activeLabel);
        springLayoutInstance.putConstraint(SpringLayout.SOUTH, this.listNameLabel, VERTICAL_GAP,
                SpringLayout.SOUTH, this);

        springLayoutInstance.putConstraint(SpringLayout.WEST, this.completionRateLabel, HORIZONTAL_GAP,
                SpringLayout.EAST, this.activeLabel);
        springLayoutInstance.putConstraint(SpringLayout.SOUTH, this.completionRateLabel, VERTICAL_GAP,
                SpringLayout.SOUTH, this.listNameLabel);
    }

    private void init() {
        initActiveLabel();
        add(this.activeLabel);

        initListNameLabel();
        add(this.listNameLabel);

        initCompletionRateLabel();
        add(this.completionRateLabel);

        initLayoutConstraint();
    }

    @Override
    protected Map<Component, Dimension> generateComponentSizeMap() {
        final Map<Component, Dimension> componentSizeMap = new HashMap<>();

        final int availableWidth = getPreferredSize().width - ReserveSizeConstants.SMALL_RESERVE_WIDTH;
        final int availableHeight = getPreferredSize().height - ReserveSizeConstants.SMALL_RESERVE_HEIGHT;

        final int activeLabelWidth = 5;
        final int activeLabelHeight = availableHeight - VERTICAL_GAP;
        componentSizeMap.put(this.activeLabel, new Dimension(activeLabelWidth, activeLabelHeight));

        final int listNameLabelWidth = availableWidth - HORIZONTAL_GAP - activeLabelWidth - HORIZONTAL_GAP;
        final int listNameLabelHeight = (int) (0.6 * availableHeight);
        componentSizeMap.put(this.listNameLabel, new Dimension(listNameLabelWidth, listNameLabelHeight));

        final int completionRateLabelWidth = availableWidth / 2;
        final int completionRateLabelHeight = activeLabelHeight - VERTICAL_GAP - listNameLabelHeight - VERTICAL_GAP;
        componentSizeMap.put(this.completionRateLabel,
                new Dimension(completionRateLabelWidth, completionRateLabelHeight));

        return componentSizeMap;
    }

    private void updateComponents() {
        this.listNameLabel.setText(this.todoListDto.getName());

        final CompletionRate completionRate = this.todoListDto.getTaskCompletionRate();
        this.completionRateLabel.setText(completionRate.toString());
    }

    public void update(TodoListDto todoListDto) {
        this.todoListDto = todoListDto;
        updateComponents();
    }
}
