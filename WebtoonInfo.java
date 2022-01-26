
public class WebtoonInfo {
	private String title;// 제목
	private String writer;	// 작가
	private String openDay;// 연재일
	
	public WebtoonInfo(String title, String writer, String openDay) {
		super();
		this.title = title;
		this.writer = writer;
		this.openDay = openDay;
	}
	public String getTitle() {
		return title;
	}
	public String getWriter() {
		return writer;
	}
	public String getOpenDay() {
		return openDay;
	}
	
	
}
