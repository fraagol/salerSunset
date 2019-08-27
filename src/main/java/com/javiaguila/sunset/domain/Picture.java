package com.javiaguila.sunset.domain;

import java.io.File;

public class Picture {
    private final File file;

    public Picture(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }
}
