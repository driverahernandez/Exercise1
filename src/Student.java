import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    static Scanner scanner = new Scanner(System.in);
    private final String name;
    private final String grade;
    private final int signaturesNumber;
    List<String> signatures = new ArrayList<String>();
    List<Double> scores = new ArrayList<Double>();
    private double average;

    public Student() {
        System.out.println("Please enter your name:");
        this.name = scanner.nextLine();
        System.out.println("Please enter your grade:");
        this.grade = scanner.nextLine();

        System.out.println("Please enter the number of signatures to enroll:");
        this.signaturesNumber = scanner.nextInt();
        scanner.nextLine();
        for(int i=0; i<this.signaturesNumber;i++){
            System.out.printf("Please enter the name of signature %d:", i+1);
            String newSignature = scanner.nextLine();
            signatures.add(newSignature);
            System.out.printf("Please enter the score for %s:", newSignature);
            scores.add(scanner.nextDouble());
            scanner.nextLine();
        }
        System.out.println("All signatures and scores recorded.\n");
    }

    public String getName() {return name;}
    public String getGrade() {return grade;}
    public int getSignaturesNumber() {return signaturesNumber;}
    public List<String> getSignatures() {return signatures; }
    public List<Double> getScores() {return scores;}
    public double getAverage() {return average;}

    public static void startStudent(){
        Student student = new Student();
        student.calculateAverage(student.getSignaturesNumber());
        student.printReport();
    }

    public void calculateAverage(int signaturesNumber){
        List<Double> scores = getScores();
        this.average = scores.stream()
                        .mapToDouble(a -> a/signaturesNumber)
                        .sum();
            }

    public void printReport(){
        System.out.println("--------------------------------------------------------------");
        System.out.printf("Student name: %-20s \t\t\t\tGrade: %s\n",getName(), getGrade());
        System.out.println("--------------------------------------------------------------");
        signatures = getSignatures();
        scores = getScores();
        for(int i=0;i<getSignaturesNumber();i++){
                System.out.printf("\t\tSignature: %-15s", signatures.get(i));
                System.out.print("\t\t\t\t");
                System.out.printf("Score: %.1f\n", scores.get(i));
                }
        System.out.println("--------------------------------------------------------------");
        System.out.printf("Final average: %.2f", getAverage());
        System.out.printf("\t\t\t\tStatus: %s\n", getAverage()>6.0 ? "Passed with good level":"Did not pass.");
    }
}
