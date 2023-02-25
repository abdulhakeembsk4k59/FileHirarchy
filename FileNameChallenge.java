import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class FileNameChallenge{
    public static void main(String[] args) throws FileNotFoundException {
        File fileName = new File("inputFile.txt");
        Scanner read = new Scanner(fileName);

        // String[] fileNames = {"File1", " File2", "  File3", "File4", "File5"};
        String[] fileNames = new String[5];
        for(int i = 0; i<fileNames.length; i++){
            fileNames[i] = read.nextLine();
        }

        strPass(fileNames);

        
    }

    public static void strPass(String [] fileNames){
        Map<String, String> fileMap = new HashMap<>();
        fileMap.put("File1", null);

        for (int i = 1; i < fileNames.length; i++) {
            String currFile = fileNames[i].trim();
            int numSpaces = fileNames[i].length() - currFile.length();

            if (numSpaces == 1) {
                fileMap.put(currFile, "File1");
            } else if (numSpaces > 1) {
                String parentFile = fileNames[i-1].trim();
                fileMap.put(currFile, parentFile);
            } else {
                fileMap.put(currFile, null);
            }
        }

        // Print the output
        System.out.printf("%-10s %-10s\n", "FileName", "ParentFile");
        System.out.println("========== ==========");
        for (String file : fileMap.keySet()) {
            System.out.printf("%-10s %-10s\n", file, fileMap.get(file));
        }
    }
}