package org.swing.app.view.frames.menu;

import org.swing.app.controller.MenuController;
import org.swing.app.view.common.ComponentSizeConstants;
import org.swing.app.view.common.ViewConstants;
import org.swing.app.view.components.CustomFrame;
import org.swing.app.view.components.CustomPanel;
import org.swing.app.view.handlers.feature.SelectFeatureHandler;
import org.swing.app.view.menu.MenuPanel;

import javax.swing.WindowConstants;

public class MenuFrame extends CustomFrame {

    private final MenuController menuController;

    public MenuFrame(MenuController menuController) {
        super();
        this.menuController = menuController;
        setMainContent(generateMainContent());

        setBackground(ViewConstants.PRIMARY_BACKGROUND_COLOR);
        resizeItselfAndItsComponents(ComponentSizeConstants.MENU_FRAME_SIZE);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }

    private CustomPanel generateMainContent() {
        final SelectFeatureHandler selectFeatureHandler = new SelectFeatureHandler(this.menuController);
        final CustomPanel menuPanel = new MenuPanel(selectFeatureHandler);
        return menuPanel;
    }
}
