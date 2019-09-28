package com.javiaguila.sunset.usecases.adapters;

import com.javiaguila.sunset.domain.Picture;

public interface CameraAdapter {
    Picture takePicture(String filename) throws  Exception;
}
