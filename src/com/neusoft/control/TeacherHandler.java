package com.neusoft.control;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.neusoft.po.Teacher;
import com.neusoft.service.TeacherService;
import com.neusoft.tools.FileTools;

@Controller
public class TeacherHandler {

	@Autowired
	private TeacherService teacherService;
	
	@RequestMapping(value="/test/TeacherHandler_findAllTeacher")
	@ResponseBody
	public List<Teacher> findAllBranch() throws Exception{
		return teacherService.findAllTeacher();
	}
	
	@RequestMapping(value="/test/TeacherHandler_findTeacherById")
	@ResponseBody
	public Teacher findTeacherById(int tid) throws Exception{
		return teacherService.findTeacherById(tid);
	}
	
	@RequestMapping(value="/test/TeacherHandler_deleteTeacherById")
	@ResponseBody
	public String deleteTeacherById(int tid) throws Exception{
		if(teacherService.deleteTeacherById(tid)){
			return "{\"result\":true}";
		}else{
			return "{\"result\":false}";
		}
	}
	
	@RequestMapping(value="/test/TeacherHandler_updateTeacher")
	@ResponseBody
	public String updateTeacher(Teacher t) throws Exception{
		if(teacherService.updateTeacher(t)){
			return "{\"result\":true}";
		}else{
			return "{\"result\":false}";
		}
		//return to the findallbranch html
	}
	
	@RequestMapping(value="/test/TeacherHandler_saveTeacher")
	@ResponseBody
	public String saveTeacher(Teacher t) throws Exception{
		if(teacherService.saveTeacher(t)){
			return "{\"result\":true}";
		}else{
			return "{\"result\":false}";
		}
	}
	
	@RequestMapping("/test/TeacherHandler_saveimg")
	@ResponseBody
	public String saveimg(MultipartFile upload,HttpServletRequest request) throws Exception{
		//���ݿ���δ�洢where to save this photo?
		String url=FileTools.saveimg(upload,request);
		if(url!=null){
			return "{\"result\":true}";
		}else{
			return "{\"result\":false}";
		}
	}
	
}
