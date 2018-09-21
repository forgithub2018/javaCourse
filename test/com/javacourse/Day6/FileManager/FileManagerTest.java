package com.javacourse.Day6.FileManager;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.Assert.*;

public class FileManagerTest {

    String rootFolder = "testFolders";

    @Before
    public void setUp() throws Exception {
        new File(rootFolder + "/folder1/folder11").mkdirs();
        new File(rootFolder + "/folder1/folder12").mkdirs();
        new File(rootFolder + "/folder2/folder21").mkdirs();
        new File(rootFolder + "/folder3/folder31").mkdirs();
        new File(rootFolder + "/folder3/folder32").mkdirs();
        new File(rootFolder + "/folder3/folder33").mkdirs();
    }


    @After
    public void tearDown() throws Exception {

        File allFiles = new File(rootFolder);
        allFiles.listFiles().length


        for (File f : allFiles.listFiles()) {
            if (f.isFile() || (f.isDirectory() && f.listFiles().length == 0)) {
                Files.deleteIfExists(f.toPath());
            }


        }
    }

    @Test
    public void countFiles() {
        int expectedCount = 1;
        int actualCount = 1;
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void countDirs() {
    }
}