package org.swing.app.view.handlers.feature;

import org.swing.app.controller.MenuController;

public class SelectFeatureHandler {

    private final MenuController menuController;

    public SelectFeatureHandler(MenuController menuController) {
        this.menuController = menuController;
    }

    public void selectFeature(byte feature) {
        this.menuController.selectFeature(feature);
    }
}
