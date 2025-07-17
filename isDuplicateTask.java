// Code trước khi sửa: 
for (Object obj : tasks) {
    JSONObject existingTask = (JSONObject) obj;
if (existingTask.get("title").toString().equalsIgnoreCase(title) &&  existingTask.get("due_date").toString().equals(dueDate.format(DATE_FORMATTER)))

    {
        System.out.println(String.format("Lỗi: Nhiệm vụ '%s' đã tồn tại với cùng ngày đến hạn.", title));
        return null;
    }
}
// Code sau khi sửa: 
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
