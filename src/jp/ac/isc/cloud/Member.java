package jp.ac.isc.cloud;

public class Member {
	private String id;		//user_tableのidを格納する
	private String name;	//user_tableのnameを格納する
	private String picture;	//user_tableのpictureを格納する

	//user_tableのid、nameが渡される
	public Member(String id, String name,String picture) {
		this.id = id;
		this.name = name;
<<<<<<< HEAD
		this.picture = picture ;
=======
		this.picture = picture;
>>>>>>> b34f53ea79c7a16c02ac7e1015fe587fb02b5863
	}
	//idを返す
	public String getId() {
		return id;
	}
	//idをセットする
	public void setId(String id) {
		this.id = id;
	}
	//nameを返す
	public String getName() {
		return name;
	}
	//nameをセットする
	public void setName(String name) {
		this.name = name;
	}
	//pictureを返す
	public String getPicture() {
		return picture;
	}
	//pictureをセットする
	public void setPicture(String picture) {
		this.picture = picture;
	}
}
