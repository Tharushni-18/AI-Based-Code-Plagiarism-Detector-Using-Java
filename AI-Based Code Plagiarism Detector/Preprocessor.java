public class Preprocessor {

    public static String cleanCode(String code) {

        // Remove single-line comments
        code = code.replaceAll("//.*", "");

        // Remove multi-line comments
        code = code.replaceAll("/\\*.*?\\*/", "");

        // Remove extra spaces
        code = code.replaceAll("\\s+", " ");

        return code.trim();
    }
}