
public JSONObject addNewTaskWithViolations(String title, String description,
                                            String dueDateStr, String priorityLevel,
                                            boolean isRecurring) {
    JSONObject newTask = new JSONObject();
    newTask.put("is_recurring", isRecurring);
    if (isRecurring) {
        newTask.put("recurrence_pattern", "Chưa xác định");
    }
    // ... (phần còn lại của code)
}


