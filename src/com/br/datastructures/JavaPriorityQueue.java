package com.br.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Priorities {

    PriorityQueue<Student> priorityQueue;

    public Priorities() {
        priorityQueue = new PriorityQueue<>();
    }

    List<Student> getStudents(List<String> events) {
        for (String event : events) {
            String[] ev = event.split(" ");
            if ("ENTER".equals(ev[0])) {
                int id = Integer.parseInt(ev[3]);
                double cgpa = Double.parseDouble(ev[2]);
                priorityQueue.add(new Student(id, ev[1], cgpa));
            } else {
                priorityQueue.poll();
            }
        }

        ArrayList<Student> students = new ArrayList<>();
        while (!priorityQueue.isEmpty())
            students.add(priorityQueue.poll());
        return students;
    }

}

public class JavaPriorityQueue {

    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }

}
