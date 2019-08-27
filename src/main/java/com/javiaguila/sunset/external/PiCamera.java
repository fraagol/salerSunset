package com.javiaguila.sunset.external;

import com.javiaguila.sunset.domain.Picture;
import com.javiaguila.sunset.usecases.adapters.CameraAdapter;
import uk.co.caprica.picam.*;
import uk.co.caprica.picam.enums.Encoding;

import java.io.File;

public class PiCamera implements CameraAdapter {

    private CameraConfiguration cameraConfiguration;

    private Camera camera;

    public PiCamera() throws Exception {
        uk.co.caprica.picam.PicamNativeLibrary.installTempLibrary();
        cameraConfiguration = CameraConfiguration.cameraConfiguration().encoding(Encoding.JPEG);
        camera = new Camera(cameraConfiguration);
    }
    @Override
    public Picture takePicture(String filename) throws Exception {

        PictureCaptureHandler<File> pictureCaptureHandler = new FilePictureCaptureHandler(filename);
       // File picture = camera.takePicture(pictureCaptureHandler, 500);
        return new Picture(null);
    }
}
