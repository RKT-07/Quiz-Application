import java.util.Scanner;
public class QuizApplication {

    static class Question {
        String questionText;
        String[] options;
        int correctAnswer; // The index of the correct answer in the options array

        Question(String questionText, String[] options, int correctAnswer) {
            this.questionText = questionText;
            this.options = options;
            this.correctAnswer = correctAnswer;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array of questions
        Question[] questions = {
                new Question("What is the capital of France?", new String[]{"Berlin", "Madrid", "Paris", "Rome"}, 2),
                new Question("What is 2 + 2?", new String[]{"3", "4", "5", "6"}, 1),
                new Question("What is the color of the sky?", new String[]{"Blue", "Green", "Red", "Yellow"}, 0)
        };

        int score = 0;

        // Loop through each question
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i].questionText);

            // Display options
            for (int j = 0; j < questions[i].options.length; j++) {
                System.out.println((j + 1) + ". " + questions[i].options[j]);
            }

            // Get user's answer
            System.out.print("Your answer (1-4): ");
            int answer = scanner.nextInt() - 1;

            // Check if answer is correct
            if (answer == questions[i].correctAnswer) {
                score++;
                System.out.println("Correct!\n");
            } else {
                System.out.println("Incorrect. The correct answer is: " + (questions[i].correctAnswer + 1) + ". " + questions[i].options[questions[i].correctAnswer] + "\n");
            }
        }

        // Display final score
        System.out.println("Quiz Finished!");
        System.out.println("Your score: " + score + " out of " + questions.length);

        scanner.close();
    }
}