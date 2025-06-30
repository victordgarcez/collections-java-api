package Map;

import java.util.Comparator;
import java.util.Map;

public class ComparatorPorPreco implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> e1, Map.Entry<String, Livro> e2) {
        return Double.compare(e1.getValue().getPreco(), e2.getValue().getPreco());
    }
}