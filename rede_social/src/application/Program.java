package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		
		Comment comment1 = new Comment("Have a nice trip");
		Comment comment2 = new Comment("Wow that's awesome!");
		
		List<Comment> commentList1 = new ArrayList<>();
		
		commentList1.add(comment1);
		commentList1.add(comment2);
		
		Comment comment3 = new Comment("Good night");
		Comment comment4 = new Comment("May the Force be with you");
		
		List<Comment> commentList2 = new ArrayList<>();
		
		commentList2.add(comment3);
		commentList2.add(comment4);
		

		Post post1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
		post1.addComment(comment1);
		post1.addComment(comment2);
		
		Post post2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorrow", 5);
		post2.addComment(comment3);
		post2.addComment(comment4);
		
		System.out.println(post1.toString());
		System.out.println("");
		System.out.println(post2.toString());
		
		
	}

}
