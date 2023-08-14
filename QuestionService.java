import java.util.Scanner;

public class QuestionService {

    Question[] question = new Question[10];

    String selection[] = new String[10]; 

    public QuestionService() {

        question[0] = new Question(1, "JDK stands for____?", 
        "Java development kit",
        "Java deployment kit        ", 
        "None of these",
        "JavaScript deployment kit", 
        "Java development kit");

        question[1] = new Question(2, "JRE stands for ___.", 
        "JDK runtime Environment",
        "Java run ecosystem", 
        "None of these",
        "Java Runtime Environment", 
        "Java Runtime Environment");

        question[2] = new Question(3, "What makes the Java platform independent?", 
        "Advanced programming language",
        "It uses bytecode for execution", 
        "Class compilation",
        "All of these", 
        "It uses bytecode for execution");

        question[3] = new Question(4, "Can we keep a different name for the java class name and java file name?", 
        "Yes",
        "No", 
        "None",
        "None", 
        "Yes");

        question[4] = new Question(5, "What are the types of memory allocated in memory in java?", 
        "Heap memory",
        "Stack memory", 
        "None of these",
        "Both A and B", 
        "Both A and B");

        question[5] = new Question(6, "Multiline comment is created using ___.", 
        "//",
        "/* */", 
        "<!--  -- >",
        "All of these", 
        "/* */");

        question[6] = new Question(7, "What is the entry point of a program in Java?", 
        "main() method",
        "The first line of code", 
        "Last line of code",
        "main class", 
        "main() method");

        question[7] = new Question(8, "Which keyword in java is used for exception handling?", 
        "exep",
        "excepHand", 
        "throw",
        "All of these", 
        "throw");

        question[8] = new Question(9, "Which class in Java is used to take input from the user?", 
        "Scanner",
        "Input", 
        "Applier",
        "None of these", 
        "Scanner");

        question[9] = new Question(10, "Method used to take a string as input in Java?", 
        "next()",
        "nextLine()", 
        "Both A. and B.",
        "Non of these", 
        "Java development kit");
    }
    
    public void PlayQuiz(){

        int i = 0;
        for (Question q : question){
            System.out.println("Question No " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;

        }
        
        for (String s : selection) {
            
            System.out.println(s);
        }
    }

    public void printScore(){

        int score = 0;

        for(int i = 0; i < question.length; i++){
        
            Question que = question[i];
            String Answer = que.getAnswer();

            String userAnswer = selection[i];

            if (Answer == userAnswer){
                score++;
            }

        }

        System.out.println("Your Score is : "+ score);
    }
}
