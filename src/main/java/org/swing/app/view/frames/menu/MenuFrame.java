package org.swing.app.view.frames.menu;

import org.swing.app.controller.MenuController;
import org.swing.app.view.components.CustomFrame;
import org.swing.app.view.components.CustomPanel;
import org.swing.app.view.handlers.feature.SelectFeatureHandler;
import org.swing.app.view.menu.MenuPanel;

public class MenuFrame extends CustomFrame {

    private final MenuController menuController;

    public MenuFrame(MenuController menuController) {
        super();
        this.menuController = menuController;
        setMainContent(createMenuPanel());
    }

    private CustomPanel createMenuPanel() {
        final SelectFeatureHandler selectFeatureHandler = new SelectFeatureHandler(this.menuController);
        final CustomPanel menuPanel = new MenuPanel(selectFeatureHandler);
        return menuPanel;
    }
}
