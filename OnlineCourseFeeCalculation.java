import java.util.Scanner;

abstract class Course {
    double courseFee;

    Course(double courseFee) {
        this.courseFee = courseFee;
    }

    abstract double calculateDiscount();

    abstract String getCourseType();

    double calculateFinalFee() {
        return courseFee - calculateDiscount();
    }
}

class ProgrammingCourse extends Course {
    ProgrammingCourse(double fee) {
        super(fee);
    }

    @Override
    double calculateDiscount() {
        return courseFee * 10 / 100;
    }

    @Override
    String getCourseType() {
        return "Programming";
    }
}

class DataScienceCourse extends Course {
    DataScienceCourse(double fee) {
        super(fee);
    }

    @Override
    double calculateDiscount() {
        return courseFee * 15 / 100;
    }

    @Override
    String getCourseType() {
        return "Data Science";
    }
}

class CloudCourse extends Course {
    CloudCourse(double fee) {
        super(fee);
    }

    @Override
    double calculateDiscount() {
        return courseFee * 5 / 100;
    }

    @Override
    String getCourseType() {
        return "Cloud";
    }
}

public class OnlineCourseFeeCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int type = sc.nextInt();
        double fee = sc.nextDouble();

        Course course;

        if (type == 1) {
            course = new ProgrammingCourse(fee);
        } else if (type == 2) {
            course = new DataScienceCourse(fee);
        } else {
            course = new CloudCourse(fee);
        }

        System.out.println("Course Type: " + course.getCourseType());
        System.out.printf("Discount: %.2f%n", course.calculateDiscount());
        System.out.printf("Final Fee: %.2f%n", course.calculateFinalFee());

        sc.close();
    }
}