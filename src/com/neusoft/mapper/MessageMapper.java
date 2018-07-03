package com.neusoft.mapper;

import java.util.Date;
import java.util.List;

import com.neusoft.po.Message;
import com.neusoft.po.Messagelike;
import com.neusoft.po.Messagereply;

public interface MessageMapper {
	
	/*message
	 * private int mid;
	private String mtitle;
	private Date mtime;
	private int qid;
	
	messagelike
	private int id;
	private int mid;
	private String nickname;
	private Date stime;
	
	messageReply
	private int id;
	private int mid;
	private String content;
	private String nickname;
	*/
	
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
