public class Array2 {
    String studentName;
    int rollNo;
    int marks;

    public static void main (String args[]){
    Array2 s1 = new Array2();
    s1.studentName = "John";
    s1.rollNo = 101;
    s1.marks = 85;
    Array2 s2 = new Array2();
    s2.studentName = "Jane";
    s2.rollNo = 102;
    s2.marks = 90;
    Array2 s3 = new Array2();
    s3.studentName = "Bob";
    s3.rollNo = 103;
    s3.marks = 75;

    Array2 students[] = new Array2[3];
    students[0] = s1;
    students[1] = s2;
    students[2] = s3;

    

    for(int i=0; i<students.length; i++){
        System.out.println(students[i].studentName + " " + students[i].rollNo + " " + students[i].marks);
    }

}
}
