package com.prev;
import java.util.*;
class Process {
    int arrivalTime;
    int burstTime;
    int remainingTime;
    int waitingTime;
    int turnaroundTime;
  
    public Process(int arrivalTime, int burstTime) {
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.waitingTime = 0;
        this.turnaroundTime = 0;
    }


    public static void main(String[] args) {
        // Create a list of processes
        List<Process> processes = new ArrayList<>();
        processes.add(new Process(0, 5));
        processes.add(new Process(1, 3));
        processes.add(new Process(2, 8));
        processes.add(new Process(3, 4));
      
        // Sort the processes based on arrival time
        Collections.sort(processes, Comparator.comparingInt(p -> p.arrivalTime));
      
        // Create a priority queue to store the processes based on remaining time
        PriorityQueue<Process> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.remainingTime));
      
        int currentTime = 0;
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;
        int completedProcesses = 0;
      
        // Process the tasks until all processes are completed
        while (completedProcesses < processes.size()) {
            // Check for new arriving processes
            for (Process process : processes) {
                if (process.arrivalTime == currentTime) {
                    pq.offer(process);
                }
            }
          
            // Get the process with the shortest remaining time
            Process currentProcess = pq.poll();
          
            // Execute the process for 1 unit of time
            currentProcess.remainingTime--;
            currentTime++;
          
            // Check if the process is completed
            if (currentProcess.remainingTime == 0) {
                completedProcesses++;
              
                // Calculate waiting time and turn around time
                currentProcess.turnaroundTime = currentTime - currentProcess.arrivalTime;
                currentProcess.waitingTime = currentProcess.turnaroundTime - currentProcess.burstTime;
              
                // Update total waiting time and total turn around time
                totalWaitingTime += currentProcess.waitingTime;
                totalTurnaroundTime += currentProcess.turnaroundTime;
            } else {
                // Process is not completed, add
            }
}
}
}
