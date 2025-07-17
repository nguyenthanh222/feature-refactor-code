// Code trước khi sửa: 
if (title == null || title.trim().isEmpty()) {
    System.out.println("Lỗi: Tiêu đề không được để trống.");
    return null;
}
if (dueDateStr == null || dueDateStr.trim().isEmpty()) {
    System.out.println("Lỗi: Ngày đến hạn không được để trống.");
    return null;
}
// ... (kiểm tra ngày và ưu tiên)

// Code sau khi sửa: 
private boolean validateTaskInput(String title, String dueDateStr, String priorityLevel) {
    if (title == null || title.trim().isEmpty()) {
        System.out.println("Lỗi: Tiêu đề không được để trống.");
        return false;
    }
    if (dueDateStr == null || dueDateStr.trim().isEmpty()) {
        System.out.println("Lỗi: Ngày đến hạn không được để trống.");
        return false;
    }
    try {
        LocalDate.parse(dueDateStr, DATE_FORMATTER);
    } catch (DateTimeParseException e) {
        System.out.println("Lỗi: Ngày đến hạn không hợp lệ. Vui lòng sử dụng định dạng YYYY-MM-DD.");
        return false;
    }
    String[] validPriorities = {"Thấp", "Trung bình", "Cao"};
    for (String validP : validPriorities) {
        if (validP.equals(priorityLevel)) {
            return true;
        }
    }
    System.out.println("Lỗi: Mức độ ưu tiên không hợp lệ. Vui lòng chọn từ: Thấp, Trung bình, Cao.");
    return false;
}
