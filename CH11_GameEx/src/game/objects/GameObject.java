package game.objects;

public class GameObject {
	private int id;
	private String name;
	private int[][] comparison = {
							{ 0,	 -1,	 1},
							{ 1,	  0,	-1},
							{-1,	  1,	 0},
	};
	//상대의 (가위,바위,보)와 비교해서 결과 리턴
	public int compareTo(GameObject ob) {
		return comparison[id][ob.id];
	}
	
	protected int getId() { //아이디 수정은 상속한 클래스에서만 사용
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
	
	@Override // 원래 Object의 toString메소드는 주소값을 나타내는데 메소드 오버라이드
	public String toString() {
		return "GameObject [id=" + id + ", name=" + name + "]";
	}
	
}
