public class HelloJava {
    public static void main(String[] args) {
        System.out.println("สวัสดี Java!");
        System.out.println("ยินดีต้อนรับสู่การเขียนโปรแกรม Java!");
        
        // แสดงข้อมูลเกี่ยวกับ Java
        System.out.println("\n--- ข้อมูลของ Java ---");
        System.out.println("เวอร์ชัน Java: " + System.getProperty("java.version"));
        System.out.println("ผู้พัฒนา Java: " + System.getProperty("java.vendor"));
        System.out.println("ระบบปฏิบัติการ: " + System.getProperty("os.name"));
        System.out.println("ชื่อผู้ใช้: " + System.getProperty("user.name"));

    }
}
