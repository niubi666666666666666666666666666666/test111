/**
 * @author: rpy
 * @date: 2026/3/26 16:12
 * @Description: version: 1.0
 */
public class test111 {

    // 打印问候语
    public static void sayHello(String name) {
        System.out.println("Hello, " + name + "! 今天也要好好写代码～");
    }

    // 计算两个整数的和
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // 示例：打印一句话
        sayHello("Haoyang");

        // 示例：做个简单运算1111
        int x = 3;
        int y = 5;
        int sum = add(x, y);
        System.out.println(x + " + " + y + " = " + sum);
    }
}
