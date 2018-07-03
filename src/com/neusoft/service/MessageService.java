package com.neusoft.service;

import java.util.List;

import com.neusoft.po.Message;
import com.neusoft.po.Messagereply;

public interface MessageService {

	

	public List<Message>  findAllMessage() throws Exception;
	public List<Messagereply> findAllMessagereply() throws Exception;
	public boolean updateMessage(Message message) throws Exception;
	public boolean deleteMessage(int mid) throws Exception;
	public boolean deleteMessagereply(int id) throws Exception;
	//public boolean updateIndexphoto():�Ƿ�Ҫ����ҳ��Ƭ�浽ĳ����ַ��
	
	/*public List<Messagelike> findAllMessagelike() throws Exception; ��ǰ�˹�������������
	  public boolean saveMessagelike(Message) ǰ����Ҫ
	  public boolean saveMessagereply(Messagereply) ǰ����Ҫ 
	*/
}
