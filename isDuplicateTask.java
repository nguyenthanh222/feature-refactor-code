

private boolean isDuplicateTask(JSONArray tasks, String title, LocalDate dueDate) {
    for (Object obj : tasks) {
        JSONObject existingTask = (JSONObject) obj;
        if (existingTask.get("title").toString().equalsIgnoreCase(title) &&             existingTask.get("due_date").toString().equals(dueDate.format(DATE_FORMATTER)))
        {
            return true;
        }
    }
    return false;
}
