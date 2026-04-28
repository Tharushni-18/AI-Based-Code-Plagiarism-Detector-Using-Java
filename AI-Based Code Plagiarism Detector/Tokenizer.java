public static List<String> tokenize(String code) {

    // Java keywords
    String[] keywords = {
        "int","float","double","char","boolean",
        "if","else","for","while","return",
        "public","private","class","static","void",
        "new","System","out","println"
    };

    Set<String> keywordSet = new HashSet<>(Arrays.asList(keywords));

    // Separate symbols properly
    code = code.replaceAll("([{}();=+\\-*/.])", " $1 ");

    String[] words = code.split("\\s+");
    List<String> tokens = new ArrayList<>();

    for(String word : words) {
        if(keywordSet.contains(word)) {
            tokens.add(word);
        } 
        else if(word.matches("[0-9]+")) {
            tokens.add("NUM"); // normalize numbers
        }
        else if(word.matches("[a-zA-Z_][a-zA-Z0-9_]*")) {
            tokens.add("VAR");
        } 
        else if(!word.trim().isEmpty()) {
            tokens.add(word);
        }
    }

    return tokens;
}