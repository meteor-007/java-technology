package utils;

/**
 * @description: 字符串工具类测试类
 * @author: czwei
 * @create: 2019-01-15 16:25
 */
public class StringUtil {

    public static void main(String[] args) {

        String[] rs = {"!!'","!!(","!!)","!!*"};
        for (int i =0;i<rs.length;i++) {
            rs[i].replace("\\", "\\\\").replace("*", "\\*")
                    .replace("+", "\\+").replace("|", "\\|")
                    .replace("{", "\\{").replace("}", "\\}")
                    .replace("(", "\\(").replace(")", "\\)")
                    .replace("^", "\\^").replace("$", "\\$")
                    .replace("[", "\\[").replace("]", "\\]")
                    .replace("?", "\\?").replace(",", "\\,")
                    .replace(".", "\\.").replace("&", "\\&")
                    .replace("'","\'").replace("\\\"","\"");
            System.out.println(i + ":" + rs[i]);
        }
    }
}
