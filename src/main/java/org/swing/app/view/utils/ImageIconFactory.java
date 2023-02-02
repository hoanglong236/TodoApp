package org.swing.app.view.utils;

import org.swing.app.utils.MessageLoader;

import javax.swing.ImageIcon;
import java.awt.Image;
import java.net.URL;

public class ImageIconFactory {

    public static ImageIcon createImageIcon(String iconLocation, int iconWidth, int iconHeight) {
        final MessageLoader messageLoader = MessageLoader.getInstance();
        if (iconLocation == null) {
            throw new IllegalArgumentException(messageLoader.getMessage("icon.location.invalid"));
        }

        final ClassLoader classLoader = ImageIconFactory.class.getClassLoader();
        final URL iconUrl = classLoader.getResource(iconLocation);
        if (iconUrl == null) {
            throw new IllegalArgumentException(messageLoader.getMessage("icon.location.not.found"));
        }

        final ImageIcon originalImageIcon = new ImageIcon(iconUrl);
        final Image originalImage = originalImageIcon.getImage();

        return new ImageIcon(originalImage.getScaledInstance(iconWidth, iconHeight, Image.SCALE_SMOOTH));
    }
}
