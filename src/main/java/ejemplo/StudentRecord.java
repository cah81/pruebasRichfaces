package ejemplo;

import java.util.ArrayList;  
import java.util.List;  
import javax.faces.bean.ManagedBean;  
import javax.faces.bean.RequestScoped;  
@ManagedBean  
@RequestScoped  
public class StudentRecord {  
String id;  
String name;  
String email;  
String contactNumber;  
List<StudentRecord> records;  
public StudentRecord(){}  
public StudentRecord(String id, String name, String email, String contactNumber) {  
this.id = id;  
this.name = name;  
this.email = email;  
this.contactNumber = contactNumber;  
}  
public String getId() {  
return id;  
}  
public void setId(String id) {  
this.id = id;  
}  
public String getName() {  
return name;  
}  
public void setName(String name) {  
this.name = name;  
}  
public String getEmail() {  
return email;  
}  
public void setEmail(String email) {  
this.email = email;  
}  
public String getContactNumber() {  
return contactNumber;  
}  
public void setContactNumber(String contactNumber) {  
this.contactNumber = contactNumber;  
}  
public List<StudentRecord> getRecords() {  
records = new ArrayList<>();  
records.add(new StudentRecord("101", "Raju", "raju@abc.com", "52534252"));  
records.add(new StudentRecord("102", "Rama", "rama@abc.com", "52235252"));  
records.add(new StudentRecord("103", "John", "john@abc.com", "52456252"));  
records.add(new StudentRecord("104", "Peter", "peter@abc.com", "55625252"));  
return records;  
}  
public void setRecords(List<StudentRecord> records) {  
this.records = records;  
}  
public int getNumberOfRecords(){  
return this.records.size();  
}  
}  