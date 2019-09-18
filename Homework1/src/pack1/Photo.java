package pack1;

public class Photo {
	protected int photoID;
	protected String PhotoName;
	
	public Photo(int photoID, String photoName) {
		super();
		this.photoID = photoID;
		this.PhotoName = photoName;
	}
	
	public Photo() {
		this.photoID = 0;
		this.PhotoName = null;
	}
	
	public int getPhotoID() {
		return photoID;
	}
	public void setPhotoID(int photoID) {
		this.photoID = photoID;
	}
	public String getPhotoName() {
		return PhotoName;
	}
	public void setPhotoName(String photoName) {
		PhotoName = photoName;
	}
	
	@Override
	public String toString() {
		return "Photo [photoID=" + photoID + ", PhotoName=" + PhotoName + "]";
	}
	
}
