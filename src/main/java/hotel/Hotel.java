package hotel;

import java.util.List;

public class Hotel {
	private int hotelId;
	private String hotelName;
	private String hotelLocation;
	private List<User> user;
	public Hotel(int hotelId, String hotelName, String hotelLocation, List<User> user) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.hotelLocation = hotelLocation;
		this.user = user;
	}
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelLocation() {
		return hotelLocation;
	}
	public void setHotelLocation(String hotelLocation) {
		this.hotelLocation = hotelLocation;
	}
	public List<User> getUser() {
		return user;
	}
	public void setUser(List<User> user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelLocation=" + hotelLocation + ", user="
				+ user + "]";
	}
}
