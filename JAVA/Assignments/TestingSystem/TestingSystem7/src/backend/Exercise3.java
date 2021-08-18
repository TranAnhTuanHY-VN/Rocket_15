package backend;

import utils.FileManager;

import java.util.List;

public class Exercise3 {
    private final FileManager fileManager = new FileManager();
    public void Q1() {
        String pathFile = "C:\\Users\\ADMIN\\Desktop\\Rocket_15\\JAVA\\Assignments\\TestingSystem\\TestingSystem7\\src\\file\\text.txt";
        if (fileManager.isFileExists(pathFile)) {
            System.out.println("File tồn tại.");
        }else System.out.println("File không tồn tại");
    }

    public void Q2() throws Exception {
        String path = "C:\\Users\\ADMIN\\Desktop\\Rocket_15\\JAVA\\Assignments\\TestingSystem\\TestingSystem7\\src\\file\\testQ2.txt";
        fileManager.createNewFile(path);
        String path2 = "C:\\Users\\ADMIN\\Desktop\\Rocket_15\\JAVA\\Assignments\\TestingSystem\\TestingSystem7\\src\\file";
        fileManager.createNewFile(path2,"tester.txt");
    }

    public void Q4() throws Exception {
        String pathFile = "C:\\Users\\ADMIN\\Desktop\\Rocket_15\\JAVA\\Assignments\\TestingSystem\\TestingSystem7\\src\\file\\huhu.txt";
        fileManager.deleteFile(pathFile);
    }

    public void Q5() {
        String path = "C:\\Users\\ADMIN\\Desktop\\Rocket_15\\JAVA\\Assignments\\TestingSystem\\TestingSystem7\\src\\file";
        System.out.println(fileManager.isFolder(path)?FileManager.PATH_IS_FOLDER: FileManager.PATH_IS_FILE);
    }

    public void Q6() throws Exception{
        List<String> listFileName;
        String path = "C:\\Users\\ADMIN\\Desktop\\Tư tưởng HCM";
        listFileName = fileManager.getAllFileName(path);
//        System.out.println(listFileName);
        for (String fileName : listFileName) {
            System.out.println(fileName);
        }
    }

    public void Q7() throws Exception {
        String source = "C:\\Users\\ADMIN\\Desktop\\Rocket_15\\JAVA\\Assignments\\TestingSystem\\TestingSystem7\\src\\hehe.txt";
        String destination = "C:\\Users\\ADMIN\\Desktop\\Rocket_15\\JAVA\\Assignments\\TestingSystem\\TestingSystem7\\src\\file\\abc.txt";
        fileManager.copyFile(source, destination);
    }
}
