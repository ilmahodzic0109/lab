package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

enum Status {
    TO_DO,
    IN_PROGRESS,
    COMPLETED,
    CANCELLED
}

class TaskItem {
    private int taskId;
    private String taskDescription;
    private org.example.Status taskStatus;

    public TaskItem(int taskId, String taskDescription, org.example.Status taskStatus) {
        this.taskId = taskId;
        this.taskDescription = taskDescription;
        this.taskStatus = taskStatus;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public org.example.Status getTaskStatus() {
        return taskStatus;
    }
}

public class Main {
    private List<org.example.TaskItem> tasks;

    public Main() {
        tasks = Arrays.asList(
                new org.example.TaskItem(1,"Push lab code to the github", org.example.Status.TO_DO),
                new org.example.TaskItem(2,"Prepare for the quiz", org.example.Status.IN_PROGRESS),
                new org.example.TaskItem(3,"Go over tasks from lab2", org.example.Status.COMPLETED));
    }

    public List<org.example.TaskItem> getAllTasks() {
        return tasks;
    }

    public List<org.example.TaskItem> getByStatus(org.example.Status status) {
        return tasks.stream()
                .filter(task -> task.getTaskStatus() == status)
                .collect(Collectors.toList());
    }

    public List<org.example.TaskItem> getTasksWithIdGreaterOrEqual(int id) {
        return tasks.stream()
                .filter(task -> task.getTaskId() >= id)
                .collect(Collectors.toList());
    }

    public void printTaskDescriptions() {
        tasks.forEach(task -> System.out.println(task.getTaskDescription()));
    }

    public static void main(String[] args) {
        org.example.Main taskManager = new org.example.Main();

        // Get all tasks
        List<org.example.TaskItem> allTasks = taskManager.getAllTasks();
        System.out.println("All Tasks:");
        for (org.example.TaskItem task : allTasks) {
            System.out.println(task.getTaskId() + ": " + task.getTaskDescription() + " - " + task.getTaskStatus());
        }

        org.example.Status statusToFilter = org.example.Status.IN_PROGRESS;
        List<org.example.TaskItem> tasksWithStatus = taskManager.getByStatus(statusToFilter);
        System.out.println("\nTasks with status " + statusToFilter + ":");
        for (org.example.TaskItem task : tasksWithStatus) {
            System.out.println(task.getTaskId() + ": " + task.getTaskDescription() + " - " + task.getTaskStatus());
        }

        int idToFilter = 2;
        List<org.example.TaskItem> tasksWithId = taskManager.getTasksWithIdGreaterOrEqual(idToFilter);
        System.out.println("\nTasks with ID greater or equal to " + idToFilter + ":");
        for (org.example.TaskItem task : tasksWithId) {
            System.out.println(task.getTaskId() + ": " + task.getTaskDescription() + " - " + task.getTaskStatus());
        }

        System.out.println("\nTask Descriptions:");
        taskManager.printTaskDescriptions();
    }
}
