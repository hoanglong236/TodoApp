package org.swing.app.controller;

import org.swing.app.common.FeatureConstants;
import org.swing.app.utils.MessageLoader;
import org.swing.app.view.common.ComponentSizeConstants;
import org.swing.app.view.common.ViewConstants;
import org.swing.app.view.components.CustomFrame;
import org.swing.app.view.frames.menu.MenuFrame;

import javax.swing.WindowConstants;

public class MenuController {

    private CustomFrame menuFrame;

    public void startMenuFrame() {
        final MessageLoader messageLoader = MessageLoader.getInstance();

        this.menuFrame = new MenuFrame(this);
        this.menuFrame.setTitle(messageLoader.getMessage("menu.frame.title"));
        this.menuFrame.setBackground(ViewConstants.PRIMARY_BACKGROUND_COLOR);
        this.menuFrame.setPreferredSize(ComponentSizeConstants.MENU_FRAME_SIZE);
        this.menuFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.menuFrame.pack();
        this.menuFrame.setLocationRelativeTo(null);
        this.menuFrame.setVisible(true);
    }

    public void selectFeature(byte feature) {
        if (feature == FeatureConstants.FEATURE_TODO) {
            this.menuFrame.dispose();
            System.out.println("Selected \"Todo List\" feature");
            return;
        }
        if (feature == FeatureConstants.FEATURE_STATISTICS) {
            this.menuFrame.dispose();
            System.out.println("Selected \"Statistics\" feature");
            return;
        }
        throw new IllegalArgumentException();
    }
}
