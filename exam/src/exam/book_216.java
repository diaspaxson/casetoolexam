package exam;

public class book_216 {
	int page_num;
	int total_pages;
	
	book_216(int total_pages)
	{
		this.total_pages=total_pages;
		this.page_num=1;
	}
	int go_forward()
	{
		page_num++;
		return page_num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
