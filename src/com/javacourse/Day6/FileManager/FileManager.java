package com.javacourse.Day6.FileManager;


// public static int countFiles(String path)
// - принимает путь к папке, возвращает количество файлов в папке и всех подпапках по пути

import java.io.File;

// public static int countDirs(String path)
// - принимает путь к папке, возвращает количество папок в папке и всех подпапках по пути
public class FileManager {

    // recursion.
    // NO STATIC FIELDS IN A C
    // LASS!!!!!!!!
    public static int countFiles(String path) {
        File file = new File(path);

        return 0;
    }

    public static int countDirs(String path) {
        return 0;
    }
}