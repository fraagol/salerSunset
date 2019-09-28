package com.javiaguila.sunset;

import com.javiaguila.sunset.external.PiCamera;
import com.javiaguila.sunset.usecases.TakePicturesUsecase;
import com.javiaguila.sunset.usecases.adapters.CameraAdapter;
import uk.co.caprica.picam.NativeLibraryException;

public class MainPi {

    public static void main(String[] args) throws Exception {
        System.out.println("Starting");
        CameraAdapter piCameraAdapter = new PiCamera();
        TakePicturesUsecase takePicturesUsecase = new TakePicturesUsecase(piCameraAdapter);
        takePicturesUsecase.takePictures();

        System.out.println("Closing2");
     //   System.exit(0);
    }
}
