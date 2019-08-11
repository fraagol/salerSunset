package com.javiaguila.sunset.usecases;

import com.javiaguila.sunset.domain.Picture;
import com.javiaguila.sunset.usecases.adapters.CameraAdapter;

public class DummyCamera implements CameraAdapter {
    @Override
    public Picture takePicture() {
        return null;
    }
}
