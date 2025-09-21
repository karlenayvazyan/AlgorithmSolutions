package Algorithm.coding.task;

import java.util.*;


public class Nver {

    public static void main(String[] args) {
//        for (int i = 0; i < 10000; i++) {
            String result = secondImplementation(List.of("apple", "banana", "cabbage"));
            System.out.println(result);
//        }
    }

    // input ["apple", "banana", "cabbage"]
    // out string = "abage"
    // out string = "bage"
    // out string = "capple"
    // out string = "a"
    private static String result(List<String> input) {
        Random random = new Random();
        StringBuilder result = new StringBuilder();
        int lastIndex = -1;
        int index = 0;

        while (true) {
            int randomIndex = random.nextInt(input.size());

            String stringInRandomIndex = input.get(randomIndex);
            if (stringInRandomIndex.length() <= index) {
                return result.toString();
            }
            char randomChar = stringInRandomIndex.charAt(index);

            if (lastIndex == -1) {
                result.append(randomChar);
                lastIndex++;
            } else if (randomChar != result.charAt(lastIndex)) {
                result.append(randomChar);
                lastIndex++;
            }
            index++;
        }
        // return new ArrayList<>(result).get(random.nextInt(result.size()));
    }

    private static String secondImplementation(List<String> input) {
        Map<String, Integer> result = new HashMap<>();
        Set<Character> lastChars = new HashSet<>();
        int currentIndex = 1;
        while (true) {
            for (int i = 0; i < input.size(); i++) {
                String currentString = input.get(i);

                char previewChar = currentString.charAt(currentIndex - 1);
                if (result.containsKey(String.valueOf(previewChar))) {
                    Integer charIndex = result.get(String.valueOf(previewChar));
                    if (charIndex == -1) {
                        
                    }
                    char currentChar = currentString.charAt(currentIndex);
                } else {
                    result.put(String.valueOf(previewChar), currentIndex - 1);
                }

                // This is not optimal
                lastChars.add(currentString.charAt(currentString.length() - 1));
            }
            for (Character lastChar : lastChars) {
                if (result.containsKey(String.valueOf(lastChar))) {
                    result.put(String.valueOf(lastChar), -1);
                }
            }
            currentIndex++;
            System.out.println(result);
            System.out.println();
        }

//        Random random = new Random();
//        StringBuilder result = new StringBuilder();
//        int lastIndex = -1;
//        int index = 0;
//
//        while (true) {
//            int randomIndex = random.nextInt(input.size());
//
//            String stringInRandomIndex = input.get(randomIndex);
//            if (stringInRandomIndex.length() <= index) {
//                return result.toString();
//            }
//            char randomChar = stringInRandomIndex.charAt(index);
//
//            if (lastIndex == -1) {
//                result.append(randomChar);
//                lastIndex++;
//            } else if (randomChar != result.charAt(lastIndex)) {
//                result.append(randomChar);
//                lastIndex++;
//            }
//            index++;
//        }
        // return new ArrayList<>(result).get(random.nextInt(result.size()));
    }
}
