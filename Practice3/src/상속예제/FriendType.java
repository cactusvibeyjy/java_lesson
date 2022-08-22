package 상속예제;

public class FriendType {
	public static void main(String[] args) {
		Artist kim = new Artist("Kim");
		Architect lee = new Architect ("Lee");
		Developer park = new Developer ("Park");
		Lawyer choi = new Lawyer("Choi");
		
		Friend[] friends = {kim, lee, park, choi};
		for(Friend f : friends) {
			f.dearfriend();
		}
	}

}
interface Friend{
	public void dearfriend();
}
class Artist implements Friend{
	private String name;
	public Artist(String name) {
		this.name = name;
	}
	@Override
	public void dearfriend() {	
		System.out.printf("%s->칭구 아이가!\n", name);
	}
	
}
class Architect implements Friend{
	private String name;
	public Architect(String name) {
		this.name = name;
	}

	@Override
	public void dearfriend() {
		System.out.printf("%s->칭구 아이가!\n", name);
	}
	
}
class Developer implements Friend{
	private String name;
	public Developer(String name) {
		this.name = name;
	}

	@Override
	public void dearfriend() {
		System.out.printf("%s->칭구 아이가!\n", name);		
	}
	
}
class Lawyer implements Friend{
	private String name;
	public Lawyer (String name) {
		this.name = name;
	}

	@Override
	public void dearfriend() {
		System.out.printf("%s->칭구 아이가!", name);		
	}
	
}


