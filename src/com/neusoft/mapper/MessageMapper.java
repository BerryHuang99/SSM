package com.neusoft.mapper;

import java.util.List;

import com.neusoft.po.Message;
import com.neusoft.po.Messagereply;

public interface MessageMapper {
	
	public List<Message> findAllMessage() throws Exception;
	public Message findMessageById(int mid) throws Exception;
	public int updateMessage(Message message) throws Exception;
	public int deleteMessage(int mid) throws Exception;
	public List<Messagereply> findMessagereplyById(int mid) throws Exception;
	public int deleteMessagereply(int id) throws Exception;
	
	//public boolean updateIndexphoto():�Ƿ�Ҫ����ҳ��Ƭ�浽ĳ����ַ��
	/*public List<Messagelike> findAllMessagelike() throws Exception; ��ǰ�˹�������������
	  public boolean saveMessagelike(Message) ǰ����Ҫ
	  public boolean saveMessagereply(Messagereply) ǰ����Ҫ 
	*/
}