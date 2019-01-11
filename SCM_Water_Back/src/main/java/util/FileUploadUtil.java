package util;

import java.io.File;
import java.io.IOException;
import org.springframework.web.multipart.MultipartFile;

public class FileUploadUtil {

	public static void uploadFile(MultipartFile pic,String filePath01 ,String filePath02) throws IOException {
		File file = new File(filePath01);
		if (!file.exists()) {
			file.mkdirs();
		}
		pic.transferTo(new File(filePath02));
	}
}
