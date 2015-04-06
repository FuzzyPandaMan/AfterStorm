package goodGroupd.AfterStormBackEnd;

import org.mongodb.morphia.annotations.Entity;
import java.util.ArrayList;

@Entity(noClassnameStored=true)
public class EntryInformation {

	private String primaryName;
	
	private String address;
		
	private int zipCode;
	
	private String phoneNumber;
		
	private ArrayList<String> otherPeople;
	
	private boolean critical;
	
	private String comments;
	

	public EntryInformation(String name, String address, int zipCode, String phoneNumber, String comments ){
		
		this.primaryName = name;
		this.address = address;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		this.comments = comments;
		
	}
	
	public EntryInformation(String name, String address, int zipCode, String phoneNumber, String comments, ArrayList<String> additionalPeople ){
		
		this.primaryName = name;
		this.address = address;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		this.comments = comments;
		this.otherPeople = additionalPeople;
	}
	
	public void isCritical(boolean criticalStatus){
		this.critical = criticalStatus;
	}
}