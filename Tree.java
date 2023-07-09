import java.io.File;


public class Tree{
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Veuillez spécifier un chemin de répertoire.");
            return;
        }

        String directoryPath = args[0];
        File directory = new File(directoryPath);
        if (directory.exists() && directory.isDirectory()) {
            Tree tree = new Tree();
            DirectoryComposite root = new DirectoryComposite(directory.getName());
            tree.buildTree(directory, root);
            root.display(0);
        } else {
            System.out.println("Le répertoire n'existe pas.");
        }
    }
}