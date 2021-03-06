package lee;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> 
 * <br/>Copyright (C), 2001-2010, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class GetBooksAction implements Action
{
	//该属性并不用于封装用户请求参数，而用于封装Action需要输出到JSP页面的信息
	private String[] books;
	//books属性的setter方法
	public void setBooks(String[] books)
	{	
		System.out.println(books);
		this.books = books;
	}
	//books属性的getter方法
	public String[] getBooks()
	{
		return books;
	}
	//处理用户请求的execute方法
	public String execute() throws Exception
	{
		//获取Session中的user属性
		String user = (String)ActionContext.getContext()
			.getSession().get("user");
		//如果user属性不为空，且该属性值为crazyjava
		if (user != null && user.equals("crazyjava"))
		{
			//创建BookService实例
			BookService bs = new BookService();
			//将业务逻辑组件的返回值设置成该Action的属性
			setBooks(bs.getLeeBooks());
			return SUCCESS;
		}
		else
		{
			return LOGIN;
		}
	}
}