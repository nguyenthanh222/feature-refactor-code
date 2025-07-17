

if (title == null || title.trim().isEmpty()) {
    System.out.println("Lỗi: Tiêu đề không được để trống.");
    return null;
}
if (dueDateStr == null || dueDateStr.trim().isEmpty()) {
    System.out.println("Lỗi: Ngày đến hạn không được để trống.");
    return null;
}
// ... (kiểm tra ngày và ưu tiên)