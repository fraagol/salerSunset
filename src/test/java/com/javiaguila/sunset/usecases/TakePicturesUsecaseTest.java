package com.javiaguila.sunset.usecases;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TakePicturesUsecaseTest {

TakePicturesUsecase takePicturesUsecase = new TakePicturesUsecase(new DummyCamera());
    @BeforeEach
    void setUp() {
    }

    @Test
    void takePictures() {
        takePicturesUsecase.takePictures();
    }
}