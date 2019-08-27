package com.javiaguila.sunset.usecases;

import com.javiaguila.sunset.domain.Picture;
import com.javiaguila.sunset.usecases.adapters.CameraAdapter;

public class TakePicturesUsecase {

    private CameraAdapter cameraAdapter;

    public TakePicturesUsecase(CameraAdapter cameraAdapter) {
        this.cameraAdapter = cameraAdapter;
    }

    public void takePictures() throws Exception {

        for (int i = 0; i < 10; i++) {
            System.out.println("Calling adapter for picture "+i);
            Picture picture = cameraAdapter.takePicture("picture"+i+".jpg");
        }
    }
}
