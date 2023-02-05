package org.swing.app.controller;

import org.swing.app.common.FeatureConstants;
import org.swing.app.utils.MessageLoader;
import org.swing.app.view.components.CustomFrame;
import org.swing.app.view.frames.menu.MenuFrame;

public class MenuController {

    private CustomFrame menuFrame;

    public void startMenuFrame() {
        final MessageLoader messageLoader = MessageLoader.getInstance();
        this.menuFrame = new MenuFrame(this);

        this.menuFrame.setTitle(messageLoader.getMessage("menu.frame.title"));
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
        throw new UnsupportedOperationException();
    }
}
