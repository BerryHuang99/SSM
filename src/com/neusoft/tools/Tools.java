package com.neusoft.tools;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

public  class Tools {

	public static  String upload( MultipartFile upload,HttpServletRequest request) throws Exception
	{
		String url = null;
		//1. �ļ��ϴ�
		 //1.1. ������ ʱ���+�ļ��� UUID+�ļ���
		String filename = System.currentTimeMillis()+upload.getOriginalFilename();
		 //1.2    �ļ������� ���ڵ�ǰ����ͬ��Ŀ¼��
		String path = request.getServletContext().getRealPath("/");
		File f = new File(path);
		String ppath = f.getParent();
		
		 //1.3 ��ʱ-��Ŀ��
		File dest = new File(ppath+"\\upload",filename);
			upload.transferTo(dest);
			url = dest.getPath();
		
		
		return url;
		
	}
}
