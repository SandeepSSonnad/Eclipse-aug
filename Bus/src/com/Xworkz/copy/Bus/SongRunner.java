package com.Xworkz.copy.Bus;

public class SongRunner {

	public static void main(String[] args) {
		
		Song Details=new Song();
		System.out.println("Printing The Default Values");
		System.out.println(Details.Name);
		System.out.println(Details.Language);
		System.out.println(Details.Singer);
		System.out.println(Details.Lyrics);
		System.out.println(Details.Type);
		
		Details.Name="Kesariya";
		Details.Language="Kannada";
		Details.Singer="Sanjit Hegde";
		Details.Lyrics="Kumar";
		Details.Type="Romantic";
		
		System.out.println("Printing All Instance values");
		System.out.println(Details.Name);
		System.out.println(Details.Language);
		System.out.println(Details.Singer);
		System.out.println(Details.Lyrics);
		System.out.println(Details.Type);

	}

}
