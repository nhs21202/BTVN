package Library;

public class Books {
	private String ID;
	 private String name;
	 private Author author;
	 private Status status;
	 private int numbers;
	 public Books(String ID, String name, Author author, Status status,int numbers){
		 this.ID = ID;
		 this.name = name;
		 this.author = author;
		 this.status=status;
		 this.numbers=numbers;
	 }
	 public String getID(){
		 return ID;
	 }
	 public String getName(){
		 return name;
	 }
	 public Author getAuthor(){
		 return author;
	 }
	 public Status getStatus(){
		 return status;
	 }
	 public int getNumbers(){
		 return numbers;
	 }
}
