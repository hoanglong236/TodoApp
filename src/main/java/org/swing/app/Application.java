package org.swing.app;

import org.swing.app.controller.MenuController;

public class Application {

    public static void main(String[] args) {
        final MenuController menuController = new MenuController();
        menuController.startMenuFrame();
    }
}
