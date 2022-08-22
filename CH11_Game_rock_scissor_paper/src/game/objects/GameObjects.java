package game.objects;

public class GameObjects {
	private int id;
	private String name;
	private int [] [] comparison = {
			{0, -1, 1},
			{1, 0, -1},
			{-1, 1, 0}
	};

	
	protected int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "GameObjects [id=" + id + ", name=" + name + "]";
	}
	//이겼을때 1 졌을때 -1 비겼을때 0으로 리턴
	public int compareTo(GameObjects ob) {
		return comparison[id][ob.id];//내 객체 id와 다른 객체 id를 비교해서 리턴
		
	}
	
	
}
