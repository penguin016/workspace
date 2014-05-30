package com.example.musicplayer;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Httpdownloader {

	private URL url = null;
	
	public int downFile(String urlStr, String path, String fileName) {
		InputStream inputStream = null;
		try {
			FileOperation fileoperation = new FileOperation();
			if(fileoperation.isFileExist(path + fileName)) {
				return 1;
			}
			else {
				url = new URL(urlStr);
				try {
				HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
				inputStream = urlConn.getInputStream();
				File resultFile = fileoperation.write2SDFromeInput(path, fileName, inputStream);
				if(resultFile == null)
					return -1;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
	}
}
