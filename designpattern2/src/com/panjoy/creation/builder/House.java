package com.panjoy.creation.builder;

public class House {
	private String bookroom;
	private String badroom;
	private String cookroom;
	private String wcroom;

	public String getBadroom() {
		return badroom;
	}

	public String getBookroom() {
		return bookroom;
	}

	public String getCookroom() {
		return cookroom;
	}

	public String getWcroom() {
		return wcroom;
	}

	public static class Builder {
		private String bookroom;
		private String badroom;
		private String cookroom;
		private String wcroom;

		public Builder setBookRoom(String bookroom) {
			this.bookroom = bookroom;
			return this;

		}

		public Builder setCoookRoom(String cookroom) {
			this.cookroom = cookroom;
			return this;
		}

		public Builder setBadRoom(String badroom) {
			this.badroom = badroom;
			return this;

		}

		public Builder setWcRoom(String wcroom) {
			this.wcroom = wcroom;
			return this;
		}

		// Ôì·¿×Ó
		public House build() {
			House house = new House();
			house.badroom = this.badroom;
			house.cookroom = this.cookroom;
			house.wcroom = this.wcroom;
			house.bookroom = this.bookroom;

			return house;

		}

		@Override
		public String toString() {
			return "Builder [bookroom=" + bookroom + ", badroom=" + badroom
					+ ", cookroom=" + cookroom + ", wcroom=" + wcroom + "]";
		}
	}

	@Override
	public String toString() {
		return "House [bookroom=" + bookroom + ", badroom=" + badroom
				+ ", cookroom=" + cookroom + ", wcroom=" + wcroom + "]";
	}

}
