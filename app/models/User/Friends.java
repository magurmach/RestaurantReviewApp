package models.User;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import models.FoodItem;
import play.data.validation.Constraints.Required;
import play.db.ebean.Model;
import play.db.ebean.Model.Finder;

@Entity
public class Friends extends Model{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5111881838075011469L;
	
	@Id
	@GeneratedValue
	int id;
	
	@Required
	@OneToMany(fetch=FetchType.LAZY, mappedBy="friends", cascade=CascadeType.ALL)
	User source;
	
	@Required
	int friendUserId;
	
	public static Finder<Integer,Friends> find = 
			new Finder<Integer, Friends> (Integer.class, Friends.class);

	public int getFriendUserId() {
		return friendUserId;
	}

	public void setFriendUserId(int friendUserId) {
		this.friendUserId = friendUserId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getSource() {
		return source;
	}

	public void setSource(User source) {
		this.source = source;
	}
	
	
}
