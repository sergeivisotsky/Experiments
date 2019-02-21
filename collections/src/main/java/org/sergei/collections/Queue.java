package org.sergei.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Queue {

    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(System.in));
        int answer;
        String yesNoAnswer;
        String element;
        ArrayList<String> queue = new ArrayList<>();
        do {
            System.out.println("1: enQueue");
            System.out.println("2: Show queue");
            System.out.println("3: deQueue");
            System.out.println("4: peek");
            System.out.println("5: size");
            System.out.println("6: isEmpty");
            System.out.print("\nChoose answer: ");
            answer = Integer.parseInt(reader.readLine());
            switch (answer) {
                case 1:
                    System.out.print("Add element: ");
                    element = reader.readLine();
                    queue.add(element);
                    break;
                case 2:
                    if (!queue.isEmpty()) {
                        System.out.println("Created queue: ");
                        for (int i = 0; i <= queue.size() - 1; i++) {
                            System.out.print(queue.get(i) + "\t");
                        }
                    } else {
                        throw new IllegalStateException("queue is empty!");
                    }
                    break;
                case 3:
                    System.out.print("Deletable element: " +
                            queue.remove(0));
                    break;
                case 4:
                    System.out.print("Peeked element: " + queue.get(0));
                    break;
                case 5:
                    if (!queue.isEmpty()) {
                        System.out.println("queue size is: " + queue.size());
                    } else {
                        throw new IllegalStateException("queue is empty!");
                    }
                    break;
                case 6:
                    System.out.println("Empty status: " +
                            queue.isEmpty());
                    break;
                default:
                    throw new IllegalStateException("Illegal state!");
            }
            System.out.print("\nContinue? (y/n) ");
            yesNoAnswer = reader.readLine();
        } while (yesNoAnswer.equals("y") || yesNoAnswer.equals("Y"));
    }
}
