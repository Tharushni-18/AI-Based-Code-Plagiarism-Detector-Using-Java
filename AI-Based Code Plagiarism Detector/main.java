import java.util.*;

public class main {
    public static void main(String[] args) {

        String file1 = FileLoader.readFile("code1.java");
        String file2 = FileLoader.readFile("code2.java");

        String clean1 = Preprocessor.cleanCode(file1);
        String clean2 = Preprocessor.cleanCode(file2);

        List<String> tokens1 = Tokenizer.tokenize(clean1);
        List<String> tokens2 = Tokenizer.tokenize(clean2);

        double similarity = SimilarityCalculator.jaccardSimilarity(tokens1, tokens2);

        System.out.println("Similarity: " + (similarity * 100) + "%");

        ReportGenerator.generateReport(similarity);
    }
}