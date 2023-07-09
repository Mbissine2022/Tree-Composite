import java.io.File;

public class Tree {
    private void buildTree(File directory, DirectoryComposite parent) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    DirectoryComposite subDirectory = new DirectoryComposite(file.getName());
                    parent.add(subDirectory);
                    buildTree(file, subDirectory);
                } else {
                    FileComposite FileComposite = new FileComposite(file.getName());
                    parent.add(FileComposite);
                }
            }
        }
    }
}
