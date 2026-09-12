package l01xt;

class InvalidScoreException extends Exception {
    public InvalidScoreException(String message) {
        super(message);
    }
}
public class ExceptionDemo {
    public static void main(String[] args) {
        String[] inputs = {"85", "150", "abc"};
        for (String input : inputs) {
            try {
                int score = Integer.parseInt(input);
                validateScore(score);
                System.out.println("Accepted: " + score);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a whole number.");
            } catch (InvalidScoreException e) {
                System.out.println("Invalid score: " + e.getMessage());
            } finally {
                System.out.println("Attempt finished.");
            }
        }
    }
    static void validateScore(int score) throws InvalidScoreException {
        if (score < 0 || score > 100) {
            throw new InvalidScoreException("Score must be between 0 and 100.");
        }
    }
}