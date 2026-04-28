import java.util.*;

public class SimilarityCalculator {

    public static double jaccardSimilarity(List<String> t1, List<String> t2) {

        Set<String> set1 = new HashSet<>(t1);
        Set<String> set2 = new HashSet<>(t2);

        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);

        return (double) intersection.size() / union.size();
    }
}