package com.javiaguila.sunset;

import com.javiaguila.sunset.external.PiCamera;
import com.javiaguila.sunset.usecases.TakePicturesUsecase;
import com.javiaguila.sunset.usecases.adapters.CameraAdapter;

public class Main {

    public static void main(String[] args) {
        System.out.println("Starting");
        CameraAdapter piCameraAdapter = new PiCamera();
        TakePicturesUsecase takePicturesUsecase = new TakePicturesUsecase(piCameraAdapter);
        takePicturesUsecase.takePictures();
    }
}
