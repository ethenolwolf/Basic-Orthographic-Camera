package com.gfs.camerabase.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.gfs.camerabase.CameraBase;

public class DesktopLauncher {
    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "camera";
//		cfg.useGL20 = false;
        config.width = 1280;
        config.height = 720;
        new LwjglApplication(new CameraBase(), config);
    }
}
