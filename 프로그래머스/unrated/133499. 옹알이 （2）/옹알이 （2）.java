class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] pronunciations = {"aya", "ye", "woo", "ma"};

        for (String babble : babbling) {
            boolean valid = true;
            int lastPronunciationIndex = -1;

            while (babble.length() > 0 && valid) {
                boolean foundPronunciation = false;

                for (int i = 0; i < pronunciations.length; i++) {
                    if (babble.startsWith(pronunciations[i])) {
                        if (i == lastPronunciationIndex) {
                            valid = false;
                            break;
                        }
                        babble = babble.substring(pronunciations[i].length());
                        lastPronunciationIndex = i;
                        foundPronunciation = true;
                        break;
                    }
                }

                if (!foundPronunciation) {
                    valid = false;
                }
            }

            if (valid) {
                answer++;
            }
        }
        
        return answer;
    }
}