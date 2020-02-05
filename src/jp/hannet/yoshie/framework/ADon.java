package jp.hannet.yoshie.framework;

abstract class ADon implements IDon {
	abstract String first();
	abstract String second();
	abstract String last();
	
	protected String innerService() {
		String result = "";
		result += this.first();
		result += this.second();
		result += this.last();
		return result;
	}
	
	public String doService() {
		return this.innerService();
	}
}
