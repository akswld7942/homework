
public class Movie {
	/*1. ������ 3��( �⺻������ / �Ű����� ������ / �������� �̿��� ������)
    2. ������� title / director / actor / genre / year / age_limit ...
    3. �޼ҵ� getter/setter �����ϰ� 3�� 
    4. main �Լ����� ������ ���� ���̱�*/
	String title; String director; String actor; String genre;
	int year; int age_limit;
	Movie(){ //�⺻������
    	this("�ܿ�ձ�2","����",3,"������","�ִ�",2019);
    }
	Movie(String title, String actor, int age_limit, String director, String genre, int year){ //�Ű����� ������
		this.title=title;
		this.actor=actor;
		this.age_limit=age_limit;
		this.director=director;
		this.genre=genre;
		this.year=year;
	}
	Movie(Movie m){ //�������� �̿��� ������
		this.title=m.title;
		this.actor=m.actor;
		this.age_limit=m.age_limit;
		this.director=m.director;
		this.genre=m.genre;
		this.year=m.year;
	}
	
	
	public static void main(String[] args) {
        
		Movie m1=new Movie();
        Movie m2=new Movie("���� �̸���","�趯��",12,"�Ϻ���","�ִ�",2017);	
        Movie m3=new Movie(m2);
		m1.print();
		m2.print();
		m3.print();
	}
	void print() {
		System.out.println("����: "+title+", �ֿ�: "+"actor"+", ���� ����: "+age_limit+" "
				+", ����: "+director+", �帣: "+genre+", ���� �⵵: "+year);
	}
	

}
