


public JSONObject addNewTask(String title, String description, String dueDateStr, String priorityLevel) {
    if (!validateTaskInput(title, dueDateStr, priorityLevel)) {
        return null;
    }
    LocalDate dueDate = LocalDate.parse(dueDateStr, DATE_FORMATTER);
    JSONArray tasks = loadTasksFromDb();
    if (isDuplicateTask(tasks, title, dueDate)) {
        System.out.println(String.format("Lỗi: Nhiệm vụ '%s' đã tồn tại với cùng ngày đến hạn.", title)); 
return null; 
}
JSONObject newTask = createTask(title, description, dueDate, priorityLevel);
tasks.add(newTask); saveTasksToDb(tasks);
System.out.println(String.format("Đã thêm nhiệm vụ mới thành công với ID: %s", newTask.get("id")));
return newTask;
}
