package com.string;

public class CountWordString {

	public static void main(String[] args) {

		String str = "The Amboyna massacre[1] was the 1623 torture and "
				+ "execution on Ambon Island (present-day Ambon, Maluku,"
				+ " Indonesia) of twenty-one men, including ten of whom "
				+ "were in the service of the English East India Company, "
				+ "and Japanese and Portuguese traders and a Portuguese man,"
				+ "[2] by agents of the Dutch East India Company (VOC), on "
				+ "accusations of treason.[3] It was the result of the"
				+ " intense rivalry between the East India companies of "
				+ "England and the United Provinces in the spice trade and "
				+ "remained a source of tension between the two nations until"
				+ " late in the 17th century. ";
		str = str.trim();

		String[] split = str.split(" ");

		System.out.println("Word in String :" + split.length);

	}

}
