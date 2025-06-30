package Map;

import java.util.Comparator;
import java.util.Map;

public class ComparatorPorAutor implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> e1, Map.Entry<String, Livro> e2) {
        return e1.getValue().getAutor().compareToIgnoreCase(e2.getValue().getAutor());
    }
}
