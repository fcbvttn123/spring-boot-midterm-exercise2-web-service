package ca.sheridancollege.vutran.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String gender;
	private boolean subscribed;
	private String country;
	private String message; 
}


/*
[
 {
	 "name": "David",
	 "gender": "male", 
	 "subscribed": true,
	 "country": "US", 
	 "message": "abc"
 },
 {
	 "name": "Linda",
	 "gender": "female", 
	 "subscribed": false,
	 "country": "Canada", 
	 "message": "msn"
 }
]
*/
