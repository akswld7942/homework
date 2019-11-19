
public class Movie {
	/*1. 생성자 3개( 기본생성자 / 매개변수 생성자 / 참조변수 이용한 생성자)
    2. 멤버변수 title / director / actor / genre / year / age_limit ...
    3. 메소드 getter/setter 제외하고 3개 
    4. main 함수에서 구현한 내용 보이기*/
	String title; String director; String actor; String genre;
	int year; int age_limit;
	Movie(){ //기본생성자
    	this("겨울왕국2","엘사",3,"누군가","애니",2019);
    }
	Movie(String title, String actor, int age_limit, String director, String genre, int year){ //매개변수 생성자
		this.title=title;
		this.actor=actor;
		this.age_limit=age_limit;
		this.director=director;
		this.genre=genre;
		this.year=year;
	}
	Movie(Movie m){ //참조변수 이용한 생성자
		this.title=m.title;
		this.actor=m.actor;
		this.age_limit=m.age_limit;
		this.director=m.director;
		this.genre=m.genre;
		this.year=m.year;
	}
	
	
	public static void main(String[] args) {
        
		Movie m1=new Movie();
        Movie m2=new Movie("너의 이름은","김땡땡",12,"일본인","애니",2017);	
        Movie m3=new Movie(m2);
		m1.print();
		m2.print();
		m3.print();
	}
	void print() {
		System.out.println("제목: "+title+", 주연: "+"actor"+", 연령 제한: "+age_limit+" "
				+", 감독: "+director+", 장르: "+genre+", 개봉 년도: "+year);
	}
	

}
