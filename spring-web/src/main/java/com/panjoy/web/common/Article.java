package com.panjoy.web.common;

public enum Article {

	SILK(1, "silk"), BOBINET(2, "bobinet"), BURLAP(3, "burlap"), BENARAS(4,
			"benaras"), BATIK(5, "batik"), BATISTE(6, "batiste"), JUTE(7,
			"jute"), JERSEY(8, "jersey"), KNIT(9, "knit");

	private int value;
	private String key;

	private Article(int value, String key) {
		this.value = value;
		this.key = key;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}
