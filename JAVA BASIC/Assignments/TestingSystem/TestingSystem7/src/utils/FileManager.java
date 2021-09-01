package utils;

import java.io.File;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class FileManager{
    public static final String FILE_NOT_EXISTS = "Error! File not Exists.";
    public static final String FILE_EXISTS = "Error! File Exists.";
    public static final String CREATE_FILE_SUCCESS = "Create file success!";
    public static final String CREATE_FILE_FAIL = "Create file fail!";
    public static final String DELETE_FILE_SUCCESS = "Delete file success!";
    public static final String DELETE_FILE_FAIL = "Delete file fail!";
    public static final String PATH_IS_FILE = "Path is File";
    public static final String PATH_IS_FOLDER = "Path is Folder";
    public static final String PATH_NOT_FOLDER = "Error! Path is not Folder";
    public static final String SOURCE_FILE_NOT_EXISTS = "Error! Source file is not exists";
    public static final String DESTINATION_FILE_EXISTS = "Error! Destination file is exists";

    //Question 1:
    public static boolean isFileExists(String pathFile) {
        return new File(pathFile).exists();
    }

    //Question 2:
    public static void createNewFile(String pathFile) throws Exception {
        if (isFileExists(pathFile)) {
            throw new Exception(FILE_EXISTS);
        }
        boolean ressult = new File(pathFile).createNewFile();
        System.out.println(ressult? CREATE_FILE_SUCCESS: CREATE_FILE_FAIL);
    }

    public static void createNewFile(String path, String fileName) throws Exception {
        String pathFile = path + "//" + fileName;
        createNewFile(pathFile);
    }


    //Question 4:
    public static void deleteFile(String pathFile) throws Exception {
        if (!isFileExists(pathFile)) {
            throw new Exception(FILE_NOT_EXISTS);
        }
        boolean result = new File(pathFile).delete();
        System.out.println(result?DELETE_FILE_SUCCESS : DELETE_FILE_FAIL);
    }

    //Question 5:
    public static boolean isFolder(String path) {
        return new File(path).isDirectory();
    }


    //Question 6:
    public static List<String> getAllFileName(String path) throws Exception{
        File file = new File(path);
        if (!isFolder(path)) {
            throw new Exception(PATH_NOT_FOLDER);
        }
        return Arrays.asList(file.list());
    }

    //Question 7:
    public static void copyFile(String sourceFile, String destinationPath) throws Exception {
        if (!isFileExists(sourceFile)) {
            throw new Exception(SOURCE_FILE_NOT_EXISTS);
        }

        if (isFileExists(destinationPath)) {
            throw new Exception(DESTINATION_FILE_EXISTS);
        }

        File source = new File(sourceFile);
        File dest = new File(destinationPath);

        Files.copy(source.toPath(), dest.toPath());
    }

}
