package lee;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a> 
 * <br/>Copyright (C), 2001-2010, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */

//ʵ��Action�ӿ���ʵ��Struts 2��Action��
public class LoginAction implements Action
{
	//������Action�����ڷ�װ�û������������������
	private String username;
	private String password;
	//username���Ե�getter��setter����
	public String getUsername()
	{
		System.out.prinln(name);
		return username;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
	//password���Ե�getter��setter����
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	//�����û������execute����
	public String execute() throws Exception
	{
		//���û����������username����crazyjava�������������Ϊleegangʱ��
		//����success�ַ��������򷵻�error�ַ���
		if (getUsername().equals("crazyjava")
			&& getPassword().equals("leegang"))
		{
			//ͨ��ActionContext�������WebӦ�õ�HTTP Session
			ActionContext.getContext().getSession()
				.put("user" , username);
			return SUCCESS;
		}
		else
		{
			return ERROR;
		}
	}
}