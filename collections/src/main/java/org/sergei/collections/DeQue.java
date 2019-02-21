package org.sergei.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class DeQue {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        String yesNoAnswer;
        int answer;
        int data;
        try (BufferedReader reader =
                     new BufferedReader(new InputStreamReader(System.in))) {
            int maxSize;
            System.out.println("DeQue implementation using ArrayDeque");
            System.out.print("DeQue maximum size: ");
            maxSize = Integer.parseInt(reader.readLine());
            if (maxSize > 10) {
                throw new IllegalStateException("Size shouldn't be greater than 10!");
            }

            do {
                System.out.println();
                System.out.println("1: Add first");
                System.out.println("2: Add last");
                System.out.println("3: Remove first");
                System.out.println("4: Remove last");
                System.out.println("5: Size");
                System.out.println("6: Empty status");
                System.out.print("\nAnswer: ");
                answer = Integer.parseInt(reader.readLine());

                switch (answer) {
                    case 1:
                        if (deque.size() != maxSize) {
                            System.out.print("\nElement: ");
                            data = Integer.parseInt(reader.readLine());
                            deque.addFirst(data);
                        } else {
                            System.out.println("DeQue is full!");
                        }
                        break;
                    case 2:
                        if (deque.size() != maxSize) {
                            System.out.print("\nElement: ");
                            data = Integer.parseInt(reader.readLine());
                            deque.addLast(data);
                        } else {
                            System.out.println("DeQue is full!");
                        }
                        break;
                    case 3:
                        if (!deque.isEmpty()) {
                            System.out.println("Deletable element: " + deque.removeFirst());
                        } else {
                            System.out.println("DeQue is empty!");
                        }
                        break;
                    case 4:
                        if (!deque.isEmpty()) {
                            System.out.println("\nDeleted element: " + deque.removeLast());
                        } else {
                            System.out.println("DeQue is empty!");
                        }
                        break;
                    case 5:
                        System.out.println("Size: " + deque.size());
                        break;
                    case 6:
                        System.out.println("Empty status: " + deque.isEmpty());
                        break;
                    default:
                        throw new IllegalStateException("Answer doesn't exist!");
                }

                if (!deque.isEmpty()) {
                    System.out.println("\nCreated DeQue: ");
                    for (int element : deque) {
                        System.out.print(element + "\t");
                    }
                } else {
                    throw new IllegalStateException("DeQue is full!");
                }

                System.out.print("\nContinue? (y/n) ");
                yesNoAnswer = reader.readLine();
            } while (yesNoAnswer.equals("Y") ||
                    yesNoAnswer.equals("y"));
        } catch (IOException e) {
            System.out.print("Input/output error!");
        }
    }
}
