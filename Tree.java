import java.io.File;
import java.util.ArrayList;
import java.util.List;


// Interface commune pour les composants de l'arbre
interface ComposantSystFichiers {
    void display(int niveau);
}

// Classe représentant les fichiers
class FileComposite implements ComposantSystFichiers {
    private String name;


    public FileComposite(String name) {
        this.name = name;
    }

    public void display(int niveau) {
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < niveau; i++) {
            indent.append("|  ");
        }

        System.out.println(indent + "|-- " + name);
    }
}

// Classe représentant les répertoires
class DirectoryComposite implements ComposantSystFichiers {
    private String name;
    private List<ComposantSystFichiers> children = new ArrayList<>();

    public DirectoryComposite(String name) {
        this.name = name;
    }

    public void add(ComposantSystFichiers component) {
        children.add(component);
    }

    public void display(int niveau) {
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < niveau; i++) {
            indent.append("|  ");
        }

        System.out.println(indent + "|─── " + name);

        for (ComposantSystFichiers component : children) {
            component.display(niveau + 1);
        }
    }
}

public class Tree {

}

