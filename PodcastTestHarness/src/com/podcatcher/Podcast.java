package com.podcatcher;

/**
 * This class represents a Podcast.
 *
 * This is our first example of a Java (domain) class.
 *
 * @version 1.0, 2/3/2026
 * @author Eric Staggs
 */
public class Podcast {

	private String title = "";
	private String producer = "";
	private int followers = 0;
	private boolean allContentFree = false;

	public Podcast(String title, String producer, int follows, boolean free) {
		this.title = title;
		this.producer = producer;
		this.allContentFree = free;
		this.followers = follows;
	}

	public Podcast(String title, String producer) {

	}
	
	/**
	 * prints usable information
	 */
	@Override
	public String toString() {
		return this.title + " " + this.producer + " " + this.followers + " " + this.allContentFree;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the producer
	 */
	public String getProducer() {
		return producer;
	}

	/**
	 * @param producer the producer to set
	 */
	public void setProducer(String producer) {
		this.producer = producer;
	}

	/**
	 * @return the followers
	 */
	public int getFollowers() {
		return followers;
	}

	/**
	 * @param followers the followers to set
	 */
	public void setFollowers(int followers) {
		this.followers = followers;
	}

	/**
	 * @return the allContentFree
	 */
	public boolean isAllContentFree() {
		return allContentFree;
	}

	/**
	 * @param allContentFree the allContentFree to set
	 */
	public void setAllContentFree(boolean allContentFree) {
		this.allContentFree = allContentFree;
	}
}
