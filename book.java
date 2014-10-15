package fei;

public class book {
	private String title;
	private String author;
	private String publishdate;
	private String price;
	
	public String gettitle(){
		return title;
	}
	public String getauthor(){
		return author;
	}
	public String getpublishdate(){
		return publishdate;
	}
	public String getprice(){
		System.out.println("hehe");
		return price;
	}
	public String execute(){
		return "success";
	}
}
