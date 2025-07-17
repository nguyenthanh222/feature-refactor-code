
private JSONObject createTask(String title, String description, LocalDate dueDate, String priorityLevel) {
    String taskId = UUID.randomUUID().toString();
    JSONObject newTask = new JSONObject();
    newTask.put("id", taskId);
    newTask.put("title", title);
    newTask.put("description", description);
    newTask.put("due_date", dueDate.format(DATE_FORMATTER));
    newTask.put("priority", priorityLevel);
    newTask.put("status", "Chưa hoàn thành");
    newTask.put("created_at", LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
    newTask.put("last_updated_at", LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
    return newTask;
}
