package com.zc.common.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileUtil {
	/**
	 * 保存文件
	 * @param is
	 * @param fileName
	 * @param dir
	 * @return
	 * @throws IOException
	 */
	public static final String saveFile(InputStream is, String fileName, String dir) throws IOException {
		FileOutputStream fos = null;
		byte[] buff = new byte[1024];
		int len = 0;
		File file = new File(dir + File.separator + fileName);
		try {
			fos = new FileOutputStream(file);
			while((len = is.read(buff)) != -1) {
				fos.write(buff, 0, len);
			}
			return file.getAbsolutePath();
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (Exception e) {
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (Exception e) {
				}
			}
		}
	}
}
