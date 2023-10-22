package week3;

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
    private week3.Status taskStatus;

    public TaskItem(int taskId, String taskDescription, week3.Status taskStatus) {
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

    public week3.Status getTaskStatus() {
        return taskStatus;
    }
}

public class Main {
    private List<week3.TaskItem> tasks;

    public Main() {
        tasks = Arrays.asList(
                new week3.TaskItem(1,"Push lab code to the github", week3.Status.TO_DO),
                new week3.TaskItem(2,"Prepare for the quiz", week3.Status.IN_PROGRESS),
                new week3.TaskItem(3,"Go over tasks from lab2", week3.Status.COMPLETED));
    }

    public List<week3.TaskItem> getAllTasks() {
        return tasks;
    }

    public List<week3.TaskItem> getByStatus(week3.Status status) {
        return tasks.stream()
                .filter(task -> task.getTaskStatus() == status)
                .collect(Collectors.toList());
    }

    public List<week3.TaskItem> getTasksWithIdGreaterOrEqual(int id) {
        return tasks.stream()
                .filter(task -> task.getTaskId() >= id)
                .collect(Collectors.toList());
    }

    public void printTaskDescriptions() {
        tasks.forEach(task -> System.out.println(task.getTaskDescription()));
    }

    public static void main(String[] args) {
        week3.Main taskManager = new week3.Main();

        // Get all tasks
        List<week3.TaskItem> allTasks = taskManager.getAllTasks();
        System.out.println("All Tasks:");
        for (week3.TaskItem task : allTasks) {
            System.out.println(task.getTaskId() + ": " + task.getTaskDescription() + " - " + task.getTaskStatus());
        }

        // Get tasks by status
        week3.Status statusToFilter = week3.Status.IN_PROGRESS;
        List<week3.TaskItem> tasksWithStatus = taskManager.getByStatus(statusToFilter);
        System.out.println("\nTasks with status " + statusToFilter + ":");
        for (week3.TaskItem task : tasksWithStatus) {
            System.out.println(task.getTaskId() + ": " + task.getTaskDescription() + " - " + task.getTaskStatus());
        }

        // Get tasks with ID greater or equal to 2
        int idToFilter = 2;
        List<week3.TaskItem> tasksWithId = taskManager.getTasksWithIdGreaterOrEqual(idToFilter);
        System.out.println("\nTasks with ID greater or equal to " + idToFilter + ":");
        for (week3.TaskItem task : tasksWithId) {
            System.out.println(task.getTaskId() + ": " + task.getTaskDescription() + " - " + task.getTaskStatus());
        }

        // Print task descriptions
        System.out.println("\nTask Descriptions:");
        taskManager.printTaskDescriptions();
    }
}


