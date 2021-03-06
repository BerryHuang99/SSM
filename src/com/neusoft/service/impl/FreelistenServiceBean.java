package com.neusoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.mapper.BranchMapper;
import com.neusoft.mapper.FreelistenMapper;
import com.neusoft.po.Freelisten;
import com.neusoft.service.FreelistenService;

@Service
public class FreelistenServiceBean implements FreelistenService {

	@Autowired
	private FreelistenMapper mapper;
	
	@Override
	public List<Freelisten> findAllFreelisten(int qid) throws Exception {
		return mapper.findAllFreelisten(qid);
	}

	@Override
	public Freelisten findFreelistenById(int fid) throws Exception {
		return mapper.findFreelistenById(fid);
	}

	@Override
	public boolean deleteFreelistenById(int fid) throws Exception {
		boolean isok=false;
		int result=mapper.deleteFreelistenById(fid);
		if(result>0){
			isok=true;
		}else{
			isok=false;
		}
		return isok;
	}

	@Override
	public boolean saveFreelisten(Freelisten freelisten) throws Exception {
		boolean isok=false;
		int result=mapper.saveFreelisten(freelisten);
		if(result>0){
			isok=true;
		}else{
			isok=false;
		}
		return isok;
	}

	@Override
	public boolean updateFreelisten(Freelisten freelisten) throws Exception {
		boolean isok=false;
		int result=mapper.updateFreelisten(freelisten);
		if(result>0){
			isok=true;
		}else{
			isok=false;
		}
		return isok;
	}

}
