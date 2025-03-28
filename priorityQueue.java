import java.util.*;

public class priorityQueue {

    public static class Student{
        String name;
        Integer marks;
        Integer roll_no;
        String dob;
    }

    private static class StudentComparator implements Comparator<Student>{

        public int compare(Student s1, Student s2){
            if(s1.marks > s2.marks){
                return -1;
            }
            else if(s2.marks > s1.marks){
                return 1;
            }
            else{
                if(s1.roll_no > s2.roll_no){
                    return -1;
                }
                if(s1.roll_no < s2.roll_no){
                    return 1;
                }
                else{
                    return 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> studentPriorityQueue = new PriorityQueue<>(new StudentComparator());

        Student harsh = new Student();
        harsh.name = "Harsh";
        harsh.dob = "12-10-2021";
        harsh.roll_no = 14;
        harsh.marks = 97;

        Student raghav = new Student();
        raghav.name = "Raghav";
        raghav.dob = "05-12-2000";
        raghav.roll_no = 18;
        raghav.marks = 97;

        studentPriorityQueue.add(harsh);
        studentPriorityQueue.add(raghav);

        System.out.println(studentPriorityQueue.peek().name);
        System.out.println(studentPriorityQueue.peek().marks);
        System.out.println(studentPriorityQueue.peek().roll_no);


        PriorityQueue<Integer> pq = new PriorityQueue<>();// by default, it works as min heap
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder()); // It will give the answer according to max heap
        pq.add(10);
        pq.add(20);
        pq.add(15);
        pq.add(5);
         System.out.print(pq.peek()); //it gives the top element
        pq.remove();
        
        System.out.print(pq.peek());
        // whether we delete or add any new element in priorityQueue, it will always remain in in heap form and 
        // always give minimum element as top element 

        // Time complexity analysis 
        // Add/Insert = O(logn);
        // Deletion/ remove = O(logn);
        // Peek = O(1);
    }
}
