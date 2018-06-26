package com.neusoft.control;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.neusoft.po.Teacher;
import com.neusoft.service.TeacherService;

@Controller
public class TeacherHandler {

	@Autowired
	private TeacherService teacherService;
	
	@RequestMapping(value="/test/TeacherHandler_findAllTeacher")
	@ResponseBody
	public List<Teacher> findAllBranch(){
		return teacherService.findAllTeacher();
	}
	
	@RequestMapping(value="/test/TeacherHandler_findTeacherById")
	@ResponseBody
	public Teacher findTeacherById(int tid){
		return teacherService.findTeacherById(tid);
	}
	
	@RequestMapping(value="/test/TeacherHandler_deleteTeacherById")
	@ResponseBody
	public String deleteTeacherById(int tid){
		if(teacherService.deleteTeacherById(tid)){
			return "{\"result\":true}";
		}else{
			return "{\"result\":false}";
		}
	}
	
	@RequestMapping(value="/test/TeacherHandler_updateTeacher")
	@ResponseBody
	public String updateTeacher(Teacher t){
		if(teacherService.updateTeacher(t)){
			return "{\"result\":true}";
		}else{
			return "{\"result\":false}";
		}
		//return to the findallbranch html
	}
	
	@RequestMapping(value="/test/TeacherHandler_saveTeacher")
	@ResponseBody
	public String saveTeacher(Teacher t){
		if(teacherService.saveTeacher(t)){
			return "{\"result\":true}";
		}else{
			return "{\"result\":false}";
		}
	}
	
	@RequestMapping("/test/TeacherHandler_saveimg")
	@ResponseBody
	public String uploadajax(String username,String pwd,MultipartFile upload,HttpServletRequest request){
		//1.�ļ��ϴ�
		//1.1 ������ ʱ���+�ļ���/UUID+�ļ���  ʱ���:��ǰϵͳʱ�����1970��ʱ��ԭ���ܵĺ�����
		String filename=System.currentTimeMillis()+upload.getOriginalFilename();
		//1.2 �ļ�������ǰ���̵�ͬ��Ŀ¼��
		String path=request.getServletContext().getRealPath("/");
		File f =new File(path);
		String ppath=f.getParent();
		//1.3 ��ʱ�ļ�������Ŀ���ַ�� '/'�κβ���ϵͳ����ʶ
		File dest=new File(ppath+"/upload",filename);
		try {
			upload.transferTo(dest);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			System.out.println("1");
			e.printStackTrace();
			return "{\"result\":false}";
		} catch (IOException e) {
			System.out.println("2");
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "{\"result\":false}";
		}
		return "{\"result\":true}";
	}
	
}
