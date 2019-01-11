package util;
/**
 * 随机数类
 */
public class RandomUtil {
	/**
	 * 返回前时间戳作为随机数 13位
	 * @return
	 */
	public static String getRandomNum() {
		String str=String.valueOf(System.currentTimeMillis());
		return str;
	}

}
