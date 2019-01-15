public class ServerNameGenerator {
    public static void main(String[] args) {
        String [] adjectives = {"cocky", "medicated", "strong", "weak", "intelligent", "woozy", "blonde", "dumb", "stupid", "phat"};
        String [] nouns = {"bird", "dog", "cat", "woman", "man", "illegal", "American", "foreigner", "instructor", "professor"};
        System.out.println("Here is your server name: ");
        System.out.println(randomElement(adjectives, nouns));
    }
        public static String randomElement (String [] array1, String [] array2){
            String name = nameSelect(array1) + " - " + nameSelect(array2);
            return name;
        }
        public static String nameSelect(String [] array){
        int max = array.length;
        int choice = (int)(Math.random() * max);
        return array[choice];
        }

}
