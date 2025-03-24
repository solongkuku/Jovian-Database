import java.io.FileReader;
import java.io.*;
public class Main{

    public static void main(String[] args) {
//        try {
//            FileReader fr = new FileReader("a.cppp");
//        }
//    catch(Exception e) {
//            System.out.println(e);
//    }




        File file1 = new File("File 1", "hi this is the first file");
        File file2 = new File("File 2", "second file data here");
        File file3 = new File("File 3", "3rd file data here");
        File file4 = new File("File 4", "4th file data is here");
        File file5 = new File("File 5", "last file data");

        Dirc dir1 = new Dirc("Directory 1", new File[]{file1, file2, file3});
        Dirc dir2 = new Dirc("Directory 2", new File[]{file4, file5});

        FileSystem fileSystem = new FileSystem("FileSystem1", new Dirc[]{dir1, dir2});


        System.out.println(dir1.getFiles()[2].getData());


        fileSystem.printStructure();
    }
}

class FileSystem {
    private String name;
    private Dirc[] directories;

    public FileSystem(String name, Dirc[] directories) {
        this.name = name;
        this.directories = directories;
    }

    public Dirc[] getDirectories() {
        return directories;
    }

    public void printStructure() {
        System.out.println("Filesystem: " + name);
        for (Dirc dir : directories) {
            System.out.println("  - " + dir.getName());
            for (File file : dir.getFiles()) {
                System.out.println("    - " + file.getName());
            }
        }
    }
}

class Dirc {
    private String name;
    private File[] files;

    public Dirc(String name, File[] files) {
        this.name = name;
        this.files = files;
    }

    public File[] getFiles() {
        return files;
    }

    public String getName() {
        return name;
    }
}

class File {
    private String name;
    private String data;

    public File(String name, String data) {
        this.name = name;
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public String getName() {
        return name;
    }
}




